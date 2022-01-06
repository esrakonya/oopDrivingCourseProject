package drivingCourseProject.business.concretes;

import drivingCourseProject.business.abstracts.MClassService;
import drivingCourseProject.core.entities.DrivingLicence;
import drivingCourseProject.core.entities.Person;

public class MClassManager implements MClassService{

	@Override
	public void whatIsTheVehicleUsed(DrivingLicence drivingLicence) {
		System.out.println("M sýnýfý ehliyette kullanýlan araç : "+drivingLicence.getVehicleUsed());
		
	}

	@Override
	public void whatIsTheAgeLimit(DrivingLicence drivingLicence) {
		System.out.println("M sýnýf ehliyet için minimum yaþ sýnýrý : "+drivingLicence.getAgeLimit());
		
	}

	@Override
	public void isThereExperienceRequirement(DrivingLicence drivingLicence) {
		System.out.println("M sýnýf ehliyet için deneyim þartý var mý ? "+drivingLicence.getExperienceRequirement());
		
	}

	@Override
	public void add(Person person) {
		System.out.println(person.getFirstName()+" "+person.getLastName()+" M sýnýf ehliyet kurslarýna eklendi.");
		
	}

	@Override
	public void update(Person person) {
		System.out.println("M sýnýf ehliyet kursu kullanýcýlarý güncellendi.");
		
	}

	@Override
	public void delete(Person person) {
		System.out.println(person.getFirstName()+" "+person.getLastName()+" M sýnýf ehliyet kurslarýndan silindi.");
		
	}

}
