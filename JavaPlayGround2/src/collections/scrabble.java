/*
 * Name: Jose Terrones Jr.
 * Date: November 4, 2014
 * Purpose: Reads the file that contains words that start with Q and not
 * followed by u. It will also check for certain letters and give an 
 * appropriate score for each letter
 * Input:file
 * Output:Prints out the word and the score
 */

package collections;

import java.io.*;
import java.util.*;
import java.util.regex.*;

public class scrabble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Selects the file that contains the words
		java.io.File file = new java.io.File("QNoTU.txt");
		Scanner reader;
		//tries to read the file if it is not found throws the exception
		try {
			reader = new Scanner(file);
			//Patterns that each specify amount of points
			Pattern p1 = Pattern.compile("[aeilnorstu]");
			Pattern p2 = Pattern.compile("[dg]");
			Pattern p3 = Pattern.compile("[bcmp]");
			Pattern p4 = Pattern.compile("[fhvwy]");
			Pattern p5 = Pattern.compile("[k]");
			Pattern p8 = Pattern.compile("[jx]");
			Pattern p10 = Pattern.compile("[qz]");
			//Creates a map that has type and value
			Map<String, Integer> scores = new HashMap<String, Integer>();
			//loops through till each word is read
			while(reader.hasNext())
			{
				//Stores the word into a string
				String word = reader.nextLine();
				//keeps the score
				int score = 0;
				//Matches that use the correct pattern
				Matcher point1 = p1.matcher(word);
				Matcher point2 = p2.matcher(word);
				Matcher point3 = p3.matcher(word);
				Matcher point4 = p4.matcher(word);
				Matcher point5 = p5.matcher(word);
				Matcher point8 = p8.matcher(word);
				Matcher point10 = p10.matcher(word);
				//checks each word and increases the score appropriately 
				while (point1.find()) {
					score += 1;
					scores.put(word, score);
				}
				while (point2.find()) {
					score += 2;
					scores.put(word, score);
				}
				while (point3.find()) {
					score += 3;
					scores.put(word, score);
				}
				while (point4.find()) {
					score += 4;
					scores.put(word, score);
				}
				while (point5.find()) {
					score += 5;
					scores.put(word, score);
				}
				while (point8.find()) {
					score += 8;
					scores.put(word, score);
				}
				while (point10.find()) {
					score += 10;
					scores.put(word, score);
				}
				System.out.println("The word is " + word + " its score is: " + score);
			}
			reader.close();	
			//catches the exception if the file is not found
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}