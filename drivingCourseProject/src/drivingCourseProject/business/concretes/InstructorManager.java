package drivingCourseProject.business.concretes;

import drivingCourseProject.business.abstracts.InstructorService;
import drivingCourseProject.core.entities.Person;
import drivingCourseProject.entities.concretes.Instructor;

public class InstructorManager implements InstructorService{

	@Override
	public void whatIsTheFirstName(Person person) {
		System.out.println("Eðitmenin adý : "+person.getFirstName());
		
	}

	@Override
	public void whatIsTheLastName(Person person) {
		System.out.println("Eðitmenin soyadý : "+person.getLastName());
		
	}

	@Override
	public void enterPassword(Person person) {
		System.out.println("Eðitmenin parolasý : "+person.getPassword());
		
	}

	@Override
	public void add(Person person) {
		System.out.println(person.getId()+" numaraya "+person.getFirstName()+" "+person.getLastName()+" adlý eðitmen eklendi.");
		
	}

	@Override
	public void update(Person person) {
		System.out.println(person.getId()+" numaradaki eðitmen "+person.getFirstName()+" "+person.getLastName()+" olarak güncellendi.");
		
	}

	@Override
	public void delete(Person person) {
		System.out.println(person.getId()+" numaradan "+person.getFirstName()+" "+person.getLastName()+" adlý eðitmen silindi.");
		
	}

	@Override
	public void scoreOfInstructor(Instructor instructor) {
		System.out.println("Eðitmenin puaný : "+instructor.getScore());
		
	}

}
