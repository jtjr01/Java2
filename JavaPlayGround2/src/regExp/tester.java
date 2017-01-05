/*
 * Name: Jose Terrones Jr.
 * Purpose: Program will run through the scrable.txt file and do 
 * certain regular expression patterns and print the values with
 * the final pattern writing to a file the words that fit the 
 * pattern.
 */

package regExp;

import java.util.*;
import java.io.*;

public class tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput = new Scanner(System.in);
		regularExpresions test = new regularExpresions();
		test.work();
	}
}
