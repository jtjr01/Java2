/*
 * Jose Terrones Jr.
 * October 7, 2014
 * Purpose: This program will create a txt file called
 * memo.txt, and it will accept user input to create
 * memos and ask user if they want to make more
 * Inputs: user input to make new memo, enter subject
 * and the actual memo
 * Outputs: memo.txt file with the subject, time stamp
 * and memo message, also additional memos if desired
 */

package input_output_file;

import java.util.*;
import java.io.*;

public class memo_call {
	private java.util.Date dateStamp;
	PrintWriter write;
	Scanner scan = new Scanner(System.in);
	String input;
	
	//constructor that creates the txt file and does the exception
	memo_call()
	{
		try
		{
			write = new PrintWriter(new FileWriter("memo.txt"));
		}
		catch(IOException fail)
		{
			System.out.println("Error writng to file.");
			fail.printStackTrace();
		}
	}
	//Calls the method to write a memo, then ask users to write another, 
	//it also checks for any mismatch.
	void writeMultiple()
	{
		writeToFile();
		System.out.println("Would you like to write another memo?");
		try
		{
			input = scan.nextLine();	
			if(input.equalsIgnoreCase("yes"))
			{
				writeMultiple();
			}
			else if(input.equalsIgnoreCase("no"))
			{
				System.out.println("Exiting");
				write.close();
			}
		}
		catch(InputMismatchException wrong)
		{
			System.out.println("Only yes or no will be accepted");	
			scan = new Scanner(System.in);
			writeMultiple();
		}
	}
	//Writes the memo 
	void writeToFile()
	{
		String temp;
		System.out.println("Enter the subject of the memo.");
		write.println(temp = scan.nextLine());
		dateStamp = new java.util.Date();
		write.println(dateStamp.toString());
		String temp2;
		System.out.println("Enter the message of the memo.");
		write.println(temp2 = scan.nextLine());
	}
}
