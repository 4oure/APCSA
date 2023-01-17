package twentyHours.textAdventure;

public class NPC {
	private String name;
	private boolean safe;
	private boolean talkative;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isSafe() {
		return safe;
	}

	public void setSafe(boolean safe) {
		this.safe = safe;
	}

	public boolean isTalkative() {
		return talkative;
	}

	public void setTalkative(boolean talkative) {
		this.talkative = talkative;
	}

	public NPC(String whatName, boolean isSafe, boolean isTalkative){
		name = whatName;
		safe = isSafe;
		talkative = isTalkative;


	}
}
