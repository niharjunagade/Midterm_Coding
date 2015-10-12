package com.cisc181.core;

import java.util.Date;

public class Student extends Person {

	private enum eMajor;

	public String getMajor() {
			return this.eMajor;
		}

	public void setMajor (enum eMajor)
    {
        this.eMajor = Major;
    }

		public Student(String FirstName, String MiddleName, String LastName,Date DOB, enum eMajor,
                        String Address, String Phone_number, String Email)
        {
                super(FirstName, MiddleName, LastName, DOB, Address, Phone_number, Email);
                this.eMajor = Major;
               
        }

		@Override
		public void PrintName() {
			System.out.println(getLastName() + "," + getFirstName() + ' ' + getMiddleName());
		}

		public void PrintName(boolean bnormal) {
			super.PrintName();
		}
}