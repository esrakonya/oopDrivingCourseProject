package drivingCourseProject.business.abstracts;

import drivingCourseProject.entities.concretes.LearnerDriver;

public interface LearnerDriverService extends PersonService{
	void identityNumberOfLearnerDriver(LearnerDriver learnerDriver);
}
