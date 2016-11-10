/*
 * Name   : Jose Terrones Jr.
 * Date   : October 16, 2014
 * Purpose: Circle class will determine the values of
 * 			the circles once inputs have been received
 * Inputs : Different radius from the tester
 * Outputs: The various measurements if they
 * 			are returned
 */

package generics;

public class Circle extends measurable {
	
	double radius;
	String name;
	
	//Default constructor creates circle with default value
	Circle()
	{
		radius = 1.0;
	}
	//Constructor that takes in a radius and string name as 
	//parameters
	Circle(int radius, String name)
	{
		setName(name);
		setRadius(radius);
	}
	//Sets the name
	public void setName(String name)
	{
		this.name = name;
	}
	//Sets the radius
	public void setRadius(double radius)
	{
		this.radius = radius;
	}
	//returns name
	public String getName()
	{
		return name;
	}
	//returns radius
	public double getRadius()
	{
		return radius;
	}
	//returns diameter
	public double getDiameter()
	{
		return 2*radius;
	}
	//returns perimeter
	public double getPerimeter()
	{
		return getDiameter() * Math.PI;
	}
	//returns area
	public double getArea()
	{
		return Math.PI * (radius*radius);
	}
	//returns the measured item
	public int getMeasure()
	{
		double measure = 0;

		measure = this.getArea();

		return (int) measure;
	}

}
