/*
 * Jose Terrones Jr.
 * Purpose: This program will ask user for how many tickets desired
 * and will go about creating the tickets with six unique numbers
 */

package lottery;

import java.util.*;

public class lottery_ticket {
	
	int ticket_plays;
	numbers ticket;
	ArrayList<numbers> array = new ArrayList<numbers>();
	Scanner scan = new Scanner(System.in);
	
	//Ask the user for the amount of plays while looking to see if
	//the input is an integer or not
	public void ask_user()
	{
		System.out.println("Enter how many tickets you would like to play");
		try
		{
			ticket_plays = scan.nextInt();	
		}
		catch(InputMismatchException wrong)
		{
			System.out.println("Only integers will be accepted");	
			scan = new Scanner(System.in);
			ask_user();
		}
	}
	//Will create the tickets and the numbers in each one
	//without any duplicates and sorted
	public void create_ticket()
	{
		int i,j;
		for(i = 0; i < ticket_plays; i++)
		{
			ticket = new numbers();
			for(j = 0; j < 6; j++)
			{
				ticket.addNumber((int)((Math.random()*49)+1));
			}
			ticket.anyDuplicates();
			ticket.sort();
			ticket.anyDuplicates();
			ticket.sort();
			array.add(ticket);
		}
	}
	//Prints the tickets 
	public void print()
	{
		int i;
		for(i = 0; i < array.size(); i++)
		{
			
			System.out.print("Ticket " + (i+1) + ": ");
			array.get(i).printNumber();
		}
	}


}
