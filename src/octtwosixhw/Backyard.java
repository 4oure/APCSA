package octtwosixhw;
public class Backyard
{
	private int length;
	private int width;
	public Backyard(int l, int w)
	{
		length = l;
		width = w;
	}
	public int getLength()
	{
		return length;
	}
	public int getWidth()
	{
		return width;
	}
	public boolean equals(Object other)
	{
		if (other == null)
		{
			return false;
		}
		Backyard b = (Backyard) other;
		return (length == b.getLength() && width == b.getWidth());
	}
}
