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
	String input = "" ;
	int comma1 =0;
	int comma2 = 0;
	String subjectName = "";
	String fileName = "";
	String differentGrades;

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

	public void setComma2(int period) {
		this.comma2 = comma2;
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

		File file = new File(filename);
		Scanner scanner = new Scanner(file);




	}

	public void setUpArray(){
		try{
			comma1   = fileName.indexOf(",");
			subjectName = fileName.substring(0,comma1);

			File file = new File(fileName);

			Scanner scanner = new Scanner(file);

			while (scanner.hasNextLine()){
				input = scanner.nextLine();
				comma2 = input.indexOf(",");

				differentGrades = input.substring(comma2+1);
				grades.add(Integer.parseInt(differentGrades));

			}


		} catch (FileNotFoundException e) {
			throw new RuntimeException(e);
		}

	}


	public static void main(String[] args) throws FileNotFoundException {

	}


}
