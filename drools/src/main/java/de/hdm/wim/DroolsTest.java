package de.hdm.wim;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

/**
 * This is a sample class to launch a rule.
 */
public class DroolsTest {

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

    public static void execute( KieContainer kContainer ) {
    	KieSession kSession = kContainer.newKieSession("ksession-rules");
    	
    	// TimeInfo
    	TimeInfo timeInfo = new TimeInfo();
    	timeInfo.setTimeInfo("Tuesday");
    	kSession.insert(timeInfo);
    	
    	// Message
    	Message message = new Message();
        message.setMessage("Hello World");
        message.setStatus(Message.HELLO);
        kSession.insert(message);
        
    	// Go!
    	kSession.fireAllRules();
    	kSession.dispose();
    }
    
    
    public static class Message {

        public static final int HELLO = 0;
        public static final int GOODBYE = 1;

        private String message;

        private int status;

        public String getMessage() {
            return this.message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public int getStatus() {
            return this.status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

    }

}
