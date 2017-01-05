/*
 * Name: Jose Terrones Jr.
 * Purpose: Using a queue a line of customers is emulated and
 * as buyers obtain their item desired they leave the queue until
 * no more customers are left.
 */

package queuelab;

import java.util.*;

public class iphoneTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue <String> IPhoneBuyers = new LinkedList<String>();
		IPhoneBuyers.add("customer1");
		IPhoneBuyers.add("customer2");
		IPhoneBuyers.add("customer3");
		IPhoneBuyers.add("Jose");
		IPhoneBuyers.add("Friend");
		IPhoneBuyers.add("customer4");
		IPhoneBuyers.add("customer5");
		System.out.println("The Shoppers in line are as follow");
		System.out.println(IPhoneBuyers.toString());
		System.out.println("Shoppers in line are: " + IPhoneBuyers.size());
		System.out.println("The next shopper is: " + IPhoneBuyers.peek());
		IPhoneBuyers.remove("Friend");
		System.out.println("Your friend left the line");
		System.out.println(IPhoneBuyers.toString());
		while(!IPhoneBuyers.isEmpty())
		{
			System.out.println("Shoppers in line are: " + IPhoneBuyers.size());
			System.out.println("The next shopper is: " + IPhoneBuyers.peek());
			System.out.println(IPhoneBuyers.toString());
			System.out.println(IPhoneBuyers.peek() + " has left");
			IPhoneBuyers.remove();
		}
		System.out.println("No more customers are left");
	}

}
