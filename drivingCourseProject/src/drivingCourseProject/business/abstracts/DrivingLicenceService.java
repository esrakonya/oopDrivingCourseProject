package drivingCourseProject.business.abstracts;

import drivingCourseProject.core.entities.DrivingLicence;
import drivingCourseProject.core.entities.Person;

public interface DrivingLicenceService {
	void whatIsTheVehicleUsed(DrivingLicence drivingLicence);
	void whatIsTheAgeLimit(DrivingLicence drivingLicence);
	void isThereExperienceRequirement(DrivingLicence drivingLicence);
	void add(Person person);
	void update(Person person);
	void delete(Person person);
}
