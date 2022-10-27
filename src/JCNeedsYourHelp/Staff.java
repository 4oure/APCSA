package JCNeedsYourHelp;

public class Staff extends Employee {
	boolean bachelorsDegree;
	boolean manualLabor;
	boolean deskJob;

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

	public Staff(){

	}

	public Staff(boolean doTheyHaveABachelors, boolean doesTheirJobInvolveManualLabor, boolean isItADeskJob, String theirName, int theirSalary, boolean doTheyHaveAMasters, int theirAge, int howManyYearsOfExperience){
		super(theirName, theirSalary, doTheyHaveAMasters, theirAge, howManyYearsOfExperience);
		bachelorsDegree = doTheyHaveABachelors;
		manualLabor = doesTheirJobInvolveManualLabor;
		deskJob = isItADeskJob;
	}
@Override
	public String toString(){
		return  "Hi, my name is " + name+ " and I work at John Carroll. I earn " +salary+ " and it is " +bachelorsDegree+ " that I have a bachelors degree. I am " + age + " years old and I have " +yearsOfExperience+ " years of experience. When people ask if I have a desk job, I say " +deskJob+ "!";
	}
}
