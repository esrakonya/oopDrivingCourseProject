package drivingCourseProject.entities.concretes;

import drivingCourseProject.core.entities.Person;

public class Instructor extends Person{
	
	private int score;

	public Instructor(int score) {
		super();
		this.score = score;
	}
	
	public Instructor() {
		
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
}
