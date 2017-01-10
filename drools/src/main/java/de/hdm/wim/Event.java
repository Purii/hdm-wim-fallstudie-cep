package de.hdm.wim;

public class Event {
	private String token;
	
	public Event() {}
	public Event(String token) {
		this.setToken(token);
	}
	
	/**
	 * @return the token
	 */
	public String getToken() {
		return token;
	}
	/**
	 * @param token the token to set
	 */
	public void setToken(String token) {
		this.token = token;
	}
}