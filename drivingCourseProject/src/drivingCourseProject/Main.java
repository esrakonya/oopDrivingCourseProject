package drivingCourseProject;

import drivingCourseProject.business.concretes.AClassManager;
import drivingCourseProject.business.concretes.BClassManager;
import drivingCourseProject.business.concretes.InstructorManager;
import drivingCourseProject.business.concretes.LearnerDriverManager;
import drivingCourseProject.entities.concretes.AClass;
import drivingCourseProject.entities.concretes.BClass;
import drivingCourseProject.entities.concretes.Instructor;
import drivingCourseProject.entities.concretes.LearnerDriver;

public class Main {

	public static void main(String[] args) {

		LearnerDriver learnerDriver1 = new LearnerDriver();
		learnerDriver1.setId(1);
		learnerDriver1.setFirstName("Esra");
		learnerDriver1.setLastName("Konya");
		learnerDriver1.setIdentityNumber("12345678912");
		learnerDriver1.setPassword("ksdjkdfhhd");
		
		
		LearnerDriver learnerDriver2 = new LearnerDriver();
		learnerDriver2.setId(2);
		learnerDriver2.setFirstName("Belinay");
		learnerDriver2.setLastName("Gür");
		learnerDriver2.setIdentityNumber("74185296356");
		learnerDriver2.setPassword("asdfghjk");
		
		
		Instructor instructor1 = new Instructor();
		instructor1.setId(3);
		instructor1.setFirstName("Engin");
		instructor1.setLastName("Tekin");
		instructor1.setPassword("xnbcnöçfks");
		instructor1.setScore(72);
		
		
		AClass aClass = new AClass();
		aClass.setVehicleUsed("motosiklet");
		aClass.setAgeLimit(20);
		aClass.setExperienceRequirement(true);
		
		
		BClass bClass = new BClass();
		bClass.setVehicleUsed("otomobil");
		bClass.setAgeLimit(18);
		bClass.setExperienceRequirement(false);
		
		
		LearnerDriverManager learnerDriverManager1 = new LearnerDriverManager();
		learnerDriverManager1.whatIsTheFirstName(learnerDriver1);
		learnerDriverManager1.whatIsTheLastName(learnerDriver1);
		learnerDriverManager1.identityNumberOfLearnerDriver(learnerDriver1);
		learnerDriverManager1.enterPassword(learnerDriver1);
		learnerDriverManager1.add(learnerDriver1);
		learnerDriverManager1.update(learnerDriver1);
		learnerDriverManager1.delete(learnerDriver1);
		
		System.out.println(" ");
		System.out.println(" ");
		
		
		LearnerDriverManager learnerDriverManager2 = new LearnerDriverManager();
		learnerDriverManager2.whatIsTheFirstName(learnerDriver2);
		learnerDriverManager2.whatIsTheLastName(learnerDriver2);
		learnerDriverManager2.identityNumberOfLearnerDriver(learnerDriver2);
		learnerDriverManager2.enterPassword(learnerDriver2);
		learnerDriverManager2.add(learnerDriver2);
		learnerDriverManager2.update(learnerDriver2);
		learnerDriverManager2.delete(learnerDriver2);
		
		
		System.out.println(" ");
		System.out.println(" ");
		
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.whatIsTheFirstName(instructor1);
		instructorManager.whatIsTheLastName(instructor1);
		instructorManager.enterPassword(instructor1);
		instructorManager.add(instructor1);
		instructorManager.update(instructor1);
		instructorManager.delete(instructor1);
		
		System.out.println(" ");
		System.out.println(" ");
		
		
		AClassManager aClassManager = new AClassManager();
		aClassManager.whatIsTheVehicleUsed(aClass);
		aClassManager.whatIsTheAgeLimit(aClass);
		aClassManager.isThereExperienceRequirement(aClass);
		aClassManager.add(learnerDriver2);
		aClassManager.update(learnerDriver2);
		aClassManager.delete(learnerDriver2);
		
		System.out.println(" ");
		System.out.println(" ");
		
		
		BClassManager bClassManager = new BClassManager();
		bClassManager.whatIsTheVehicleUsed(bClass);
		bClassManager.whatIsTheAgeLimit(bClass);
		bClassManager.isThereExperienceRequirement(bClass);
		bClassManager.add(learnerDriver1);
		bClassManager.update(learnerDriver1);
		bClassManager.delete(learnerDriver1);

	}

}
