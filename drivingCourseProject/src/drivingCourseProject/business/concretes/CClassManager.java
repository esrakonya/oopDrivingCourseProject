package drivingCourseProject.business.concretes;

import drivingCourseProject.business.abstracts.CClassService;
import drivingCourseProject.core.entities.DrivingLicence;
import drivingCourseProject.core.entities.Person;

public class CClassManager implements CClassService{

	@Override
	public void whatIsTheVehicleUsed(DrivingLicence drivingLicence) {
		System.out.println("C s�n�f� ehliyette kullan�lan ara� : "+drivingLicence.getVehicleUsed());
		
	}

	@Override
	public void whatIsTheAgeLimit(DrivingLicence drivingLicence) {
		System.out.println("C s�n�f ehliyet i�in minimum ya� s�n�r� : "+drivingLicence.getAgeLimit());
		
	}

	@Override
	public void isThereExperienceRequirement(DrivingLicence drivingLicence) {
		System.out.println("C s�n�f ehliyet i�in deneyim �art� var m� ? "+drivingLicence.getExperienceRequirement());
		
	}

	@Override
	public void add(Person person) {
		System.out.println(person.getFirstName()+" "+person.getLastName()+" C s�n�f ehliyet kurslar�na eklendi.");
		
	}

	@Override
	public void update(Person person) {
		System.out.println(person.getFirstName()+" "+person.getLastName()+" C s�n�f ehliyet kurslar�na eklendi.");
		
	}

	@Override
	public void delete(Person person) {
		System.out.println(person.getFirstName()+" "+person.getLastName()+" C s�n�f ehliyet kurslar�ndan silindi.");
		
	}

}
