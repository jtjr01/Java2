/*
 * Jose Terrones Jr.
 * October 7, 2014
 * Purpose: This program will create a txt file called
 * memo.txt, and it will accept user input to create
 * memos and ask user if they want to make more
 * Inputs: None
 * Outputs: None
 */

package input_output_file;

import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;


public class memo_maker 
{

	public static void main(String[] args) throws FileNotFoundException 
	{
		// TODO Auto-generated method stub
		memo_call attempt = new memo_call();
		attempt.writeMultiple();
	}
}