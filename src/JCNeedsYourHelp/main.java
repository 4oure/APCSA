package JCNeedsYourHelp;
import java.util.ArrayList;

public class main extends Employee{
	public static void main(String[] args) {
		Staff peter = new Staff(true, false, false, "Peter", 30000, false, 44, 13, true, false, true, false );
		System.out.println(peter.toString());

		Faculty James = new Faculty("Math", 244, 128, "James Wilkinson", 38000, true, 49, 25, true, false, true, true);
		System.out.println(James.toString());

		Administrator person = new Administrator();

		ArrayList<Employee> gentlemen = new ArrayList<>();
		gentlemen.add(peter);
		gentlemen.add(James);
		James.listBenefits();





	}
}
