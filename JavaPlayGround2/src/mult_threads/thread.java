/*
 * Name: Jose Terrones Jr.
 * Purpose: Makes each thread display their appropriate 
 * number before they terminate.
 */

package mult_threads;

public class thread implements Runnable {
	public void run() 
	{
		System.out.println("Hello, I am " + Thread.currentThread().getName());
	}
}
