package twentyHours.textAdventure;

public class NPC {
	private String name = "";
	private boolean isMean = false;
	private boolean isAlive;

	public boolean isAlive() {
		return isAlive;
	}

	public void setAlive(boolean alive) {
		isAlive = alive;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isMean() {
		return isMean;
	}

	public void setMean(boolean mean) {
		isMean = mean;
	}

	public NPC(String name, boolean isMean, boolean isAlive) {
		this.name = name;
		this.isMean = isMean;
		this.isAlive = isAlive;
	}

	public static void attack(NPC npc){
		npc.isAlive = false;

	}


}
