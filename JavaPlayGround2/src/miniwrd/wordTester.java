/*
 * Name: Jose Terrones Jr.
 * Purpose: The tester class, that will provide the program
 * with the commands and then call the execute method.
 */

package miniwrd;

public class wordTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stacks word = new stacks("RANDOM");
		word.processCommand("insert char [Z]");
		word.processCommand("insert char [A]");
		word.processCommand("Move left");
		word.processCommand("Move right");
		word.processCommand("Move to start");
		word.processCommand("Move to start");
		word.processCommand("Move to end");
		word.processCommand("Move to end");
		word.processCommand("Move right");
		word.processCommand("Search for (Z)");
		word.processCommand("Move to start");
		word.processCommand("Search for (A)");
		word.processCommand("Delete");
		word.processCommand("Backspace");
		word.processCommand("At end");
		word.processCommand("At start");
		word.processCommand("Move left");
		word.processCommand("Move nothing");
		word.processCommand("Move left");
		word.processCommand("Backspace");
		word.processCommand("Move left");
		word.command();
		
	}

}
