package com.digisafari.sapl.course.model;

public class Instructor {
	
	
	private String id;
	private String name;
	private String title;
	private String profile;
	private String linkedinUrl;
	private float instructorRating;
	private int totalReviews;
	private int totalNoOfLearners;
	private String profilePicUrl;
	
	public Instructor() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getProfile() {
		return profile;
	}

	public void setProfile(String profile) {
		this.profile = profile;
	}

	public String getLinkedinUrl() {
		return linkedinUrl;
	}

	public void setLinkedinUrl(String linkedinUrl) {
		this.linkedinUrl = linkedinUrl;
	}

	public float getInstructorRating() {
		return instructorRating;
	}

	public void setInstructorRating(float instructorRating) {
		this.instructorRating = instructorRating;
	}

	public int getTotalReviews() {
		return totalReviews;
	}

	public void setTotalReviews(int totalReviews) {
		this.totalReviews = totalReviews;
	}

	public int getTotalNoOfLearners() {
		return totalNoOfLearners;
	}

	public void setTotalNoOfLearners(int totalNoOfLearners) {
		this.totalNoOfLearners = totalNoOfLearners;
	}

	public String getProfilePicUrl() {
		return profilePicUrl;
	}

	public void setProfilePicUrl(String profilePicUrl) {
		this.profilePicUrl = profilePicUrl;
	}

	@Override
	public String toString() {
		return "Instructor [id=" + id + ", name=" + name + ", title=" + title + ", profile=" + profile
				+ ", linkedinUrl=" + linkedinUrl + ", instructorRating=" + instructorRating + ", totalReviews="
				+ totalReviews + ", totalNoOfLearners=" + totalNoOfLearners + ", profilePicUrl=" + profilePicUrl + "]";
	}
	
	

}
