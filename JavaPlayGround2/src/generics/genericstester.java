/*
 * Name   : Jose Terrones Jr.
 * Date   : October 16, 2014
 * Purpose: Test the measurable generic class with a variety
 * 			items to find the max
 * Inputs : Different sized circles
 * Outputs: The largest circle 
 */

package generics;

import java.util.*;

public class genericstester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creates and array to hold circle objects
		ArrayList<Circle> circles = new ArrayList<Circle>();
		
		//Various circle objects created
		Circle tester = new Circle();
		Circle circ1 = new Circle(2, "Circle 1");
		Circle circ2 = new Circle(3, "Circle 2");
		Circle circ3 = new Circle(1, "Circle 3");
		Circle circ4 = new Circle(8, "Circle 4");
		Circle circ5 = new Circle(6, "Circle 5");
		
		//Circle objects added to the arrayList
		circles.add(circ1);
		circles.add(circ2);
		circles.add(circ3);
		circles.add(circ4);
		circles.add(circ5);
		
		System.out.println("The biggest circle was: " + tester.max(circles).getName());
		System.out.println("With an area of: " + tester.max(circles).getArea());
		System.out.println("And the radius of: " + tester.max(circles).getRadius());
		
	}

}
