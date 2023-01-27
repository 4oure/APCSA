package twentyHours.textAdventure;

import java.util.ArrayList;
import java.util.MissingFormatArgumentException;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {

		// Build rooms
		final int HEIGHT = 15;
		final int WIDTH = 15;

		Room[][] room = new Room[HEIGHT][WIDTH];
		Rooms.build(room, HEIGHT, WIDTH);
		int row = 0;
		int col = 0;
		int score = 0;


		// Load inventory
		ArrayList<String> inventory = new ArrayList<>();

		// Title Screen
		titlePrint();

		// help commands output
		Input.helpCMDS();


		//Sounds.playTitleMusic(1);

		// Print starting room description
		Rooms.print(room, row, col);

		// Start game loop
		boolean playing = true;
		while (playing) {

			// Get user input
			String input = Input.getInput().toLowerCase();

			// Movement commands
			switch (input) {
				case "w":
					if (room[row][col].exits.contains("w")) {
						row--;
						Rooms.print(room, row, col);
					}else {
						System.out.println("You can't go that way.");
						break;
					}
					break;
				case "s":
					if (room[row][col].exits.contains("s")) {
						row++;
						Rooms.print(room, row, col);
					}else {
						System.out.println("You can't go that way.");
						break;
					}
					break;
				case "d":
					if (room[row][col].exits.contains("d")) {
						col++;
						Rooms.print(room, row, col);
					}else {
						System.out.println("You can't go that way.");
						break;
					}
					break;
				case "a":
					if (room[row][col].exits.contains("a")) {
						col--;
						Rooms.print(room, row, col);
					}else {
						System.out.println("You can't go that way.");
						break;
					}
					break;
				// Look commands
				case "look":
					Rooms.print(room, row, col);
					break;
				default:
					// Get commands
					if(input.length()>5) {
						if (input.substring(0, 4).equalsIgnoreCase("get ") || input.substring(0, 5).equalsIgnoreCase("take ")) {
							boolean somethingAfterCmd = input.substring(input.indexOf(" ")).length() > 1;
							score = findScore(room, row, col, score, inventory, input, somethingAfterCmd);
						}
					}

					// Inventory commands
					else if (input.equals("i") || input.equals("inv")
							|| input.equals("inventory")) {
						Inventory.print(inventory);
					} else if (input.length() > 5 && input.startsWith("drop ")) {
						boolean somethingAfterCmd = input.substring(input.indexOf(" ")).length() > 1;
						if (somethingAfterCmd) {
							String item = input.substring(input.indexOf(' ') + 1);
							score = Inventory.dropItem(inventory, item, room, row, col, score);
						}
					} else if (input.equals("score")) {
						System.out.println("Score: " + score + "/240");
					} else if (input.equals("restart")) {
						System.out.println();
						Main.main(args);
					} else if (input.equals("help")) {
						Input.helpCMDS();
					} else if (input.length() > 6 && input.startsWith("attack  ")) {
						boolean somethingAfterCmd = input.substring(input.indexOf(" ")).length() > 1;
						String person = input.substring(input.indexOf(' ')+1);
							score += Room.attack(person);

					}

					// Quit commands
					else if (input.equals("quit")) {
						System.out.println("Goodbye!");
						playing = false;

						// Catch-all for invalid input
					} else {
						System.out.println("Invalid command.");
					}
			}

			checkScore(score);
		}
		System.exit(0);
	}


	private static int findScore(Room[][] room, int row, int col, int score, ArrayList<String> inventory, String input, boolean somethingAfterCmd) {
		if (somethingAfterCmd) {
			String item = input.substring(input.indexOf(' ') + 1);
			if (item.equalsIgnoreCase("car")) {
				System.out.println("You can not store a car in your inventory.");
			} else {
				switch (item) {
					case "reign energy drink":
						System.out.println("EUGH. DAN MUST HAVE BEEN HERE. Mister Monaghan would not approve of this energy drink.");
						break;
					case "note":
						System.out.println("The note reads: You will never find me. I am not in this house.");
						break;

				}
				// Sounds.playItemPickup();

				score = Inventory.checkItem(row, col, item, inventory, room, score);

			}
		}
		return score;
	}

	private static void checkScore(int score) {
		if (score == 240) {
			System.out.println("You win!");
		}
	}

	private static void titlePrint() {
		System.out.println("+-----------------------------------+");
		System.out.println("| Horror Text Adventure: Greenhouse |");
		System.out.println("+-----------------------------------+");
	}
}

