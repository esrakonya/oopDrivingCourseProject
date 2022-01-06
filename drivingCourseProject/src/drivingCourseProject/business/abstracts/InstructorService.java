package drivingCourseProject.business.abstracts;

import drivingCourseProject.entities.concretes.Instructor;

public interface InstructorService extends PersonService{
	void scoreOfInstructor(Instructor instructor);
}
