package twentyHours.textAdventure;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.util.Objects;

public class Sounds {

	public static synchronized void playTitleMusic(int loopCounter) {

		try {
			Clip clip = AudioSystem.getClip();
			AudioInputStream inputStream = AudioSystem.getAudioInputStream(
					Objects.requireNonNull(Main.class.getResourceAsStream("media/start.wav")));
			clip.open(inputStream);
			clip.loop(loopCounter);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}

	public static synchronized void playItemPickup() {

		try {
			Clip clip = AudioSystem.getClip();
			AudioInputStream inputStream = AudioSystem.getAudioInputStream(
					Objects.requireNonNull(Main.class.getResourceAsStream("media/inv.wav")));
			clip.open(inputStream);
			clip.start();
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}

}
