/*
 * Name: Jose Terrones Jr.
 * Purpose: A simple program that creates threads and runs them.
 */

package lab21;

import java.util.*;

public class multithreading {
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		thread run = new thread();
		System.out.println("Enter the number of threads desired");
		int input = userInput.nextInt();
		Thread[] t = new Thread[input];
		int i;
		for(i=0; i < input; i++)
		{
			t[i] = new Thread(run);
			t[i].start();
			try {
			    Thread.sleep(200);                
			} catch(InterruptedException ex) {
			    Thread.currentThread().interrupt();
			}
		}
	}
}
