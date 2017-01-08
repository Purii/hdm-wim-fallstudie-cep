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
    	    
    	    List<String> tokens = Arrays.asList("current activities", "blabla", "blabla", "concerning", "HighNet", "blabla");
    	    List<String> tokens2 = Arrays.asList("blabla", "make appointment", "blabla","about", "new contract", "tomorrow" );
    	    List<String> tokens3 = Arrays.asList("blabla", "set deadline", "blabla","for debugging", "Wednesday" );

    	    
    	    tokens.stream().forEach(token -> { insertAndFire(kSession, token); });
    	    
    	    kSession.dispose();
    	    System.out.println("Done!");
    }

    private static void insertAndFire(KieSession kSession, String token) {
    	PseudoClockScheduler clock = kSession.getSessionClock();
    	
    	final Token t = new Token(token);
		kSession.insert(t);
		
		clock.advanceTime(2, TimeUnit.SECONDS);
		
		kSession.fireAllRules();
    }
    

}
