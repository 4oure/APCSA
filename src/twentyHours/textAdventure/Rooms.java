package twentyHours.textAdventure;
import java.util.ArrayList;

class Rooms {

	static String exits[] = new String[4];

	public static void build(Room[][] room, final int HEIGHT, final int WIDTH) {

		// Initialize rooms
		for (int i = 0; i < HEIGHT; i++) {
			for (int j = 0; j < WIDTH; j++) {
				room[i][j] = new Room(i, "", "", null);
			}
		}


		exits[0] = ""; exits[1] = "s"; exits[2] = ""; exits[3] = "";
		room[0][7].setNumber(0);
		room[0][7].setName("Entry Way");
		room[0][7].setDescription("You are in the entryway to the old house.");
		room[0][7].setItems("newspaper");
		room[0][7].setItems("small box");
		room[0][7].setExits(exits);


		exits[0] = "n"; exits[1] = "s"; exits[2] = ""; exits[3] = "";
		room[1][7].setNumber(1);
		room[1][7].setName("Hallway to the Foyer");
		room[1][7].setDescription("You are in the Hallway to the Foyer.");
		room[1][7].setItems("mouse");
		room[1][7].setItems("piece of paper");
		room[1][7].setExits(exits);

		exits[0] = "n"; exits[1] = "s"; exits[2] = ""; exits[3] = "w";
		room[2][7].setNumber(2);
		room[2][7].setName("Foyer");
		room[2][7].setDescription("You are in the Foyer. Sunlight filters through a skylight.");
		room[2][7].setItems("keys");
		room[2][7].setItems("picture of a man"); // fixed this to be lowercase becuase the parsing thing makes it lowercase
		room[2][7].setExits(exits);

		exits[0] = ""; exits[1] = ""; exits[2] = "e"; exits[3] = "";
		room[3][7].setNumber(3);
		room[3][7].setName("Kitchen");
		room[3][7].setDescription("You are in your kitchen.");
		room[3][7].setItems("toaster");
		room[3][7].setItems("bottle");
		room[3][7].setItems("bloody knife");
		room[3][7].setExits(exits);

		room[1][1].setNumber(4);
		room[1][1].setName("Bathroom");
		room[1][1].setDescription("You are in your bathroom.");
		room[1][1].setItems("toilet paper");
		room[1][1].setItems("magazine");
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

