/*
 * Name: Jose Terrones Jr.
 * Purpose: Program will run through the scrable.txt file and do 
 * certain regular expression patterns and print the values with
 * the final pattern writing to a file the words that fit the 
 * pattern.
 */

package regExp;

import java.util.*;
import java.util.regex.*;
import java.io.*;
import javax.swing.JFileChooser;

public class regularExpresions {
	Scanner userInput = new Scanner(System.in);
	String word;
	int countZZ = 0;
	int countVOW = 0;
	int countMVOWS = 0;
	int countXX = 0;
	int countQnotU = 0;
	//Patterns are created here
	Pattern zz = Pattern.compile("zz");
	Pattern twoVow = Pattern.compile("[aeiou][aeiou]");
	Pattern manyVow = Pattern.compile("[aeiou].*[aeiou].*[aeiou]");
	Pattern xx = Pattern.compile("x.*?x.*?");
	Pattern qNotU = Pattern.compile("^q[^u]");

	public void work() {
		//print writer created and given a null value
		PrintWriter writer = null; 
		try {
			//gives user the chance to pick the file
			JFileChooser file = new JFileChooser();
			if (file.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
				File scrabble = file.getSelectedFile();
				Scanner input = new Scanner(scrabble);
				//file where words are written is finally created
				writer = new PrintWriter(new FileWriter("QNoTU.txt"));
				//verifies and continues looping while the file contains a next
				//word
				while (input.hasNext()) {
					//word is written into the scanner for saving and checking
					word = input.nextLine();
					if (input.hasNext()) {
						if (doubleZ(word) == 1) {
							countZZ += 1;
						}
					} else {
						System.out.println("The count for double z is: " + countZZ);
					}
					if (input.hasNext()) {
						if (twoVowels(word) == 1) {
							countVOW += 1;
						}
					} else {
						System.out.println("The count for two vowels is: " + countVOW);
					}
					if (input.hasNext()) {
						if (manyVows(word) == 1) {
							countMVOWS += 1;
						}
					} else {
						System.out.println("The count for three or more vowels is: " + countMVOWS);
					}
					if (input.hasNext()) {
						if (doubleXX(word) == 1) {
							countXX += 1;
						}
					} else {
						System.out.println("The count for double x is: " + countXX);
					}
					if (input.hasNext()) {
						if (qNotU(word) == 1) {
							countQnotU +=1;
							//writes to the file the words
							writer.println(word);
						}
					} else {
						System.out.print("The count for Q not followed by U is: " + countQnotU);
					}
				}
			}
			System.out.println("");

		} 
		//general exceptions that may be thrown
		catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e2) {
			e2.printStackTrace();
		} finally {
			writer.close();
		}

	}
	//method that verifies if the word has a double z
	public int doubleZ(String word) {
		Matcher zz1 = zz.matcher(word);
		if (zz1.find()) {
			return 1;
		} else
			return 0;
	}
	//method that verifies for two vowels
	public int twoVowels(String word) {
		Matcher vows = twoVow.matcher(word);
		if (vows.find()) {
			return 1;
		} else
			return 0;
	}
	//method that verifies for many vowels
	public int manyVows(String word) {
		Matcher manyVows = manyVow.matcher(word);
		if (manyVows.find()) {
			return 1;
		} else
			return 0;
	}
	//method that verifies for double x
	public int doubleXX(String word) {
		Matcher xx1 = xx.matcher(word);
		if (xx1.find()) {
			return 1;
		} else
			return 0;
	}
	//verifies if pattern starts with a q and is not
	//followed by a U
	public int qNotU(String word) {
		Matcher qNotU_ = qNotU.matcher(word);
		if (qNotU_.find()) {
			return 1;
		} else
			return 0;
	}
}
