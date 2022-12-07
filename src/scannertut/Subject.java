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
import java.util.Scanner;

public class Subject {

	ArrayList<Integer> grades = new ArrayList<>();
	ArrayList<String> names = new ArrayList<>();
	String input = "";
	int comma1 = 0;
	int comma2 = 0;
	String subjectName = "";
	String fileName = "";
	String differentGrades = "";

	String name = "";

	public ArrayList<Integer> getGrades() {
		return grades;
	}

	public void setGrades(ArrayList<Integer> grades) {
		this.grades = grades;
	}

	public String getInput() {
		return input;
	}

	public void setInput(String input) {
		this.input = input;
	}

	public int getComma1() {
		return comma1;
	}

	public void setComma1(int comma) {
		this.comma1 = comma;
	}

	public int getComma2() {
		return comma2;
	}

	public ArrayList<String> getNames() {
		return names;
	}

	public void setNames(ArrayList<String> names) {
		this.names = names;
	}

	public void setComma2(int comma2) {
		this.comma2 = comma2;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getDifferentGrades() {
		return differentGrades;
	}

	public void setDifferentGrades(String differentGrades) {
		this.differentGrades = differentGrades;
	}


	public Subject(String filename) throws FileNotFoundException {

		this.fileName = filename;
		setUpArray();


	}

	public void setUpArray() {
		try {
			File file = new File(fileName);

			Scanner scanner = new Scanner(file);

			while (scanner.hasNextLine()) {
				input = scanner.nextLine();
				comma2 = input.indexOf(",");

				name = input.substring(0, comma2);

				differentGrades = input.substring(comma2 + 2); // has to be comma+1 bc substring is inclusive for first
				grades.add(Integer.parseInt(differentGrades)); //string to int here, so we can load it into array
				names.add(name);
			}

			scanner.close();


		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException(e);

		}

	}

	public double average() {
		double avg = 0;
		int divideByThis = grades.size();
		for (int x : grades) {
			avg += x;
		}

		return avg / divideByThis;
	}

	public String listAllNames() {
		String returnNames = "";

		for (String x : names) {
			returnNames += x + "\n";
		}
		return returnNames;

	}

	public double giveHighestGrade() {
		int max = grades.get(0);
		for (int i = 1; i < grades.size(); i++) {
			if (grades.get(i) > max) {
				max = grades.get(i);

			}
		}

		return max;
	}

	public String giveSubjectName() {
		String str = "";
		int indexof = 0;
		if (fileName.contains("/")) {
			indexof = fileName.indexOf("/");
		}
		str = fileName.substring(indexof);
		return str;
	}


	public static void main(String[] args) throws FileNotFoundException {
		boolean hello = true;

		while (hello) {
			Scanner whatFile = new Scanner(System.in);
			System.out.println("give file pathway plz");
			String fileThing = whatFile.nextLine();
			Subject math = new Subject(fileThing);
			System.out.println(math.average());
			System.out.println(math.listAllNames());
			System.out.println(math.giveHighestGrade());
			System.out.println(math.giveSubjectName());
			Scanner whatTwo = new Scanner(System.in);
			System.out.println("want another file?? plz type yes or no");
			String doTheyWantAnother = whatTwo.nextLine();
			if (doTheyWantAnother.equalsIgnoreCase("true") || doTheyWantAnother.equalsIgnoreCase("yes")) {
				continue;
			}
			if (doTheyWantAnother.equalsIgnoreCase("false") || doTheyWantAnother.equalsIgnoreCase("no")) {
				System.out.println("ok bye");
				hello = false;
			}
		}
	}
}
