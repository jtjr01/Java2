package geometricShapes;

public class Triangle extends GeometricObject {
	
	double side1;
	double side2;
	double side3;
	
	/** Default constructor creates a triangle with default values*/
	Triangle()
	{
		side1 = 1;
		side2 = 1;
		side3 = 1;
	}
	/** sets side1*/
	public void setSide1(double side1)
	{
		this.side1 = side1;
	}
	/** sets side2*/
	public void setSide2(double side2)
	{
		this.side2 = side2;
	}
	/** sets side3*/
	public void setSide3(double side3)
	{
		this.side3 = side3;
	}
	/** returns area*/
	public int getMax()
	{
		return (int)this.getArea();
	}
	/** returns side1*/
	public double getSide1(double side1)
	{
		return side1;
	}
	/** returns side2*/
	public double getSide2(double side2)
	{
		return side2;
	}
	/** returns side3*/
	public double getSide3(double side3)
	{
		return side3;
	}
	/** returns perimeter*/
	public double getPerimeter()
	{
		return side1 + side2 + side3;
	}
	/** returns area*/
	public double getArea()
	{
		double first = getPerimeter() * ((getPerimeter() - side1) * (getPerimeter() - side2) * (getPerimeter() - side3));
		return Math.sqrt(first);
	}

}
