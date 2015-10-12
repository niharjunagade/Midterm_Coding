package com.cisc181.core;

import java.util.Date;
import java.util.UUID;

public class Semester {

	private UUID semesterID;
	private Date startDate;
	private Date endDate;

	private UUID getSemesterID() {
		return semesterID;
	}

	private void setSemesterID(UUID semesterID) {
		this.semesterID = semesterID;
	}

	private Date getStartDate() {
		return startDate;
	}

	private void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	private Date getEndDate() {
		return endDate;
	}

	private void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

}
