package JCNeedsYourHelp;

public class Staff extends Employee {
	private boolean bachelorsDegree;
	private boolean manualLabor;
	private boolean deskJob;

	public boolean isBachelorsDegree() {
		return bachelorsDegree;
	}

	public void setBachelorsDegree(boolean bachelorsDegree) {
		this.bachelorsDegree = bachelorsDegree;
	}

	public boolean isManualLabor() {
		return manualLabor;
	}

	public void setManualLabor(boolean manualLabor) {
		this.manualLabor = manualLabor;
	}

	public boolean isDeskJob() {
		return deskJob;
	}

	public void setDeskJob(boolean deskJob) {
		this.deskJob = deskJob;
	}

	public Staff() {

	}

	public Staff(boolean doTheyHaveABachelors, boolean doesTheirJobInvolveManualLabor, boolean isItADeskJob, String theirName, int theirSalary, boolean doTheyHaveAMasters, int theirAge, int howManyYearsOfExperience, boolean doTheyGotHealth, boolean doTheyGotDental, boolean doTheyGotVision, boolean doTheyGotRetirement) {
		super(theirName, theirSalary, doTheyHaveAMasters, theirAge, howManyYearsOfExperience, doTheyGotHealth, doTheyGotDental, doTheyGotVision, doTheyGotRetirement);
		bachelorsDegree = doTheyHaveABachelors;
		manualLabor = doesTheirJobInvolveManualLabor;
		deskJob = isItADeskJob;
	}

	@Override
	public String toString() {
		return "Hi, my name is " + getName() + " and I work at John Carroll. I earn " + getSalary() + " and it is " + bachelorsDegree + " that I have a bachelors degree. I am " + getAge() + " years old and I have " + getYearsOfExperience() + " years of experience. When people ask if I have a desk job, I say " + deskJob + "!";
		//return String.format("Hi my name is %s ... %s", getName(), getSalary())
	}
}
