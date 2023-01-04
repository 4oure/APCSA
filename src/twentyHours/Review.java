package twentyHours;

import org.jetbrains.annotations.NotNull;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Review {

	private static HashMap<String, Double> sentiment = new HashMap<String, Double>();
	private static ArrayList<String> posAdjectives = new ArrayList<String>();
	private static ArrayList<String> negAdjectives = new ArrayList<String>();


	static {
		try {
			Scanner input = new Scanner(new File("/Users/gavin/IdeaProjects/APCSA/src/twentyHours/cleanSentiment.csv"));
			while (input.hasNextLine()) {
				String[] temp = input.nextLine().split(",");
				sentiment.put(temp[0], Double.parseDouble(temp[1]));
				//System.out.println("added "+ temp[0]+", "+temp[1]);
			}
			input.close();
		} catch (Exception e) {
			System.out.println("Error reading or parsing cleanSentiment.csv");
		}

		try {
			Scanner input = new Scanner(new File("/Users/gavin/IdeaProjects/APCSA/src/twentyHours/positiveAdjectives.txt"));
			while (input.hasNextLine()) {
				String temp = input.nextLine().trim();
				System.out.println(temp);
				posAdjectives.add(temp);
			}
			input.close();
		} catch (Exception e) {
			System.out.println("Error reading or parsing postitiveAdjectives.txt\n" + e);
		}

		//read in the negative adjectives in negativeAdjectives.txt
		try {
			Scanner input = new Scanner(new File("/Users/gavin/IdeaProjects/APCSA/src/twentyHours/negativeAdjectives.txt"));
			while (input.hasNextLine()) {
				negAdjectives.add(input.nextLine().trim());
			}
			input.close();
		} catch (Exception e) {
			System.out.println("Error reading or parsing negativeAdjectives.txt");
		}
	}

	/**
	 * returns a string containing all of the text in fileName (including punctuation),
	 * with words separated by a single space
	 */
	public static String textToString(String fileName) {
		String temp = "";
		try {
			Scanner input = new Scanner(new File(fileName));

			//add 'words' in the file to the string, separated by a single space
			while (input.hasNext()) {
				temp = temp + input.next() + " ";
			}
			input.close();

		} catch (Exception e) {
			System.out.println("Unable to locate " + fileName);
		}
		//make sure to remove any additional space that may have been added at the end of the string.
		return temp.trim();
	}

	/**
	 * @returns the sentiment value of word as a number between -1 (very negative) to 1 (very positive sentiment)
	 */
	public static double sentimentVal(String word) {
		try {
			return sentiment.get(word.toLowerCase());
		} catch (Exception e) {
			return 0;
		}
	}

	/**
	 * Returns the ending punctuation of a string, or the empty string if there is none
	 */
	public static String getPunctuation(@NotNull String word) {
		String punc = "";
		for (int i = word.length() - 1; i >= 0; i--) {
			if (!Character.isLetterOrDigit(word.charAt(i))) {
				punc = punc + word.charAt(i);
			} else {
				return punc;
			}
		}
		return punc;
	}

	/**
	 * Returns the word after removing any beginning or ending punctuation
	 */
	public static String removePunctuation(@NotNull String word) {
		while (word.length() > 0 && !Character.isAlphabetic(word.charAt(0))) {
			word = word.substring(1);
		}
		while (word.length() > 0 && !Character.isAlphabetic(word.charAt(word.length() - 1))) {
			word = word.substring(0, word.length() - 1);
		}

		return word;
	}

	/**
	 * Randomly picks a positive adjective from the positiveAdjectives.txt file and returns it.
	 */
	public static String randomPositiveAdj() {
		int index = (int) (Math.random() * posAdjectives.size());
		return posAdjectives.get(index);
	}

	/**
	 * Randomly picks a negative adjective from the negativeAdjectives.txt file and returns it.
	 */
	public static String randomNegativeAdj() {
		int index = (int) (Math.random() * negAdjectives.size());
		return negAdjectives.get(index);

	}

	/**
	 * Randomly picks a positive or negative adjective and returns it.
	 */
	public static String randomAdjective() {
		boolean positive = Math.random() < .5;
		if (positive) {
			return randomPositiveAdj();
		} else {
			return randomNegativeAdj();
		}
	}

	public static double totalSentiment(String fileName) {

		double temp = 0;
		try {
			Scanner input = new Scanner(new File(fileName));

			//add 'words' in the file to the string, separated by a single space
			while (input.hasNext()) {
				temp += sentimentVal(removePunctuation(input.next()));
			}
			input.close();

		} catch (Exception e) {
			System.out.println("Unable to locate " + fileName);
		}

		return temp;
	}


	public static int starRating(String fileName) {
		double number = totalSentiment(fileName);
		if (number < -2.5) {
			return 0;
		} else if (number < 0) {
			return 1;
		} else if (number < 1) {
			return 2;
		} else if (number < 2) {
			return 3;
		} else if (number < 3) {
			return 4;
		} else if (number < 4) {
			return 5;
		}
		return 0;
	}


	public static String fakeReview(String fileName, Boolean wantItGood) {
		String last = "";
		try {
			Scanner input = new Scanner(new File(fileName));
			// if temp is -1 then just conatenate
			// if not then concatenate with randomadjective
			while (input.hasNext()) {
				ArrayList<String> temp = new ArrayList<>();
				String wordToAdd = input.next().trim();
				temp.add(wordToAdd);

				//System.out.println(temp);
				if (wantItGood) {
					for (String x : temp) {
						if (!x.contains("*")) {
							last = last + " " + x;
						} else {
							last = last + " " + randomPositiveAdj();

						}
					}

				} else {
					for (String x : temp) {
						if (!x.contains("*")) {
							last = last + " " + x;
						} else {
							last = last + " " + randomNegativeAdj();
						}

					}

				}

			}
		} catch (FileNotFoundException e) {
			throw new RuntimeException(e);
		}
		return last;

	}


	public static void main(String[] args) {
//		System.out.println(sentimentVal("hi"));
//		System.out.println(sentimentVal("awful"));
//		System.out.println(sentimentVal("dan"));
//		System.out.println(totalSentiment("/Users/gavin/IdeaProjects/APCSA/src/twentyHours/sampleReview.txt"));
//		System.out.println(starRating("/Users/gavin/IdeaProjects/APCSA/src/twentyHours/sampleReview.txt"));
//
		System.out.println(fakeReview("/Users/gavin/IdeaProjects/APCSA/src/twentyHours/sampleReview.txt", true));
		String hi = "One Word";
		System.out.println(hi.substring(1));


	}
}
