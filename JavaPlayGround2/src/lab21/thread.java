/*
 * Name: Jose Terrones Jr.
 * Purpose: Makes each thread display their appropriate 
 * number before they terminate.
 */

package lab21;

public class thread implements Runnable {
	public void run() 
	{
		System.out.println("Hello, I am " + Thread.currentThread().getName());
	}
}
