package de.hdm.wim;

/**
 * The Class Event.
 */
public class Event {
	
	/** The token. */
	private String token;
	
	/**
	 * Instantiates a new event.
	 */
	public Event() {}
	
	/**
	 * Instantiates a new event.
	 *
	 * @param token a token
	 */
	public Event(String token) {
		this.setToken(token);
	}
	
	/**
	 * Gets the token.
	 *
	 * @return the token
	 */
	public String getToken() {
		return token;
	}
	
	/**
	 * Sets the token.
	 *
	 * @param token the token to set
	 */
	public void setToken(String token) {
		this.token = token;
	}
}
