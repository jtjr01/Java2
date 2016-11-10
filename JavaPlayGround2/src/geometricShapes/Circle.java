package geometricShapes;

public class Circle extends GeometricObject {
	
	double radius;
	
	/** Default constructor creates circle with default value*/
	Circle()
	{
		radius = 1.0;
	}
	/** Sets the radius*/
	public void setRadius(double radius)
	{
		this.radius = radius;
	}
	/** returns radius*/
	public double getRadius()
	{
		return radius;
	}
	/** returns the area*/
	public int getMax()
	{
		return (int)this.getArea();
	}
	/** returns diameter*/
	public double getDiameter()
	{
		return 2*radius;
	}
	/** returns perimeter*/
	public double getPerimeter()
	{
		return getDiameter() * Math.PI;
	}
	/** returns area*/
	public double getArea()
	{
		return Math.PI * (radius*radius);
	}

}
