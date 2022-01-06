package drivingCourseProject.business.concretes;

import drivingCourseProject.business.abstracts.CClassService;
import drivingCourseProject.core.entities.DrivingLicence;
import drivingCourseProject.core.entities.Person;

public class CClassManager implements CClassService{

	@Override
	public void whatIsTheVehicleUsed(DrivingLicence drivingLicence) {
		System.out.println("C sýnýfý ehliyette kullanýlan araç : "+drivingLicence.getVehicleUsed());
		
	}

	@Override
	public void whatIsTheAgeLimit(DrivingLicence drivingLicence) {
		System.out.println("C sýnýf ehliyet için minimum yaþ sýnýrý : "+drivingLicence.getAgeLimit());
		
	}

	@Override
	public void isThereExperienceRequirement(DrivingLicence drivingLicence) {
		System.out.println("C sýnýf ehliyet için deneyim þartý var mý ? "+drivingLicence.getExperienceRequirement());
		
	}

	@Override
	public void add(Person person) {
		System.out.println(person.getFirstName()+" "+person.getLastName()+" C sýnýf ehliyet kurslarýna eklendi.");
		
	}

	@Override
	public void update(Person person) {
		System.out.println(person.getFirstName()+" "+person.getLastName()+" C sýnýf ehliyet kurslarýna eklendi.");
		
	}

	@Override
	public void delete(Person person) {
		System.out.println(person.getFirstName()+" "+person.getLastName()+" C sýnýf ehliyet kurslarýndan silindi.");
		
	}

}
