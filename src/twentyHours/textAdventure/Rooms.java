package twentyHours.textAdventure;
import java.util.ArrayList;

// https://docs.google.com/document/d/1ijHOY4zzAx5DeaaYOppCCMk5OaVkJTAnBKgjdxN-XPk/edit?usp=sharing

class Rooms {

	static String[] exits = new String[4];

	public static void build(Room[][] room, final int HEIGHT, final int WIDTH) {

		// Initialize rooms
		for (int i = 0; i < HEIGHT; i++) {
			for (int j = 0; j < WIDTH; j++) {
				room[i][j] = new Room(i, "", "", null);
			}
		}
		//w = row--
		//s = row++
		//a = col--
		//d = col ++
		// row, col

		// room 1, starter
		exits[0] = "s"; exits[1] = ""; exits[2] = ""; exits[3] = "";
		room[0][0].setNumber(0);
		room[0][0].setName("Entry Way");
		room[0][0].setDescription("You are in the entryway to the old house.");
		room[0][0].setItems("newspaper");
		room[0][0].setItems("small box");
		room[0][0].setExits(exits);

		// room 2, x from room 1
		exits[0] = "w"; exits[1] = "s"; exits[2] = ""; exits[3] = "";
		room[1][0].setNumber(1);
		room[1][0].setName("Hallway to the Foyer");
		room[1][0].setDescription("You are in the Hallway to the Foyer.");
		room[1][0].setItems("mouse");
		room[1][0].setItems("piece of paper");
		room[1][0].setExits(exits);

		exits[0] = "w"; exits[1] = "s"; exits[2] = ""; exits[3] = "";
		room[2][0].setNumber(2);
		room[2][0].setName("Foyer");
		room[2][0].setDescription("You are in the Foyer. Sunlight filters through a skylight.");
		room[2][0].setItems("keys");
		room[2][0].setItems("picture of a man"); // fixed this to be lowercase because the parsing thing makes it lowercase
		room[2][0].setExits(exits);

		exits[0] = "w"; exits[1] = "s"; exits[2] = ""; exits[3] = "";
		room[3][0].setNumber(3);
		room[3][0].setName("Kitchen");
		room[3][0].setDescription("You are in the kitchen.");
		room[3][0].setItems("toaster");
		room[3][0].setItems("bottle");
		room[3][0].setItems("bloody knife");
		room[3][0].setExits(exits);

		exits[0] = "w"; exits[1] = "s"; exits[2] = ""; exits[3] = "";
		room[4][0].setNumber(4);
		room[4][0].setName("Bathroom");
		room[4][0].setDescription("You are in the bathroom.");
		room[4][0].setItems("toilet paper");
		room[4][0].setItems("towel");
		room[4][0].setItems("soap");

		// start of my new rooms

		exits[0] = "w"; exits[1] = "s"; exits[2] = ""; exits[3] = "";
		room[5][0].setNumber(5);
		room[5][0].setName("Living Room");
		room[5][0].setDescription("You are in the living room. The carpet has a blood-stained spot. I wonder whose blood that is..");
		room[5][0].setItems("tv remote");
		room[5][0].setItems("coaster");
		room[5][0].setItems("napkins");

		room[6][0].setNumber(6);
		room[6][0].setName("Bedroom Hallway");
		room[6][0].setDescription("You are in the hallway that leads to the master bedroom. If the murderer lives in this very house, perhaps he would store his murder weapons in the room he sleeps in.");
		room[6][0].setItems("broom");
		room[6][0].setItems("slippers");

		room[5][1].setNumber(7);
		room[5][1].setName("Dining Room");
		room[5][1].setDescription("What was for dinner? Guess you'll find out, since you're now in the dining room.");
		room[5][1].setItems("cheeseburger from mcdonalds");
		room[5][1].setItems("reign energy drink");

		room[6][2].setNumber(8);
		room[6][2].setName("Bedroom");
		room[6][2].setDescription("You are now in the bedroom. The bed is unmade, there are clothes on the floor, and one of the drawers are open.");
		room[6][2].setItems("white wrinkled t-shirt");
		room[6][2].setItems("pillow");
		room[6][2].setItems("teddy bear");

		room[6][1].setNumber(9);
		room[6][1].setName("End of bedroom hallway");
		room[6][1].setDescription("This is the end of the hallway. There is a splatter of some sort of liquid on the wall.");
		room[6][1].setItems("cup");
		room[6][1].setItems("untied shoe");
		room[6][1].setItems("soccer ball");

		room[6][3].setNumber(10);
		room[6][3].setName("Bedroom Bathroom");
		room[6][3].setDescription("You are now in the bathroom connected to the bedroom. I wonder what a murderer uses to shower..");
		room[6][3].setItems("toothbrush");
		room[6][3].setItems("hand towel");
		room[6][3].setItems("note");

		room[2][1].setNumber(11);
		room[2][1].setName("Garage");
		room[2][1].setDescription("Surely if the murderer fled, he had to have taken a car.");
		room[2][1].setItems("wrench");
		room[2][1].setItems("tire pressure gauge");
		room[2][1].setItems("car keys");

		room[7][2].setNumber(12);
		room[7][2].setName("Bedroom walk-in closet");
		room[7][2].setDescription("The closet holds what a man holds closest to his heart.");
		room[7][2].setItems("fancy socks");

		room[2][2].setNumber(13);
		room[2][2].setName("Front yard");
		room[2][2].setDescription("Despite the resident possibly being a murderer, the suspect sure does have a nice property.");
		room[2][2].setItems("petunia flower");
		room[2][2].setItems("garden shovel");
		room[2][2].setItems("a pair of fancy dancy gardening gloves");

		room[2][3].setNumber(14);
		room[2][3].setName("Neighbor's front yard");
		room[2][3].setDescription("The neighbor's front yard is very ugly.");
		room[2][3].setItems();



	}

	public static void print(Room[][] room, int x, int y) {

		System.out.println();

		if (!room[x][y].getItems().isEmpty()){
			System.out.println(room[x][y].getDescription() + " - at Position: " + x + "," + y);
			System.out.println("You see: " + room[x][y].getItems()) ;
		}
		else
			System.out.println("You see nothingness: " + " - in Position: " + x + "," + y);
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

	public Room(int number, String name, String description,
	            ArrayList<String> items) {
	}

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

	public void setItems(String item) {
		this.items.add(item);
	}

	public void setExits(String[] exit) {
		for(int i = 0; i < exit.length; i++)
			this.exits.add(exit[i]);
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
}

class item {

	private String name;
	private String description;
	private boolean hidden = false;

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

	public void setHidden(boolean hidden) {
		this.hidden = hidden;
	}

}

