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
    	    
    	    //List<String> tokens = Arrays.asList("current activities", "blabla", "blablaBefore", "concerning", "HighNet", "blablaNext", "blablaNext2", "blablaNext3");
    	    List<String> tokens = Arrays.asList("current activities", "blabla", "blablaBefore", "leading", "to", "HighNet", "blablaNext", "blablaNext2", "blablaNext3");
    	    List<String> tokens2 = Arrays.asList("blabla", "tasks", "leading","to", "milestone", "ahead" );
    	    List<String> tokens3 = Arrays.asList("blabla", "we", "working", "on", "network","issues", "for", "diagnosis", "module", "item 3", "task list", "blabla", "we", "will", "come up", "with", "something", "viable", "shortly");
    	    List<String> tokens4 = Arrays.asList("that sounds great", "what", "about", "expenses", "do", "you", "think", "you", "will", "be", "able", "to", "stay", "whithin", "limits", "we", "aggreed", "upon", "last week");
    	    List<String> tokens5 = Arrays.asList("that", "should", "be", "no", "problem", "i", "will", "leave", "detailed", "report", "on", "google drive");
    	    List<String> tokens6 = Arrays.asList("ok", "thanks", "lets", "make", "appointment", "for", "our", "next", "meeting");
    	    List<String> tokens7 = Arrays.asList("let", "me", "check", "my", "calendar", "how", "about", "next", "thursday", "at", "16", "hours", "your", "time");
    	    List<String> tokens8 = Arrays.asList("perfect", "see", "you", "then", "bye");
    	    List<String> tokens9 = Arrays.asList("have", "a", "nice", "day", "bye");
    	        	    
    	    
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
