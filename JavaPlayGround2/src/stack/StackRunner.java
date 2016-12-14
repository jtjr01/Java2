/*
 * Name: Jose Terrones Jr.
 * Purpose:  A simple program that will use the stack to add 
 * and delete items. Also uses generic typing to take any item.
 */

package stack;

import java.util.Stack;

public class StackRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack stk1 = new Stack();
		stk1.push(1);
		stk1.push(2);
		stk1.push(3);
		stk1.push(4);
		stk1.push('a');
		stk1.push('b');
		stk1.push('c');
		stk1.push('d');
		stk1.push("awesome");
		while(!stk1.empty())
		{
			System.out.println(stk1.pop());
		}
	}

}
