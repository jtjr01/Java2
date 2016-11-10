package geometricShapes;

public class Rectangle extends GeometricObject {
	
	double width;
	double height;
	
	/** Default constructor creates rectangle with default values*/
	Rectangle()
	{
		width = 1;
		height = 1;
	}
	/** Sets width*/
	public void setWidth(double width)
	{
		this.width = width;
	}
	/** sets height*/
	public void setHeight(double height)
	{
		this.height = height;
	}
	/** returns area*/
	public int getMax()
	{
		return (int)this.getArea();
	}
	/** returns width*/
	public double getWidth()
	{
		return width;
	}
	/** returns height*/
	public double getHeight()
	{
		return height;
	}
	/** returns perimeter*/
	public double getPermiter()
	{
		return ((2*getWidth()) + (2*getHeight()));
	}
	/** returns area*/
	public double getArea()
	{
		return getWidth() * getHeight();
	}

}
