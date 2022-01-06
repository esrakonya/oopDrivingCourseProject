package drivingCourseProject.business.concretes;

import drivingCourseProject.business.abstracts.LearnerDriverService;
import drivingCourseProject.core.entities.Person;
import drivingCourseProject.entities.concretes.LearnerDriver;

public class LearnerDriverManager implements LearnerDriverService{

	@Override
	public void whatIsTheFirstName(Person person) {
		System.out.println("Sürücü adayýnýn adý : "+person.getFirstName());
		
	}

	@Override
	public void whatIsTheLastName(Person person) {
		System.out.println("Sürücü adayýnýn soyadý : "+person.getLastName());
		
	}

	@Override
	public void enterPassword(Person person) {
		System.out.println("Sürücü adayýnýn parolasý : "+person.getPassword());
		
	}

	@Override
	public void add(Person person) {
		System.out.println(person.getId()+" numaraya "+person.getFirstName()+" "+person.getLastName()+" adlý sürücü adayý eklendi.");
		
	}

	@Override
	public void update(Person person) {
		System.out.println(person.getId()+" numaradaki sürücü adayý "+person.getFirstName()+" "+person.getLastName()+" olarak güncellendi.");
		
	}

	@Override
	public void delete(Person person) {
		System.out.println(person.getId()+" numaradan "+person.getFirstName()+" "+person.getLastName()+" adlý sürücü adayý silindi.");
		
	}

	@Override
	public void identityNumberOfLearnerDriver(LearnerDriver learnerDriver) {
		System.out.println("Sürücü adayýnýn TC kimlik numarasý : "+learnerDriver.getIdentityNumber());
		
	}

	
}
