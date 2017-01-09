/*
 * Name: Jose Terrones Jr.
 * Purpose: Reads the pizzas.txt file and will print out the pizzas that 
 * were ordered to the console.
 */

package pizza_writer_reader;

import java.util.*;
import java.io.*;

public class PizzaReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			ObjectInputStream input = new ObjectInputStream(new FileInputStream("Pizzas.txt"));
			PizzaCreation pizza1 = (PizzaCreation) input.readObject();
			PizzaCreation pizza2 = (PizzaCreation) input.readObject();
			PizzaCreation pizza3 = (PizzaCreation) input.readObject();
			PizzaCreation pizza4 = (PizzaCreation) input.readObject();
			PizzaCreation pizza5 = (PizzaCreation) input.readObject();
			if(pizza1.getSize().equals("large"))
			{
				System.out.println(pizza1.toString());
			}
			if(pizza2.getSize().equals("large"))
			{
				System.out.println(pizza2.toString());
			}
			if(pizza3.getSize().equals("large"))
			{
				System.out.println(pizza3.toString());
			}
			if(pizza4.getSize().equals("large"))
			{
				System.out.println(pizza4.toString());
			}
			if(pizza5.getSize().equals("large"))
			{
				System.out.println(pizza5.toString());
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
