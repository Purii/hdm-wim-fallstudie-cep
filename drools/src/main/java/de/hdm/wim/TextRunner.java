package de.hdm.wim;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.drools.core.time.impl.PseudoClockScheduler;
import org.kie.api.runtime.KieSession;

/**
 * The Class TextRunner.
 */
public class TextRunner {
	private List<List<String>> texts;
	
	/**
	 * Insert and fire.
	 *
	 * @param kSession the k session
	 * @param token the token
	 */
	private static void insertAndFire(KieSession kSession, String token) {
		PseudoClockScheduler clock = kSession.getSessionClock();
		
		// Force LowerCase
		final Event t = new Event(token.toLowerCase());
		kSession.insert(t);
		
		clock.advanceTime(2, TimeUnit.SECONDS);
		
		kSession.fireAllRules();
	}
	
	/**
	 * Insert and fire lifecycle.
	 *
	 * @param kSession the k session
	 * @param token the token
	 */
	private static void insertAndFireLifecycle(KieSession kSession, String token) {
		kSession.insert(new LifecycleEvent(token));
		kSession.fireAllRules();
	}
    
	/**
	 * Run all text arrays.
	 *
	 * @param kSession the k session
	 */
	public void runAllTextArrays(KieSession kSession) {
		this.texts.stream().forEach(text -> {
			System.out.println("-----------");
			insertAndFireLifecycle(kSession, "start");
			System.out.println("Person: " + text.toString());
			System.out.print("System: ");
			text.stream().forEach(token -> { insertAndFire(kSession, token); });
			insertAndFireLifecycle(kSession, "end");
		});
	}

	/**
	 * Sets the texts.
	 *
	 * @param textsList the texts to set
	 */
	public void setTexts(List<List<String>> textsList) {
		this.texts = textsList;
	}
}
