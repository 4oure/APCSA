package twentyHours.textAdventure;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

// https://docs.google.com/document/d/1ijHOY4zzAx5DeaaYOppCCMk5OaVkJTAnBKgjdxN-XPk/edit?usp=sharing

class Rooms {

	static String[] exits = new String[4];

	public static void build(Room[][] room, final int HEIGHT, final int WIDTH) {

		// Initialize rooms
		NPC Dan = new NPC("Dan", true, true);
		createRoom(room, HEIGHT, WIDTH);

		//w = row--
		//s = row++
		//a = col--
		//d = col ++
		// row, col

		// room 1, starter
		exits[0] = "s";
		exits[1] = "";
		exits[2] = "";
		exits[3] = "";
		room[0][0].setNumber(0);
		room[0][0].setName("Entry Way");
		room[0][0].setDescription("You are in the entryway to the old house.");
		room[0][0].setItems("newspaper");
		room[0][0].setItems("small box");
		room[0][0].setExits(exits);


		// room 2, x from room 1
		exits[0] = "w";
		exits[1] = "s";
		exits[2] = "";
		exits[3] = "";
		room[1][0].setNumber(1);
		room[1][0].setName("Hallway to the Foyer");
		room[1][0].setDescription("You are in the Hallway to the Foyer.");
		room[1][0].setItems("mouse");
		room[1][0].setItems("piece of paper");
		room[1][0].setExits(exits);

		exits[0] = "w";
		exits[1] = "s";
		exits[2] = "d";
		exits[3] = "";
		room[2][0].setNumber(2);
		room[2][0].setName("Foyer");
		room[2][0].setDescription("You are in the Foyer. Sunlight filters through a skylight.");
		room[2][0].setItems("keys");
		room[2][0].setItems("picture of a man"); // fixed this to be lowercase because the parsing thing makes it lowercase
		room[2][0].setExits(exits);

		exits[0] = "w";
		exits[1] = "s";
		exits[2] = "";
		exits[3] = "";
		room[3][0].setNumber(3);
		room[3][0].setName("Kitchen");
		room[3][0].setDescription("You are in the kitchen.");
		room[3][0].setItems("toaster");
		room[3][0].setItems("bottle");
		room[3][0].setItems("bloody knife");
		room[3][0].setExits(exits);

		exits[0] = "w";
		exits[1] = "s";
		exits[2] = "";
		exits[3] = "";
		room[4][0].setNumber(4);
		room[4][0].setName("Bathroom");
		room[4][0].setDescription("You are in the bathroom.");
		room[4][0].setItems("toilet paper");
		room[4][0].setItems("towel");
		room[4][0].setItems("soap");
		room[4][0].setExits(exits);

		// start of my new rooms

		exits[0] = "w";
		exits[1] = "s";
		exits[2] = "d";
		exits[3] = "";
		room[5][0].setNumber(5);
		room[5][0].setName("Living Room");
		room[5][0].setDescription("You are in the living room. The carpet has a blood-stained spot. I wonder whose blood that is..");
		room[5][0].setItems("tv remote");
		room[5][0].setItems("coaster");
		room[5][0].setItems("napkins");
		room[5][0].setExits(exits);

		exits[0] = "d";
		exits[1] = "w";
		exits[2] = "";
		exits[3] = "";
		room[6][0].setNumber(6);
		room[6][0].setName("Bedroom Hallway");
		room[6][0].setDescription("You are in the hallway that leads to the master bedroom. If the murderer lives in this very house, perhaps he would store his murder weapons in the room he sleeps in.");
		room[6][0].setItems("broom");
		room[6][0].setItems("slippers");
		room[6][0].setExits(exits);

		exits[0] = "a";
		exits[1] = "";
		exits[2] = "";
		exits[3] = "";
		room[5][1].setNumber(7);
		room[5][1].setName("Dining Room");
		room[5][1].setDescription("What was for dinner? Guess you'll find out, since you're now in the dining room.");
		room[5][1].setItems("cheeseburger from mcdonalds");
		room[5][1].setItems("reign energy drink");
		room[5][1].setExits(exits);

		exits[0] = "a";
		exits[1] = "d";
		exits[2] = "s";
		exits[3] = "";
		room[6][2].setNumber(8);
		room[6][2].setName("Bedroom");
		room[6][2].setDescription("You are now in the bedroom. The bed is unmade, there are clothes on the floor, and one of the drawers are open.");
		room[6][2].setItems("white wrinkled t-shirt");
		room[6][2].setItems("pillow");
		room[6][2].setItems("teddy bear");
		room[6][2].setExits(exits);

		exits[0] = "a";
		exits[1] = "d";
		exits[2] = "";
		exits[3] = "";
		room[6][1].setNumber(9);
		room[6][1].setName("End of bedroom hallway");
		room[6][1].setDescription("This is the end of the hallway. There is a splatter of some sort of liquid on the wall.");
		room[6][1].setItems("cup");
		room[6][1].setItems("untied shoe");
		room[6][1].setItems("soccer ball");
		room[6][1].setExits(exits);

		exits[0] = "a";
		exits[1] = "";
		exits[2] = "";
		exits[3] = "";
		room[6][3].setNumber(10);
		room[6][3].setName("Bedroom Bathroom");
		room[6][3].setDescription("You are now in the bathroom connected to the bedroom. I wonder what a murderer uses to shower..");
		room[6][3].setItems("toothbrush");
		room[6][3].setItems("hand towel");
		room[6][3].setItems("note");
		room[6][3].setExits(exits);

		exits[0] = "a";
		exits[1] = "d";
		exits[2] = "";
		exits[3] = "";
		room[2][1].setNumber(11);
		room[2][1].setName("Garage");
		room[2][1].setDescription("Surely if the murderer fled, he had to have taken a car.");
		room[2][1].setItems("wrench");
		room[2][1].setItems("tire pressure gauge");
		room[2][1].setItems("car keys");
		room[2][1].setExits(exits);

		exits[0] = "w";
		exits[1] = "";
		exits[2] = "";
		exits[3] = "";
		room[7][2].setNumber(12);
		room[7][2].setName("Bedroom walk-in closet");
		room[7][2].setDescription("The closet holds what a man holds closest to his heart.");
		room[7][2].setItems("fancy socks");
		room[7][2].setExits(exits);


		exits[0] = "a";
		exits[1] = "d";
		exits[2] = "s";
		exits[3] = "";
		room[2][2].setNumber(13);
		room[2][2].setName("Front yard");
		room[2][2].setDescription("Despite the resident possibly being a murderer, the suspect sure does have a nice property.");
		room[2][2].setItems("petunia flower");
		room[2][2].setItems("garden shovel");
		room[2][2].setItems("a pair of fancy dancy gardening gloves");
		room[2][2].setExits(exits);

		exits[0] = "a";
		exits[1] = "s";
		exits[2] = "";
		exits[3] = "";
		room[2][3].setNumber(14);
		room[2][3].setName("Neighbor's front yard");
		room[2][3].setDescription("The neighbor's front yard is very ugly.");
		room[2][3].setItems("pile of dirt");
		room[2][3].setItems("bug");
		room[2][3].setExits(exits);

		exits[0] = "w";
		exits[1] = "d";
		exits[2] = "s";
		exits[3] = "";
		room[3][2].setNumber(15);
		room[3][2].setName("Back Yard");
		room[3][2].setDescription("This is the back yard. He's even got a pool. There is a shed in the corner. A trail of blood leads to the neighbor's back yard.");
		room[3][2].setItems("pool noodle");
		room[3][2].setItems("bottle of water");
		room[3][2].setExits(exits);

		exits[0] = "w";
		exits[1] = "a";
		exits[2] = "d";
		exits[3] = "";
		room[3][3].setNumber(16);
		room[3][3].setName("Neighbor's back yard");
		room[3][3].setDescription("Here is the neighbor's back yard. Surrounded by a white pickett fence, there appears to be a greenhouse.");
		room[3][3].setItems("pizza box");
		room[3][3].setExits(exits);

		exits[0] = "w";
		exits[1] = "";
		exits[2] = "";
		exits[3] = "";
		room[4][3].setNumber(17);
		room[4][3].setName("Shed in the back yard");
		room[4][3].setDescription("An old shed built out of local timber. Perhaps he'd hide a body in here if the homeowner did it.");
		room[4][3].setItems("spider");
		room[4][3].setItems("empty beer can");
		room[4][3].setExits(exits);

		exits[0] = "a";
		exits[1] = "d";
		exits[2] = "";
		exits[3] = "";
		room[3][4].setNumber(18);
		room[3][4].setName("Neighbor's greenhouse");
		room[3][4].setDescription("The neighbor's greenhouse. A lot of pretty plants in here accompanied with an awful smell. A trail of blood leads to the back of the greenhouse.");
		room[3][4].setItems("shovel");
		room[3][4].setItems("rose");
		room[3][4].setItems("blood-soaked hatchet");
		room[3][4].setExits(exits);

		exits[0] = "a";
		exits[1] = "";
		exits[2] = "";
		exits[3] = "";
		room[3][5].setNumber(19);
		room[3][5].setName("Neighbor's greenhouse storage closet");
		room[3][5].setDescription("This is the creepy greenhouse storage closet. Dan, the murderer, jumps out at you and prepares to strike! You must attack!");
		room[3][5].setItems("a lovely petunia");
		room[3][5].setItems("severed head");
		room[3][5].setNPC(Dan);


	}


