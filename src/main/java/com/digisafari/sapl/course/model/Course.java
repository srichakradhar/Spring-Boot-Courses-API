package com.digisafari.sapl.course.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "courses")
public class Course {
	
	@Id
	private String id;
	private String title;
	private String description;
	private float overallRating;
	private int totalRatings;
	private Instructor instructor;
	
	public Course() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public float getOverallRating() {
		return overallRating;
	}

	public void setOverallRating(float overallRating) {
		this.overallRating = overallRating;
	}

	public int getTotalRatings() {
		return totalRatings;
	}

	public void setTotalRatings(int totalRatings) {
		this.totalRatings = totalRatings;
	}

	public Instructor getInstructor() {
		return instructor;
	}

	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", title=" + title + ", description=" + description + ", overallRating="
				+ overallRating + ", totalRatings=" + totalRatings + ", instructor=" + instructor + "]";
	}

	
	
	
}
