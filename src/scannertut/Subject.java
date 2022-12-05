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

		this.fileName= filename;
		setUpArray();


	}

	public void setUpArray(){
		try{
			File file = new File(fileName);

			Scanner scanner = new Scanner(file);

			while (scanner.hasNextLine()){
				input = scanner.nextLine();
				comma2 = input.indexOf(",");
				subjectName = input.substring(0,comma2);

				differentGrades = input.substring(comma2+2); // has to be comma+1 bc substring is inclusive for first
				grades.add(Integer.parseInt(differentGrades)); //string to int here, so we can load it into array

			}

			scanner.close();


		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException(e);

		}

	}

	public double average(){
		double avg = 0;
		int divideByThis = grades.size();
		for (int x : grades){
			avg += x;
		}

		return avg/divideByThis;
	}


	public static void main(String[] args) throws FileNotFoundException {

		Subject math = new Subject("/Users/gavin/IdeaProjects/APCSA/data");
		System.out.println(math.average());


	}


}
