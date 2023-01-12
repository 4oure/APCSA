package twentyHours.textAdventure;

import java.util.Scanner;

public class Input {

	public static String getInput() {

		System.out.print("\r> ");
		Scanner scanIn = new Scanner(System.in);
		String input = scanIn.nextLine();

		return input.toLowerCase();
	}

	public static void helpCMDS() {
		System.out.println("These are the command you can type at the > prompt:");
		System.out.println(" 'w'/'a'/'s'/'d' to move");
		System.out.println(" 'look' for a description of the room you're in");
		System.out.println(" 'get' or 'take' + the item to get something");
		System.out.println(" 'i' to view your inventory");
		System.out.println(" 'score' to view your score");
		System.out.println("'drop' + the item you want to drop to drop the item");
		System.out.println(" 'restart' to restart the game");
		System.out.println(" 'quit' to quit the game");
	}
}


