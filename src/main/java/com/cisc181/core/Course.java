package com.cisc181.core;

import java.util.UUID;

public class Course {
	private String courseName;
	private int gradePoints;
	private UUID courseID;
	private String major;

	private String getCourseName() {
		return courseName;
	}

	private void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	private int getGradePoints() {
		return gradePoints;
	}

	private void setGradePoints(int gradePoints) {
		this.gradePoints = gradePoints;
	}

	private UUID getCourseID() {
		return courseID;
	}

	private void setCourseID(UUID courseID) {
		this.courseID = courseID;
	}

	private String getMajor() {
		return major;
	}

	private void setMajor(String major) {
		this.major = major;
	}

}
