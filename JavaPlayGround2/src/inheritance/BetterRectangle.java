package inheritance;

import java.awt.Rectangle;

public class BetterRectangle extends Rectangle {
	
	BetterRectangle(int height, int width)
	{
		super(height,width);
	}
	public int getPerimeter()
	{
		return (int)(2 * height + 2 * width);
	}
	public int getArea()
	{
		return (int) (height * width);
		
	}
}

