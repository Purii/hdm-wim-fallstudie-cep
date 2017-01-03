/**
 * 
 */
package de.hdm.wim;

/**
 * @author Patrick Puritscher
 *
 */
public class Token {

	public static final String PROJECTDOCUMENTS = "projectdocuments";
	
	private String currentToken;
	private String prevToken;
	private boolean isRestriction = false;
	private String requestedObject;
	private String restriction;
	
	public Token() {}
	public Token(String currentToken) {
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
	
	public void setIsRestriction(boolean isRestriction) {
		this.isRestriction = isRestriction;
	}
	
	public boolean getIsRestriction() {
		return this.isRestriction;
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
