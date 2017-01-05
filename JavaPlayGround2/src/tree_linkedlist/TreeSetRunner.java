/*
 * Name: Jose Terrones Jr.
 * Purpose: A treeset is created and items are added while repeated items
 * are ignored. A loop through the list of items will reveal that repeated
 * items were not added to the treeset.
 */

package tree_linkedlist;

import java.util.*;

public class TreeSetRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> tree = new TreeSet<String>();
		Iterator<String> items = null;
		tree.add("iii");
		tree.add("hhh");
		tree.add("ggg");
		tree.add("fff");
		tree.add("eee");
		tree.add("ddd");
		tree.add("ccc");
		tree.add("bbb");
		tree.add("aaa");
		tree.add("iii");
		tree.add("hhh");
		tree.add("ggg");
		tree.add("fff");
		tree.add("eee");
		tree.add("ddd");
		tree.add("ccc");
		tree.add("bbb");
		tree.add("aaa");
		items = tree.iterator();
		for(String myTree : tree)
		{
			System.out.println(items.next());
		}
	}

}
