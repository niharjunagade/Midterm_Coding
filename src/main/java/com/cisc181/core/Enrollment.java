package com.cisc181.core;

import java.util.Date;
import java.util.UUID;

public class Enrollment {
	 
	private UUID sectionID;
	private UUID studentID;
	private UUID enrollmentID;
	private double grade;
	 
	private Enrollment() {
	   
	}
	 
	private Enrollment(UUID studentID, UUID sectionID) {
	   
	    setID(UUID enrollmentID);
	}
	 
	private setgrade(double grade) {
	    return grade;
	   
	}
}
