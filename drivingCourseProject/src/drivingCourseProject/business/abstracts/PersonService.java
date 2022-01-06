package drivingCourseProject.business.abstracts;

import drivingCourseProject.core.entities.Person;

public interface PersonService {
	void whatIsTheFirstName(Person person);
	void whatIsTheLastName(Person person);
	void enterPassword(Person person);
	void add(Person person);
	void update(Person person);
	void delete(Person person);
}
