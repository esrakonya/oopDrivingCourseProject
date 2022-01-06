package drivingCourseProject.business.concretes;

import drivingCourseProject.business.abstracts.BClassService;
import drivingCourseProject.core.entities.DrivingLicence;
import drivingCourseProject.core.entities.Person;

public class BClassManager implements BClassService{

	@Override
	public void whatIsTheVehicleUsed(DrivingLicence drivingLicence) {
		System.out.println("B s�n�f� ehliyette kullan�lan ara� : "+drivingLicence.getVehicleUsed());
		
	}

	@Override
	public void whatIsTheAgeLimit(DrivingLicence drivingLicence) {
		System.out.println("B s�n�f ehliyet i�in minimum ya� s�n�r� : "+drivingLicence.getAgeLimit());
		
	}

	@Override
	public void isThereExperienceRequirement(DrivingLicence drivingLicence) {
		System.out.println("B s�n�f ehliyet i�in deneyim �art� var m� ? "+drivingLicence.getExperienceRequirement());
		
	}

	@Override
	public void add(Person person) {
		System.out.println(person.getFirstName()+" "+person.getLastName()+" B s�n�f ehliyet kurslar�na eklendi.");
		
	}

	@Override
	public void update(Person person) {
		System.out.println("B s�n�f ehliyet kursu kullan�c�lar� g�ncellendi.");
		
	}

	@Override
	public void delete(Person person) {
		System.out.println(person.getFirstName()+" "+person.getLastName()+" B s�n�f ehliyet kurslar�ndan silindi.");
		
	}

}
