/* create a class called Subject

the constructor will take the file name as a parameter

the class should be able to provide all the info below

Subject name

Subject average

Highest Grade

Roster
 */

package scannertut;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Subject {
	String holder;
	File file = new File(holder);
	public Subject(String filename){
		holder = filename;

	}

	public double average() throws FileNotFoundException {
		double avg = 0;
		int counter = 0;
		Scanner scanner = new Scanner(file);
		while(scanner.hasNextLine()){
			String line = scanner.nextLine();
			String[] split = line.split(",");
			double  newNumber = Double.parseDouble(split[1]);
			avg+= newNumber;
			counter++;

		}
		return avg;

	}

	public double highestGrade() throws FileNotFoundException {
		double last =0;
		Scanner scanner = new Scanner(file);
		while(scanner.hasNextLine()){
			String line = scanner.nextLine();
			String[] split = line.split(",");
			double  newNumber = Double.parseDouble(split[1]);
			ArrayList<Double> myList = new ArrayList<>();

			myList.add(newNumber);

			last = Collections.max(myList);

		}
	return last;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("pls enter file name");
		String fileName = in.nextLine();
		Subject math = new Subject(fileName);
	}


}
