/*
 * Name: Jose Terrones Jr.
 * Purpose: Handles the pizza type and all possible options for
 * a pizza.
 */

package pizza_writer_reader;

import java.io.Serializable;
import java.util.*;

public class PizzaCreation implements Serializable {
	private String size;
	private ArrayList<String> toppings = new ArrayList<String>();
	private String sauce;
	private String crust;

	public PizzaCreation()
	{
		size = "small";
		toppings.add("cheese");
		sauce = "yes";
		crust = "crispy";
	}
	public PizzaCreation(String s, String top, String sauce1, String crust1)
	{
		size = s;
		toppings.add(top);
		sauce = sauce1;
		crust = crust1;
	}
	public String getSize()
	{
		return size;
	}
	public ArrayList<String> getToppings() 
	{
		return toppings;
	}
	public String getSauce()
	{
		return sauce;
	}
	public String getCrust()
	{
		return crust;
	}

	public String toString() 
	{
		return ("The size of " + "the pizza is " + getSize() + ". The topping is " +
				getToppings() + ".\n" + getSauce() + ", sauce on the pizza, and the crust is " + getCrust());
	}
}
