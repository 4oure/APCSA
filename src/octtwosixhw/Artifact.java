package octtwosixhw;

public class Artifact {

	public Artifact(){

	}
	private String title;
	private int year;
	public Artifact(String t, int y)
	{
		title = t;
		year = y;
	}
	public void printInfo()
	{
		System.out.print(title + " (" + year + ")");
	}
}
