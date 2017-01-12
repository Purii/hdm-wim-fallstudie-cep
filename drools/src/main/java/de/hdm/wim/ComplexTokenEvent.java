/**
 * 
 */
package de.hdm.wim;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import com.google.gson.Gson;

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
	
	// Information about date/time restriction
	public static final String DATERANGE_NEXT = "next";
	public static final String DATERANGE_PREV = "previous";
	public static final String DATE_MONDAY = "monday";
	public static final String DATE_TUESDAY = "tuesday";
	public static final String DATE_WEDNESDAY = "wednesday";
	public static final String DATE_THURSDAY = "thursday";
	public static final String DATE_FRIDAY= "friday";
	public static final String DATE_SATURDAY = "saturday";
	public static final String DATE_SUNDAY = "sunday";
	
	private LocalDate restrictedToDate;
	private String restrictedToProject;
	private LocalTime restrictedToTime;
	private ArrayList<String> topics = new ArrayList<String>();

	/* 
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		this.toJson();
		if(this.getRestrictedToDate() != null) {
			if(this.getTopics().contains(ComplexTokenEvent.CALENDAR)){
				this.getTopics().remove(ComplexTokenEvent.CALENDAR);
				if(this.getTopics().isEmpty()){
					return "Set new meeting at " + this.getRestrictedToDate().toString()
						+ " restricted to project " + this.getRestrictedToProject();
				} else {
					return "Set new meeting for " + String.join(", ", this.getTopics())
						+ " restricted to project " + this.getRestrictedToProject()
						+ " at " + this.getRestrictedToDate().toString();
				}
			} else {
				return "Get " + String.join(", ", this.getTopics())
					+ " restricted to project " + this.getRestrictedToProject()
					+ " at " + this.getRestrictedToDate().toString();
			}
		}
		// Need rewrite
		if(this.getRestrictedToTime() != null) {
			return "Get " + String.join(", ", this.getTopics())
			+ " restricted to project " + this.getRestrictedToProject()
			+ " at " + this.getRestrictedToTime().toString();
		}
		return "Get " + String.join(", ", this.getTopics())
			+ " restricted to project " + this.getRestrictedToProject();
	}
	
	public void toJson() {
		Gson gson = new Gson();
		String json = gson.toJson(this);
	        System.out.println(json);
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
	public LocalTime getRestrictedToTime() {
		return restrictedToTime;
	}
	
	/**
	 * Sets the restricted to time.
	 *
	 * @param restrictedToTime the restrictedToTime to set
	 */
	public void setRestrictedToTime(LocalTime restrictedToTime) {
		this.restrictedToTime = restrictedToTime;
	}

	/**
	 * @return the restrictedToDate
	 */
	public LocalDate getRestrictedToDate() {
		return restrictedToDate;
	}

	/**
	 * @param restrictedToDate the restrictedToDate to set
	 */
	public void setRestrictedToDate(LocalDate restrictedToDate) {
		this.restrictedToDate = restrictedToDate;
	}
}
