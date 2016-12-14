/*
 * Name: Jose Terrones Jr.
 * Purpose: Creates a file that will be populated with data from
 * a different file.
 */

package fileIO;

import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class readAndWrite {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		java.io.File file = new java.io.File("output.txt");
		java.io.PrintWriter output = new java.io.PrintWriter("output.txt");
		Scanner input = new Scanner(new File ("ziptable.txt"));
		input.useDelimiter(" ");
		while(input.hasNext())
		{
			output.print(input.next());
			output.print(" ");
			output.print(input.next());
			output.print(" ");
			output.print(input.nextLine());
			output.println(" ");
		}
		input.close();
		output.close();

	}

}