	private static void createRoom(Room[][] room, int HEIGHT, int WIDTH) {
		for (int i = 0; i < HEIGHT; i++) {
			for (int j = 0; j < WIDTH; j++) {
				room[i][j] = new Room();
			}
		}
	}


	public static void print(Room[][] room, int x, int y) {

		System.out.println();

		roomFunction(room, x, y);
	}


	private static void roomFunction(Room[][] room, int x, int y) {
		if (!room[x][y].getItems().isEmpty()) {
			System.out.println(room[x][y].getName());
			System.out.println(room[x][y].getDescription() + " - at Position: " + x + "," + y);
			System.out.println("You see: " + room[x][y].getItems());
			for (NPC npc : room[x][y].getNPClist()) {
				System.out.println("You see " +npc.getName());
			}

		} else {
			System.out.println(room[x][y].getName());
			System.out.println(room[x][y].getDescription() + " - at Position: " + x + "," + y);
			System.out.println("You see nothingness: " + " - in Position: " + x + "," + y);
			System.out.println(Arrays.toString(exits));
			for (NPC npc : room[x][y].getNPClist()) {
				System.out.println(npc.getName());
			}
		}
		checkForExits();
	}


	private static void checkForExits() {
		if (Arrays.toString(exits).contains("a")) {
			System.out.print("The door to the left is open");
		}
		if (Arrays.toString(exits).contains("w")) {
			System.out.print("The door at the top of the room is open");
		}
		if (Arrays.toString(exits).contains("d")) {
			System.out.print("The door to the right is open");
		}
		if (Arrays.toString(exits).contains("s")) {
			System.out.print("The door at the bottom of the room is open");
		}
	}




