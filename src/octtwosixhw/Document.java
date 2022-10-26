package octtwosixhw;

public class Document
{
	private int pageCount;
	private int chapterCount;
	public Document(int p, int c)
	{
		pageCount = p;
		chapterCount = c;
	}
	public String toString()
	{
		return pageCount + " " + chapterCount;
	}
}
