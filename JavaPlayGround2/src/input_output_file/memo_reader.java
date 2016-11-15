/*
 * Jose Terrones Jr.
 * October 7, 2014
 * Purpose: This program will read a txt file and print the
 * memos one by one if user wishes to see the next memo
 * Inputs: user input to enter file name, and if they wish to
 * see the next memo
 * Outputs: prints the memo content into the console
 */

package input_output_file;

import java.util.*;
import java.io.*;

import javax.swing.JFileChooser;

public class memo_reader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		boolean count = true;
		JFileChooser chooser = new JFileChooser();
		if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
			File selectedFile = chooser.getSelectedFile();
			try {
				Scanner in = new Scanner(selectedFile);
				while (count == true) {
					if (in.hasNextLine()) {
						System.out.println("\nSUBJECT:    " + in.nextLine());
						System.out.println("\nDate:    " + in.nextLine());
						System.out.println("\nMEMO:    " + in.nextLine());
						System.out.println("\nWould you like to see the next memo?");
						String input2 = input.next();
						if (input2.equalsIgnoreCase("no")) {
							System.out.println("Exiting");
							count = false;
						}
					} else {
						count = false;
						System.out.println("No more memos!");
					}
				}

			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}

	}
}
