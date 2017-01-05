/*
 * Name: Jose Terrones Jr.
 * Purpose: Reads the ice cream txt file created before and allows the user
 * to choose which flavor they want and displays the choice.
 */

package streamIO;

import java.util.*;
import java.io.*;

public class iceCreamReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			ObjectInputStream input = new ObjectInputStream(new FileInputStream("Cones.txt"));
			AdvancedIceCreamCone vanilla = (AdvancedIceCreamCone)input.readObject();
			AdvancedIceCreamCone chocolate = (AdvancedIceCreamCone) input.readObject();
			AdvancedIceCreamCone strawberry = (AdvancedIceCreamCone) input.readObject();
			System.out.println("Choose a flavor (VANILLA, CHOCOLATE, STRAWBERRY");
			Scanner user = new Scanner(System.in);
			String Choice = user.nextLine();
			switch(Choice.toUpperCase())
			{
				case "VANILLA":
					System.out.println("Your choice was: " + Choice);
					System.out.println(vanilla.toString());
					break;
				case "CHOCOLATE":
					System.out.println("Your choice was: " + Choice);
					System.out.println(chocolate.toString());
					break;
				case "STRAWBERRY":
					System.out.println("Your choice was: " + Choice);
					System.out.println(strawberry.toString());
					break;
			}
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		finally
		{
			
		}

	}

}
