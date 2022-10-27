package JCNeedsYourHelp;

public class Administrator extends Employee {
	String howMuchPower;
	String title;

	public Administrator(){

	}
	public Administrator(String howMuchPower, String title,String theirName, int theirSalary, boolean doTheyHaveAMasters, int theirAge, int howManyYearsOfExperience){
		super(theirName, theirSalary, doTheyHaveAMasters, theirAge, howManyYearsOfExperience);
		this.howMuchPower=howMuchPower;
		this.title = title;
	}

	public String getHowMuchPower() {
		return howMuchPower;
	}

	public void setHowMuchPower(String howMuchPower) {
		this.howMuchPower = howMuchPower;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
}
