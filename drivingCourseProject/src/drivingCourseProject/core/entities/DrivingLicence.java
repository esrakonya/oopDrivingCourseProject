package drivingCourseProject.core.entities;

public class DrivingLicence {
	
	private String vehicleUsed;
	
	private int ageLimit;
	
	private boolean experienceRequirement;

	public DrivingLicence(String vehicleUsed, int ageLimit, boolean experienceRequirement) {
		super();
		this.vehicleUsed = vehicleUsed;
		this.ageLimit = ageLimit;
		this.experienceRequirement = experienceRequirement;
	}
	
	public DrivingLicence() {
		
	}

	public String getVehicleUsed() {
		return vehicleUsed;
	}

	public void setVehicleUsed(String vehicleUsed) {
		this.vehicleUsed = vehicleUsed;
	}

	public int getAgeLimit() {
		return ageLimit;
	}

	public void setAgeLimit(int ageLimit) {
		this.ageLimit = ageLimit;
	}

	public boolean getExperienceRequirement() {
		return experienceRequirement;
	}

	public void setExperienceRequirement(boolean experienceRequirement) {
		this.experienceRequirement = experienceRequirement;
	}
}
