package drivingCourseProject.entities.concretes;

import drivingCourseProject.core.entities.Person;

public class LearnerDriver extends Person{
	
	private String identityNumber;

	public LearnerDriver(String identityNumber) {
		super();
		this.identityNumber = identityNumber;
	}
	
	public LearnerDriver() {
		
	}

	public String getIdentityNumber() {
		return identityNumber;
	}

	public void setIdentityNumber(String identityNumber) {
		this.identityNumber = identityNumber;
	}
}
