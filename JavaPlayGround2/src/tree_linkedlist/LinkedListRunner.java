/*
 * Name: Jose Terrones Jr.
 * Purpose: A linked list is created that will be added items.
 * The whole list will be printed and then modified by eliminating
 * the items that contain a vowel. The result will the be printed.
 */

package tree_linkedlist;

import java.util.*;

public class LinkedListRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> list = new LinkedList<String>();
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		list.add("ddd");
		list.add("eee");
		list.add("fff");
		list.add("ggg");
		list.add("hhh");
		list.add("iii");
		ListIterator<String> walk = list.listIterator();
		while(walk.hasNext())
		{
			System.out.println(walk.next());
		}
		while(walk.hasPrevious())
		{
			String vow = walk.previous();
			if(vow.charAt(0) == 'a' || vow.charAt(0) == 'e' || vow.charAt(0) == 'i')
			{
				walk.remove();
			}
			else
			{
				System.out.println(vow);
			}
		}
	}
}
