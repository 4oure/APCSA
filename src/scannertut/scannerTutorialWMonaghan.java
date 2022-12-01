package scannertut;
import java.io.*;
import java.util.*;


public class scannerTutorialWMonaghan{
	public static void main(String[] args) {
		File file = new File("/Users/gavin/IdeaProjects/APCSA/src/scannertut/data");
		double avg = 0;
		int counter = 0;
		try{
			Scanner scanner = new Scanner(file);
			while(scanner.hasNextLine()){


				String line = scanner.nextLine();
				String[] split = line.split(",");
				double  newNumber = Double.parseDouble(split[1]);
				avg+= newNumber;
				counter++;

			}
			System.out.println("Average is " +avg/counter);

		}
		catch (FileNotFoundException e){
			e.printStackTrace();

		}
	}
}