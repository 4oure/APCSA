package JCNeedsYourHelp;

import java.util.ArrayList;

public class Employee {
	private String name;
	private int salary;
	private boolean mastersDegree;
	private int age;
	private int yearsOfExperience;
	private boolean health;
	private boolean dental;
	private boolean vision;
	private boolean retirement;


	public boolean isHealth() {
		return health;
	}

	public void setHealth(boolean health) {
		this.health = health;
	}

	public boolean isDental() {
		return dental;
	}

	public void setDental(boolean dental) {
		this.dental = dental;
	}

	public boolean isVision() {
		return vision;
	}

	public void setVision(boolean vision) {
		this.vision = vision;
	}

	public boolean isRetirement() {
		return retirement;
	}

	public void setRetirement(boolean retirement) {
		this.retirement = retirement;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public boolean isMastersDegree() {
		return mastersDegree;
	}

	public void setMastersDegree(boolean mastersDegree) {
		this.mastersDegree = mastersDegree;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getYearsOfExperience() {
		return yearsOfExperience;
	}

	public void setYearsOfExperience(int yearsOfExperience) {
		this.yearsOfExperience = yearsOfExperience;
	}


	public static double payrollTotal(ArrayList<Employee> friends) {
		double total = 0;
		for (Employee person : friends) {
			total += person.getSalary();
		}
		return total;
	}


	public Employee() {

	}

	public Employee(String theirName, int theirSalary, boolean doTheyHaveAMasters, int theirAge, int howManyYearsOfExperience, boolean doTheyGotHealth, boolean doTheyGotDental, boolean doTheyGotVision, boolean doTheyGotRetirement) {
		name = theirName;
		salary = theirSalary;
		mastersDegree = doTheyHaveAMasters;
		age = theirAge;
		yearsOfExperience = howManyYearsOfExperience;
		health = doTheyGotHealth;
		dental = doTheyGotDental;
		vision = doTheyGotVision;
		retirement = doTheyGotRetirement;

	}
}

