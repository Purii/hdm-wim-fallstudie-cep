/**
 * 
 */
package de.hdm.wim.expert;

/**
 * @author Patrick Puritscher
 *
 */
public class MessageListener {

	public static final String PROJECTDOCUMENTS = "projectdocuments";
	
	private String currentToken;
	private String prevToken;
	private boolean nextIsRestriction = false;
	private String requestedObject;
	private String restriction;
	
	public MessageListener() {}
	public MessageListener(String currentToken) {
		this.setCurrentToken(currentToken);
	}
	
	/**
	 * @return the currentToken
	 */
	public String getCurrentToken() {
		return currentToken;
	}

	/**
	 * @param currentToken the currentToken to set
	 */
	public void setCurrentToken(String currentToken) {
		this.currentToken = currentToken;
	}
	
	public void updateCurrentToken(String currentToken) {
		this.setPrevToken(this.currentToken);
		this.setCurrentToken(currentToken);
	}
	
	public void setRequestedObject(String requestedObject) {
		this.requestedObject = requestedObject;
	}
	
	public String getRequestedObject() {
		return this.requestedObject;
	}
	
	public void setNextIsRestriction(boolean nextIsRestriction) {
		this.nextIsRestriction = nextIsRestriction;
	}
	
	public boolean getNextIsRestriction() {
		return this.nextIsRestriction;
	}

	public String getRestriction() {
		return this.restriction;
	}

	public void setRestriction(String restriction) {
		this.restriction = restriction;
	}
	
	public String toString() {
		return this.requestedObject + " restricted to " + this.restriction;
	}

	/**
	 * @return the prevToken
	 */
	public String getPrevToken() {
		return prevToken;
	}

	/**
	 * @param prevToken the prevToken to set
	 */
	public void setPrevToken(String prevToken) {
		this.prevToken = prevToken;
	}
}
