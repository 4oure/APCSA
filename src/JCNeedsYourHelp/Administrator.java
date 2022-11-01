package JCNeedsYourHelp;

public class Administrator extends Employee {
	String howMuchPower;
	String title;

	public Administrator(){

	}
	public Administrator(String howMuchPower, String title,String theirName, int theirSalary, boolean doTheyHaveAMasters, int theirAge, int howManyYearsOfExperience, boolean doTheyGotHealth, boolean doTheyGotDental, boolean doTheyGotVision, boolean doTheyGotRetirement){
		super(theirName, theirSalary, doTheyHaveAMasters, theirAge, howManyYearsOfExperience,doTheyGotHealth,doTheyGotDental,doTheyGotVision,doTheyGotRetirement);
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
	@Override
	public String toString() {
		return "Good day to you, my name is " + name + ". I work for John Carroll, holding the position of " + title + ". I have " + howMuchPower + " authority. I am " + age + " years old and have " + yearsOfExperience + " years of experience working in an occupation like this. I earn " + salary + " dollars per year.";
	}
}
