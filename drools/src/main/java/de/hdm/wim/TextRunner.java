package de.hdm.wim;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.drools.core.time.impl.PseudoClockScheduler;
import org.kie.api.runtime.KieSession;

public class TextRunner {
	private List<List<String>> texts;

	
    private static void insertAndFire(KieSession kSession, String token) {
    	PseudoClockScheduler clock = kSession.getSessionClock();
    	
    	final Event t = new Event(token);
		kSession.insert(t);
		
		clock.advanceTime(2, TimeUnit.SECONDS);
		
		kSession.fireAllRules();
    }
    
    private static void insertAndFireLifecycle(KieSession kSession, String token) {
    	kSession.insert(new LifecycleEvent(token));
 	    kSession.fireAllRules();
    }
    
	
	public void runAllTextArrays(KieSession kSession) {
		this.texts.stream().forEach(text -> {
			insertAndFireLifecycle(kSession, "start");
			text.stream().forEach(token -> { insertAndFire(kSession, token); });
			insertAndFireLifecycle(kSession, "end");
		});
	}
	
	public void runTextArray() {}

	/**
	 * @param textsList the texts to set
	 */
	public void setTexts(List<List<String>> textsList) {
		this.texts = textsList;
	}
}
