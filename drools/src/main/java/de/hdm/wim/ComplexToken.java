/**
 * 
 */
package de.hdm.wim;

import java.util.ArrayList;

/**
 * @author Patrick Puritscher
 *
 */
public class ComplexToken {

	public static final String PROJECTDOCUMENTS = "projectdocuments";
	
	private String restrictedToProject;
	private String restrictedToTime;
	private ArrayList<String> topics = new ArrayList<String>();

	/**
	 * @return the topic
	 */
	public ArrayList<String> getTopics() {
		return topics;
	}
	/**
	 * @param topic the topic to set
	 */
	public void addTopic(String topic) {
		this.topics.add(topic);
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
		return "Get " + String.join(", ", this.getTopics()) + " restricted to project " + this.getRestrictedToProject();
	}
}
