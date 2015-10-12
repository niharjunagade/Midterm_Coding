package com.cisc181.core;

import java.util.UUID;

public class Section {

	private UUID courseID;
	private UUID sectionID;
	private UUID semesterID;
	private int roomID;

	private UUID getCourseID() {
		return courseID;
	}

	private void setCourseID(UUID courseID) {
		this.courseID = courseID;
	}

	private UUID getSectionID() {
		return sectionID;
	}

	private void setSectionID(UUID sectionID) {
		this.sectionID = sectionID;
	}

	private UUID getSemesterID() {
		return semesterID;
	}

	private void setSemesterID(UUID semesterID) {
		this.semesterID = semesterID;
	}

	private int getRoomID() {
		return roomID;
	}

	private void setRoomID(int roomID) {
		this.roomID = roomID;
	}

}
