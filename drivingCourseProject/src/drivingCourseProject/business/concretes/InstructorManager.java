package drivingCourseProject.business.concretes;

import drivingCourseProject.business.abstracts.InstructorService;
import drivingCourseProject.core.entities.Person;
import drivingCourseProject.entities.concretes.Instructor;

public class InstructorManager implements InstructorService{

	@Override
	public void whatIsTheFirstName(Person person) {
		System.out.println("E�itmenin ad� : "+person.getFirstName());
		
	}

	@Override
	public void whatIsTheLastName(Person person) {
		System.out.println("E�itmenin soyad� : "+person.getLastName());
		
	}

	@Override
	public void enterPassword(Person person) {
		System.out.println("E�itmenin parolas� : "+person.getPassword());
		
	}

	@Override
	public void add(Person person) {
		System.out.println(person.getId()+" numaraya "+person.getFirstName()+" "+person.getLastName()+" adl� e�itmen eklendi.");
		
	}

	@Override
	public void update(Person person) {
		System.out.println(person.getId()+" numaradaki e�itmen "+person.getFirstName()+" "+person.getLastName()+" olarak g�ncellendi.");
		
	}

	@Override
	public void delete(Person person) {
		System.out.println(person.getId()+" numaradan "+person.getFirstName()+" "+person.getLastName()+" adl� e�itmen silindi.");
		
	}

	@Override
	public void scoreOfInstructor(Instructor instructor) {
		System.out.println("E�itmenin puan� : "+instructor.getScore());
		
	}

}
