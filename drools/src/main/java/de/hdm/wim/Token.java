/**
 * 
 */
package de.hdm.wim;


public class Token {
	public static final String PROJECTDOCUMENTS = "projectdocuments";

	private String value;

	public Token(String token) {
		this.setValue(token);
	}

	/**
	 * @return the value
	 */
	public String getValue() {
		return value;
	}

	/**
	 * @param value the value to set
	 */
	public void setValue(String value) {
		this.value = value;
	}
	
	
	
}
