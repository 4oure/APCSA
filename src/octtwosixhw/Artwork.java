package octtwosixhw;

public class Artwork extends Artifact {

	private	String artist;
	public Artwork(String t, int y, String a)
		{
			super(t, y);
			artist = a;
		}
		public void printInfo()
		{
			super.printInfo();
			System.out.print( "by " + artist);

			/* missing implementation */
		}
}
