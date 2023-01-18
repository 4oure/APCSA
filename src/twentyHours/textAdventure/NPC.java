package twentyHours.textAdventure;

import java.util.ArrayList;

public class NPC {
	private String name;
	private boolean safe;
	private boolean talkative;

	public ArrayList<NPC> getNPCs() {
		return NPCs;
	}

	public void setNPCs(ArrayList<NPC> NPCs) {
		this.NPCs = NPCs;
	}

	public String getNpc() {
		return npc;
	}

	public void setNpc(String npc) {
		this.npc = npc;
	}

	ArrayList<NPC> NPCs = new ArrayList<>();

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

	public void addNPCs(NPC enpeecee){
		NPCs.add(enpeecee);
	}

	public static boolean checkNPC(int row, int col, String item, ArrayList<NPC> NPCs, Room[][] room, int score){
		boolean isReal = false;
		for(NPC npc : NPCs){

		}
	}

}
