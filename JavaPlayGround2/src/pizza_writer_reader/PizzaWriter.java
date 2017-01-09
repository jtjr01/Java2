/*
 * Name: Jose Terrones Jr.
 * Purpose: Creates a txt file that will write two order pizzas with different
 * toppings and crust.
 */

package pizza_writer_reader;

import java.io.*;

public class PizzaWriter {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		try
		{
			ObjectOutputStream write = new ObjectOutputStream(new FileOutputStream("Pizzas.txt"));
			PizzaCreation pizza1 = new PizzaCreation();
			write.writeObject(pizza1);
			PizzaCreation pizza2 = new PizzaCreation("large", "pepperoni", "yes", "stuffed crust");
			write.writeObject(pizza2);
			PizzaCreation pizza3 = new PizzaCreation("medium", "mushrooms", "no", "pan styled");
			write.writeObject(pizza3);
			PizzaCreation pizza4 = new PizzaCreation("large", "ham", "yes", "original");
			write.writeObject(pizza4);
			PizzaCreation pizza5 = new PizzaCreation("small", "pepperoni", "yes", "stuffed crust");
			write.writeObject(pizza5);
			write.close();
		}
		catch(FileNotFoundException e)
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

