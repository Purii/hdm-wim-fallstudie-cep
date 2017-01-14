package de.hdm.wim;

import java.util.Arrays;
import java.util.List;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

/**
 * The Class HelloFusion.
 */
public class HelloFusion {
	
	public static final void main(String[] args) {
		// ASCII Banner
		System.out.println(""+
" ____   _  _    __  __         _        \n"+
"|  _ \\ (_)| |  |  \\/  |       | |       \n"+
"| |_) | _ | |_ | \\  / |  __ _ | |_  ___ \n"+
"|  _ < | || __|| |\\/| | / _` || __|/ _ \\\n"+
"| |_) || || |_ | |  | || (_| || |_|  __/\n"+
"|____/ |_| \\__||_|  |_| \\__,_| \\__|\\___|\n"+
                                        "");
		// load up the knowledge base
		KieServices ks = KieServices.Factory.get();
		KieContainer kContainer = ks.getKieClasspathContainer();
		// Config in kmodule.xml
		KieSession kSession = kContainer.newKieSession();
		
		// Define tokens
		List<String> tokens1 = Arrays.asList("Hello");
		List<String> tokens2 = Arrays.asList("lets", "talk", "about", "current",  "activities", "concerning", "HighNet", "project");
		List<String> tokens3 = Arrays.asList("ok", "shall", "we", "look", "at", "tasks", "leading","to", "milestone", "ahead" );
		List<String> tokens4 = Arrays.asList("sure", "we", "working", "on", "network","issues", "for", "diagnosis", "module", "item 3", "task", "list", "blabla", "we", "will", "come up", "with", "something", "viable", "shortly");
		List<String> tokens5 = Arrays.asList("that", "sounds", "great", "what", "about", "expenses", "do", "you", "think", "you", "will", "be", "able", "to", "stay", "whithin", "limits", "we", "aggreed", "upon", "last week");
		List<String> tokens6 = Arrays.asList("that", "should", "be", "no", "problem", "i", "will", "leave", "detailed", "report", "on", "google", "drive");
		List<String> tokens7 = Arrays.asList("ok", "thanks", "lets", "make", "appointment", "for", "our", "next", "meeting");
		List<String> tokens8 = Arrays.asList("let", "me", "check", "my", "calendar", "how", "about", "next", "thursday", "at", "16", "hours", "your", "time");
		List<String> tokens9 = Arrays.asList("perfect", "see", "you", "then", "bye");
		List<String> tokens10 = Arrays.asList("have", "a", "nice", "day", "bye");
		List<String> tokens11 = Arrays.asList("expenses", "previous", "monday");
		List<String> tokens12 = Arrays.asList("Let", "us", "make", "an", "appointment", "for", "next", "Monday", "at", "09", "am");
		List<String> tokens13 = Arrays.asList("Let's", "plan", "a", "meeting", "at", "16:00", "on", "next", "monday");
		List<String> tokens14 = Arrays.asList("expenses", "blaaa", "at", "1pm");
		
		List<List<String>> textsList = Arrays.asList(
				tokens1,
				tokens2,
				tokens3,
				tokens4,
				tokens5,
				tokens6,
				tokens7,
				tokens8,
				tokens9,
				tokens10,
				tokens11,
				tokens12,
				tokens13,
				tokens14
		);
		
		TextRunner textRunner = new TextRunner();
		textRunner.setTexts(textsList);
		textRunner.runAllTextArrays(kSession);
		
		kSession.dispose();
		System.out.println("Done!");
	}
}
