package de.hdm.wim;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.drools.core.time.impl.PseudoClockScheduler;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

public class HelloFusion {

	public static final void main(String[] args) {
            // load up the knowledge base
	        KieServices ks = KieServices.Factory.get();
    	    KieContainer kContainer = ks.getKieClasspathContainer();
    	    // Config in kmodule.xml
    	    KieSession kSession = kContainer.newKieSession();
    	    
    	    List<String> tokens = Arrays.asList("current activities", "blabla", "blablaBefore", "concerning", "HighNet", "blablaNext", "blablaNext2", "blablaNext3");
    	    List<String> tokens2 = Arrays.asList("blabla", "make appointment", "blabla","about", "new contract", "tomorrow" );
    	    List<String> tokens3 = Arrays.asList("blabla", "set deadline", "blabla","for debugging", "Wednesday" );

    	    	
    	    insertAndFireLifecycle(kSession, "start");
    	   
    	    tokens.stream().forEach(token -> { insertAndFire(kSession, token); });
    	    
    	    insertAndFireLifecycle(kSession, "end");
    	    
    	    kSession.dispose();
    	    System.out.println("Done!");
    }

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

}
