package JCNeedsYourHelp;

import java.util.ArrayList;

public class Employee {
	String name;
	int salary;
	boolean mastersDegree;
	int age;
	int yearsOfExperience;

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


	public static double payrollTotal(ArrayList<Employee> friends){
		double total = 0;
		for(Employee person : friends){
			total += person.getSalary();
		}
		return total;
	}


	public Employee(){

	}
	public Employee(String theirName, int theirSalary, boolean doTheyHaveAMasters, int theirAge, int howManyYearsOfExperience){
		name = theirName;
		salary = theirSalary;
		mastersDegree = doTheyHaveAMasters;
		age = theirAge;
		yearsOfExperience = howManyYearsOfExperience;


	}
}
