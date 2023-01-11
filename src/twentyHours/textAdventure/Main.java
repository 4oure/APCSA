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
		int col = 7;
		int score = 0;




		// Load inventory
		ArrayList<String> inventory = new ArrayList<>();

		// Title Screen
		System.out.println("+-------------------------------+");
		System.out.println("| Text Adventure: Skeleton Code |");
		System.out.println("+-------------------------------+");

		// help commands output
		Input.helpCMDS();


		//Sounds.playTitleMusic(1);

		// Print starting room description
		Rooms.print(room, row, col);

		// Start game loop
		boolean playing = true;
		while (playing) {

			// Get user input
			String input = Input.getInput();

			// Movement commands
			switch(input.toLowerCase()) {
				case "w":
					if (room[row][col].exits.contains("s")) {
						row++;
						Rooms.print(room, row, col);
					} else {
						System.out.println("You can't go that way.");
					}
					break;
				case "s":
					if (room[row][col].exits.contains("w")) {
						row--;
						Rooms.print(room, row, col);
					} else {
						System.out.println("You can't go that way.");
					}
					break;
				case "d":
					if (room[row][col].exits.contains("e")) {
						col++;
						Rooms.print(room, row, col);
					} else {
						System.out.println("You can't go that way.");
					}
					break;
				case "a":
					if (room[row][col].exits.contains("w")) {
						col--;
						Rooms.print(room, row, col);
					} else {
						System.out.println("You can't go that way.");
					}
					break;

				// Look commands
				case "look":
					Rooms.print(room, row, col);
					break;

				// Get commands
				default:
					if (input.length() > 4 && ((input.substring(0, 4).equals("get ") || input.substring(0, 5).equals("take ")))) {
						if (input.substring(input.indexOf(' ')).length() > 1) {
							String item = input.substring(input.indexOf(' ') + 1);
							switch (item) {
								case "reign energy drink" -> System.out.println("EUGH. DAN MUST HAVE BEEN HERE.");
								case "note" -> System.out.println("The note reads: You will never find me. I am not in this house.");
							}
							// Sounds.playItemPickup();
							score = Inventory.checkItem(row, col, item, inventory, room, score);
						}
					}

					// Inventory commands
					else if (input.equals("i") || input.equals("inv")
							|| input.equals("inventory")) {
						Inventory.print(inventory);
					} else if (input.length() > 5 && input.substring(0, 5).equals("drop ")) {
						if (input.substring(input.indexOf(' ')).length() > 1) {
							String item = input.substring(input.indexOf(' ') + 1);
							Inventory.dropItem(inventory, item, room, row, col);
						}
					} else if (input.equals("score")) {
						System.out.println("Score: " + score + "/500");
					} else if (input.equals("restart")) {
						System.out.println();
						Main.main(args);
					} else if (input.equals("help")) {
						Input.helpCMDS();
					}

					// Quit commands
					else if (input.equals("quit")) {
						System.out.println("Goodbye!");
						playing = false;

						// Catch-all for invalid input
					} else {
						System.out.println("You can't do that.");
					}
					break;
			}
		}
		System.exit(0);
	}
}

