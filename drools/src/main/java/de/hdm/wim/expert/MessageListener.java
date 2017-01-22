/**
 * 
 */
package de.hdm.wim.expert;

/**
 * The listener interface for receiving message events.
 * The class that is interested in processing a message
 * event implements this interface, and the object created
 * with that class is registered with a component using the
 * component's <code>addMessageListener<code> method. When
 * the message event occurs, that object's appropriate
 * method is invoked.
 *
 * @author Patrick Puritscher
 */
public class MessageListener {

	public static final String PROJECTDOCUMENTS = "projectdocuments";
	
	private String currentToken;
	private String prevToken;
	private boolean nextIsRelated = false;
	private String requestedObject;
	private String relation;
	
	public MessageListener() {}
	
	/**
	 * Instantiates a new message listener.
	 *
	 * @param currentToken the current token
	 */
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
	 * Sets the current token.
	 *
	 * @param currentToken the currentToken to set
	 */
	public void setCurrentToken(String currentToken) {
		this.currentToken = currentToken;
	}
	
	/**
	 * Update current token.
	 *
	 * @param currentToken the current token
	 */
	public void updateCurrentToken(String currentToken) {
		this.setPrevToken(this.currentToken);
		this.setCurrentToken(currentToken);
	}
	
	/**
	 * Sets the requested object.
	 *
	 * @param requestedObject the new requested object
	 */
	public void setRequestedObject(String requestedObject) {
		this.requestedObject = requestedObject;
	}
	
	/**
	 * Gets the requested object.
	 *
	 * @return the requested object
	 */
	public String getRequestedObject() {
		return this.requestedObject;
	}
	
	/**
	 * Sets if the next is related or not.
	 *
	 * @param nextIsRelated
	 */
	public void setNextIsRelated(boolean nextIsRelated) {
		this.nextIsRelated = nextIsRelated;
	}
	
	/**
	 * Gets if the next is related or not.
	 *
	 * @return true if the next is related
	 */
	public boolean getNextIsRelated() {
		return this.nextIsRelated;
	}

	/**
	 * Gets the relation.
	 *
	 * @return the relation
	 */
	public String getRelation() {
		return this.relation;
	}

	/**
	 * Sets the relation.
	 *
	 * @param new relation
	 */
	public void setRelation(String relation) {
		this.relation = relation;
	}
	
	/** 
	 * custom toString method
	 */
	public String toString() {
		return this.requestedObject + " related to " + this.relation;
	}

	/**
	 * Gets the previous token.
	 *
	 * @return the prevToken
	 */
	public String getPrevToken() {
		return prevToken;
	}

	/**
	 * Sets the prev token.
	 *
	 * @param prevToken the prevToken to set
	 */
	public void setPrevToken(String prevToken) {
		this.prevToken = prevToken;
	}
}
