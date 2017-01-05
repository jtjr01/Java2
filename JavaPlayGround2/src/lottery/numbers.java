/*
 * Jose Terrones Jr.
 * Purpose: This program will set the values of numbers within the tickets,
 * it will also print the values once called. It also removes duplicates.
 */

package lottery;

import java.util.*;

public class numbers {

	ArrayList<Integer> numbers = new ArrayList<Integer>();

	//Gives a value in the arraylist numbers at a certain
	//index
	public void setNumber(int index, int value)
	{
		numbers.set(index,value);
	}
	//Will at a value to the arraylist
	public void addNumber(int value)
	{
		numbers.add(value);
	}
	//Sorts the numbers in order
	public void sort()
	{
		Collections.sort(numbers);
	}
	//Prints the numbers within the ticket
	public void printNumber()
	{
		for(int i = 0; i < 6; i++)
		{
			if(i == 5)
			{
				System.out.println(numbers.get(i) + " ");
			}
			else
				System.out.print(numbers.get(i) + " ");
		}	
		System.out.println(" ");
	}
	//Will search for duplicates and change their value if needed
	public void anyDuplicates()
	{
		int j;
		boolean duplicate = false;
		while(!duplicate)
		{
			for(j = 1; j < numbers.size(); j++)
			{
				duplicate = false;
				if(numbers.get(j-1) == numbers.get(j))
				{
					setNumber(j, (int)((Math.random()*49)+1));
				}
				else
				{
					
					duplicate = true;
				}				
			}			
		}
	}
}