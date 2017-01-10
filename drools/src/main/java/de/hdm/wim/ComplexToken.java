/**
 * 
 */
package de.hdm.wim;

/**
 * @author Patrick Puritscher
 *
 */
public class ComplexToken {

	public static final String PROJECTDOCUMENTS = "projectdocuments";
	public static final String COSTDOCUMENTS = "documents about expenses";
	
	private String restrictedToProject;
	private String restrictedToTime;
	private String topic;

	/**
	 * @return the topic
	 */
	public String getTopic() {
		return topic;
	}
	/**
	 * @param topic the topic to set
	 */
	public void setTopic(String topic) {
		this.topic = topic;
	}

	/**
	 * @return the restrictedToProject
	 */
	public String getRestrictedToProject() {
		return restrictedToProject;
	}
	/**
	 * @param restrictedToProject the restrictedToProject to set
	 */
	public void setRestrictedToProject(String restrictedToProject) {
		this.restrictedToProject = restrictedToProject;
	}

	/**
	 * @return the restrictedToTime
	 */
	public String getRestrictedToTime() {
		return restrictedToTime;
	}
	/**
	 * @param restrictedToTime the restrictedToTime to set
	 */
	public void setRestrictedToTime(String restrictedToTime) {
		this.restrictedToTime = restrictedToTime;
	}
	
	public String toString() {
		return "Get " + this.getTopic() + " restricted to project " + this.getRestrictedToProject();
	}
}
