/*
 * Name: Jose Terrones Jr.
 * Purpose: This program will simulate a race between the 
 * chosen amount of animals each with a name, speed and 
 * rest factor. It will use threads to account for each
 * animals racing and report their progress. A final 
 * message will be given when it is over and report the
 * places of each animal as they finish.
 */

package threads;

import java.util.*;
import java.io.*;

public class testersForAnimals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int userInput, i = 0;
		System.out.println("How many animals would you like to enter in the race?");
		try
		{
			userInput = scan.nextInt();
			animals [] animalArray = new animals[userInput]; 
			//array of threads to hold each animal
			Thread [] t = new Thread[userInput];
			for(i = 0; i < animalArray.length; i++)
			{
				System.out.println("Enter animal name: ");
				String animalName = scan.next();
				System.out.println("Enter animal speed:");
				int animalSpeed = scan.nextInt();
				System.out.println("Enter aniaml rest factor");
				int restFactor = scan.nextInt();
				animalArray[i] = new animals(animalName, animalSpeed, restFactor, userInput);
				t[i] = new Thread(animalArray[i]);
			}
			//starts each thread 
			for(i=0; i < userInput; i++)
			{
				t[i].start();
			}
		}
		catch(InputMismatchException e)
		{
			System.out.println("Input was incorrect.");
		}
	}
}
