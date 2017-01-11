package de.hdm.wim.expert;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.rule.FactHandle;

/**
 * This is a sample class to launch a rule.
 */
public class DroolsExpertMain {

    public static final void main(String[] args) {
        try {
            // load up the knowledge base
	        KieServices ks = KieServices.Factory.get();
    	    KieContainer kContainer = ks.getKieClasspathContainer();
    	    execute(kContainer);
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }

    /**
     * Execute.
     *
     * @param kContainer the k container
     */
    // Inspired by: https://github.com/droolsjbpm/drools/blob/master/drools-examples/src/main/java/org/drools/examples/buspass/BussPassGoodExample.java
    public static void execute( KieContainer kContainer ) {
    	KieSession kSession = kContainer.newKieSession("ksession-rules");
    	
    	final MessageListener ml = new MessageListener();
    	ml.setCurrentToken("current activities");
    	FactHandle fh = kSession.insert(ml);
    	kSession.fireAllRules();
    	
    	ml.updateCurrentToken("not relevant");
    	kSession.update(fh, ml);
    	kSession.fireAllRules();    	
    	
    	ml.updateCurrentToken("concerning");
    	kSession.update(fh, ml);
    	kSession.fireAllRules();
    	
    	ml.updateCurrentToken("HighNet");
    	kSession.update(fh, ml);
    	kSession.fireAllRules();
    	
    	System.out.println("Done!");
    	System.out.print(ml.toString());
    	kSession.dispose();
    }

}
