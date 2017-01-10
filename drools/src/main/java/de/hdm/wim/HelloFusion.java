package de.hdm.wim;

import java.util.Arrays;
import java.util.List;

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
    	    List<String> tokens = Arrays.asList("lets", "talk", "about", "current activities", "concerning", "HighNet", "project");
    	    List<String> tokens2 = Arrays.asList("ok", "shall", "we", "look", "at", "tasks", "leading","to", "milestone", "ahead" );
<<<<<<< HEAD
    	    List<String> tokens3 = Arrays.asList("sure", "we", "working", "on", "network","issues", "for", "diagnosis", "module", "item 3", "task", "list", "blabla", "we", "will", "come up", "with", "something", "viable", "shortly");
    	    List<String> tokens4 = Arrays.asList("that", "sounds", "great", "what", "about", "expenses", "do", "you", "think", "you", "will", "be", "able", "to", "stay", "whithin", "limits", "we", "aggreed", "upon", "last week");
=======
    	    List<String> tokens3 = Arrays.asList("sure", "we", "working", "on", "network","issues", "for", "diagnosis", "module", "item 3", "task list", "blabla", "we", "will", "come up", "with", "something", "viable", "shortly");
    	    List<String> tokens4 = Arrays.asList("that sounds great", "what", "about", "expenses", "do", "you", "think", "you", "will", "be", "able", "to", "stay", "whithin", "limits", "we", "aggreed", "upon", "last week");
>>>>>>> 063ba6fd2b8a599075cc83ce022fbfd7fd9e662c
    	    List<String> tokens5 = Arrays.asList("that", "should", "be", "no", "problem", "i", "will", "leave", "detailed", "report", "on", "google", "drive");
    	    List<String> tokens6 = Arrays.asList("ok", "thanks", "lets", "make", "appointment", "for", "our", "next", "meeting");
    	    List<String> tokens7 = Arrays.asList("let", "me", "check", "my", "calendar", "how", "about", "next", "thursday", "at", "16", "hours", "your", "time");
    	    List<String> tokens8 = Arrays.asList("perfect", "see", "you", "then", "bye");
    	    List<String> tokens9 = Arrays.asList("have", "a", "nice", "day", "bye");
    	    
    	    List<List<String>> textsList = Arrays.asList(
    	    		tokens, tokens2, tokens3, tokens4, tokens5, tokens6, tokens7, tokens8, tokens9
    	    );
    	   
    	    TextRunner textRunner = new TextRunner();
    	    textRunner.setTexts(textsList);
    	    textRunner.runAllTextArrays(kSession);
    	    
    	    kSession.dispose();
    	    System.out.println("Done!");
    }

}
