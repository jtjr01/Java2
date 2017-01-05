/*
 * Name: Jose Terrones Jr.
 * Purpose: Creates a file that will contain the 3 different options for 
 * ice cream.
 */

package streamIO;

import java.util.*;
import java.io.*;

import javax.imageio.IIOException;

public class iceCreamWriter {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		try
		{
			ObjectOutputStream write = new ObjectOutputStream(new FileOutputStream("Cones.txt"));
			AdvancedIceCreamCone vanillaCone = new AdvancedIceCreamCone();
			AdvancedIceCreamCone chocolateCone = new AdvancedIceCreamCone(2, "chocolate", "waffle");
			AdvancedIceCreamCone strawberryCone = new AdvancedIceCreamCone(1, "strawberry", "waffle");
			vanillaCone.addToppings("sprinkles");
			write.writeObject(vanillaCone);
			
			chocolateCone.addToppings("sprinkles");
			write.writeObject(chocolateCone);
			
			strawberryCone.addScoop();
			strawberryCone.addToppings("banana slices");
			write.writeObject(strawberryCone);
			
			write.close();
			
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(IIOException e)
		{
			e.printStackTrace();
		}
		finally
		{
			
		}
	}

}