	// Remove item from room when added to inventory
	public static void removeItem(Room[][] room, int x, int y, String item) {

		room[x][y].deleteItem(item);
	}
}


class Room {

	private int number;
	private String name;
	private String description;
	private boolean locked = false;
	public ArrayList<String> items = new ArrayList<>();
	public ArrayList<String> exits = new ArrayList<>();
	public ArrayList<NPC> NPClist = new ArrayList<>();

//	public Room(int number, String name, String description, ArrayList<String> items, ArrayList<NPC> npcList) {
//
//	}


	public void setNumber(int number) {
		this.number = number;
	}

	public int getNumber() {
		return this.number;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDescription() {
		return this.description;
	}

	public boolean isLocked() {
		return this.locked;
	}

	public void setItems(ArrayList<String> items) {
		this.items = items;
	}

	public ArrayList<String> getExits() {
		return exits;
	}


	public ArrayList<NPC> getNPClist() {
		return this.NPClist;
	}

	public void setNPClist(ArrayList<NPC> NPClist) {
		this.NPClist = NPClist;
	}

	public boolean hasNPCs() {
		return !getNPClist().isEmpty();
	}

	public void setItems(String item) {
		this.items.add(item);
	}

	public void setNPC(NPC npc) {
		NPClist.add(npc);
	}

	public void removeNPC(NPC npc) {
		NPClist.remove(npc);
	}

	public void setExits(String[] exit) {
		this.exits.addAll(Arrays.asList(exit));
	}

	public void setLocked(boolean locked) {
		this.locked = locked;
	}

	public void deleteItem(String item) {
		this.items.remove(item);
	}

	public ArrayList<String> getItems() {
		return this.items;
	}

	public boolean checkIfNPCIsReal(String npcName) {
		for (NPC npc : NPClist) {
			if (npcName.equalsIgnoreCase(npc.getName())) {
				npc = null;
				return true;
			}
		}
		return false;
	}

	public NPC findWhich(String npcName) {
		for (NPC npc : NPClist) {
			if (npcName.equalsIgnoreCase(npc.getName())) {
				return npc;
			}
		}
		return new NPC("Error", true, true);
	}


	public int attack(String npcName, Room room) {
		NPC use;
		if (checkIfNPCIsReal(npcName)) {
			use = findWhich(npcName);
			use.setAlive(false);
			room.NPClist.remove(use);
			System.out.println("You killed " + use.getName());
			use = null;
			return 5;


		}
		return 0;
	}

	class item {

		private String name;
		private String description;

		public void setName(String name) {
			this.name = name;
		}

		public String getName() {
			return this.name;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getDescription() {
			return this.description;
		}

	}
}

