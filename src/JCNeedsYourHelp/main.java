package JCNeedsYourHelp;
import java.util.ArrayList;

public class main {
	public static void main(String[] args) {
		Staff peter = new Staff(true, false, false, "Peter", 30000, false, 44, 13 );
		System.out.println(peter.toString());

		Faculty James = new Faculty("Math", 244, 128, "James Wilkonson", 38000, true, 49, 25);
		System.out.println(James.toString());

	}
}
