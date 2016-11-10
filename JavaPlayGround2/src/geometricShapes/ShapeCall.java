/*
 * Jose Terrones Jr.
 * September 18, 2014
 * Purpose: This program will create default shapes and user defined shapes
 * that will be compared and then stated which is bigger or if they 
 * are the same.
 * Inputs: User defined double values for radius, width, height,
 * side1, side2, and side3
 * Outputs: The date create, color and if filled, perimeter, area, and which 
 * shape is bigger
 */
package geometricShapes;

import java.util.*;

public class ShapeCall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Circle circ = new Circle();
		Circle circ2 = new Circle();
		circ.setFilled(true);
		System.out.println("The first shape is circle1");
		System.out.println(circ.toString());
		System.out.println(circ.getDiameter() + " thats the diameter");
		System.out.println(circ.getPerimeter() + " thats the perimeter");
		System.out.println(circ.getArea() + "thats the area \n");
		System.out.println("Second shape is circle2");
		System.out.println("Enter the radius: ");
		circ2.setRadius(scan.nextDouble());
		circ2.setFilled(true);
		System.out.println(circ2.toString());
		System.out.println(circ2.getDiameter() + " thats the diameter");
		System.out.println(circ2.getPerimeter() + " thats the perimeter");
		System.out.println(circ2.getArea() + "thats the area");
		if(circ.compareTo(circ2) == 0)
		{
			System.out.println("Both circles are the same \n\n");
		}
		else
		{
			System.out.println("Circle2 is bigger \n\n");
		}
		Rectangle rect = new Rectangle();
		Rectangle rect2 = new Rectangle();
		rect.setFilled(true);
		System.out.println("The first shape is rectangle1");
		System.out.println(rect.toString());
		System.out.println(rect.getPermiter() + " thats the perimeter");
		System.out.println(rect.getArea() + " thats the area");
		System.out.println();
		System.out.println("Second shape is rectangle2");
		System.out.println("Enter the width: ");
		rect2.setWidth(scan.nextDouble());
		rect2.setFilled(true);
		System.out.println("Enter the height");
		rect2.setHeight(scan.nextDouble());
		System.out.println(rect2.toString());
		System.out.println(rect2.getPermiter() + " thats the perimeter");
		System.out.println(rect2.getArea() + " thats the area");
		if(rect.compareTo(rect2) == 0)
		{
			System.out.println("Both rectangles are the same \n\n");
		}
		else
		{
			System.out.println("Rectangle two is bigger \n\n");
		}
		Triangle tri = new Triangle();
		Triangle tri2 = new Triangle();
		tri.setFilled(true);
		System.out.println("The first shape is triangle1");
		System.out.println(tri.toString());
		System.out.println(tri.getPerimeter() + " thats the perimeter");
		System.out.println(tri.getArea() + " thats the area \n");
		System.out.println("Second shape is triangle2");
		tri2.setFilled(true);
		System.out.println("Enter side1: ");
		tri2.setSide1(scan.nextDouble());
		System.out.println("Enter side2: ");
		tri2.setSide2(scan.nextDouble());
		System.out.println("Enter side3: ");
		tri2.setSide3(scan.nextDouble());
		System.out.println(tri2.toString());
		System.out.println(tri2.getPerimeter() + " thats the perimeter");
		System.out.println(tri2.getArea() + " thats the area");
		if(tri.compareTo(tri2) == 0)
		{
			System.out.println("Both triangles are the same");
		}
		else
		{
			System.out.println("Triangle two is bigger");
		}
	}

}
