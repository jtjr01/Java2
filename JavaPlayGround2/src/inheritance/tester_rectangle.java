/*
 * Name: Jose Terrones Jr.
 * Purpose: Create a rectangle and using the super operation 
 * for inheritance. It will also calculate the height, 
 * perimeter and area of the
 * defined rectangle.
 */

package inheritance;

public class tester_rectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BetterRectangle rect = new BetterRectangle(2, 5);
		System.out.println("The height is " + rect.getHeight() + " and the width is " + rect.getWidth());
		System.out.println("The perimeter is " + rect.getPerimeter());
		System.out.println("The area is " + rect.getArea());
		
	}

}
