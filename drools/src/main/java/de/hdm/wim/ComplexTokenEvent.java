/**
 * 
 */
package de.hdm.wim;

import java.util.ArrayList;

/**
 * The Class ComplexTokenEvent.
 *
 * @author Patrick Puritscher
 */
public class ComplexTokenEvent {
	
	// Information for Recommender and/or Semantic Group
	// Alphabetical order!
	public static final String CALENDAR = "google calender";
	public static final String COSTDOCUMENTS = "documents about expenses";
	public static final String DRIVE = "google drive";
	public static final String MILESTONE = "milestones";
	public static final String PROJECTDOCUMENTS = "projectdocuments";
	public static final String PROJECTPLANNING = "project plan";
	public static final String PROTOCOL = "protocol";
	public static final String PROTOCOLCREATION = "creation of protocol";
	public static final String TASKLIST = "tasklist";
	
	
	private String restrictedToDate;
	private String restrictedToProject;
	private String restrictedToTime;
	private ArrayList<String> topics = new ArrayList<String>();

	/* 
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return "Get " + String.join(", ", this.getTopics()) + " restricted to project " + this.getRestrictedToProject();
	}
	
	/**
	 * Gets the topics.
	 *
	 * @return the topic
	 */
	public ArrayList<String> getTopics() {
		return topics;
	}
	
	/**
	 * Adds the topic.
	 *
	 * @param topic the topic to set
	 */
	public void addTopic(String topic) {
		if(!topics.contains(topic)){
			this.topics.add(topic);
		}
	}

	/**
	 * Gets the restricted to project.
	 *
	 * @return the restrictedToProject
	 */
	public String getRestrictedToProject() {
		return restrictedToProject;
	}
	
	/**
	 * Sets the restricted to project.
	 *
	 * @param restrictedToProject the restrictedToProject to set
	 */
	public void setRestrictedToProject(String restrictedToProject) {
		this.restrictedToProject = restrictedToProject;
	}

	/**
	 * Gets the restricted to time.
	 *
	 * @return the restrictedToTime
	 */
	public String getRestrictedToTime() {
		return restrictedToTime;
	}
	
	/**
	 * Sets the restricted to time.
	 *
	 * @param restrictedToTime the restrictedToTime to set
	 */
	public void setRestrictedToTime(String restrictedToTime) {
		this.restrictedToTime = restrictedToTime;
	}

	/**
	 * @return the restrictedToDate
	 */
	public String getRestrictedToDate() {
		return restrictedToDate;
	}

	/**
	 * @param restrictedToDate the restrictedToDate to set
	 */
	public void setRestrictedToDate(String restrictedToDate) {
		this.restrictedToDate = restrictedToDate;
	}
}
