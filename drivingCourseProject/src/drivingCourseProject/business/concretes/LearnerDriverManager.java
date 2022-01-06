package drivingCourseProject.business.concretes;

import drivingCourseProject.business.abstracts.LearnerDriverService;
import drivingCourseProject.core.entities.Person;
import drivingCourseProject.entities.concretes.LearnerDriver;

public class LearnerDriverManager implements LearnerDriverService{

	@Override
	public void whatIsTheFirstName(Person person) {
		System.out.println("S�r�c� aday�n�n ad� : "+person.getFirstName());
		
	}

	@Override
	public void whatIsTheLastName(Person person) {
		System.out.println("S�r�c� aday�n�n soyad� : "+person.getLastName());
		
	}

	@Override
	public void enterPassword(Person person) {
		System.out.println("S�r�c� aday�n�n parolas� : "+person.getPassword());
		
	}

	@Override
	public void add(Person person) {
		System.out.println(person.getId()+" numaraya "+person.getFirstName()+" "+person.getLastName()+" adl� s�r�c� aday� eklendi.");
		
	}

	@Override
	public void update(Person person) {
		System.out.println(person.getId()+" numaradaki s�r�c� aday� "+person.getFirstName()+" "+person.getLastName()+" olarak g�ncellendi.");
		
	}

	@Override
	public void delete(Person person) {
		System.out.println(person.getId()+" numaradan "+person.getFirstName()+" "+person.getLastName()+" adl� s�r�c� aday� silindi.");
		
	}

	@Override
	public void identityNumberOfLearnerDriver(LearnerDriver learnerDriver) {
		System.out.println("S�r�c� aday�n�n TC kimlik numaras� : "+learnerDriver.getIdentityNumber());
		
	}

	
}
