package twentyHours.textAdventure;

import java.util.ArrayList;

class Inventory {


	public static int checkItem(int row, int col, String item, ArrayList<String> inventory, Room[][] room, int score) {

		// Check if item is a valid room item
		boolean validRoomItem = isValidRoomItem(col, item, room[row]);

		// Check if item is already in inventory
		boolean inInventory = isInInventory(item, inventory);

		// Text output
		score = calculateScore(row, col, item, inventory, room, score, validRoomItem, inInventory);

		return score;
	}

	private static int calculateScore(int row, int col, String item, ArrayList<String> inventory, Room[][] room, int score, boolean validRoomItem, boolean inInventory) {
		if (!inInventory && validRoomItem) {
			//Sounds.playItemPickup();
			System.out.println("You pick up the " + item + ".");
			inventory.add(item);
			score += 5;
			Rooms.removeItem(room, row, col, item);
		} else if (inInventory) {
			System.out.println("You already have the " + item + ".");
		} else if (!validRoomItem) {
			System.out.println("You don't see that here.");
		} else {
			System.out.println("I don't understand.");
		}
		return score;
	}

	private static boolean isInInventory(String item, ArrayList<String> inventory) {
		boolean inInventory = false;
		for (String itemInInv : inventory) {
			if (itemInInv.equalsIgnoreCase(item)) { // added ignore case
				inInventory = true;
				break;
			}
		}
		return inInventory;
	}

	private static boolean isValidRoomItem(int col, String item, Room[] room) {
		boolean validRoomItem = false;
		for (String roomItems : room[col].items) {
			if (roomItems.equalsIgnoreCase(item) && !roomItems.equalsIgnoreCase("car")) { // added ignorecase
				validRoomItem = true;
				break;
			}
		}
		return validRoomItem;
	}

	public static void print(ArrayList<String> inventory) {

		System.out.println("Inventory:");
		for (String item : inventory) {
			System.out.println(item);
		}
	}

	public static int dropItem(ArrayList<String> inventory, String item, Room[][] room, int row, int col, int score) {

		if (inventory.contains(item)) {
			System.out.println("You drop the " + item);
			inventory.remove(item);
			room[row][col].setItems(item);
			return score -= 5;

		} else {
			System.out.println("You don't have the " + item);
		}
		return score;
	}
}

