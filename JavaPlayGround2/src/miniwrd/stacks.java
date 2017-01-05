/*
 * Name: Jose Terrones Jr.
 * Purpose: This class will contain all the methods that the
 * interface has for use. Various methods and their output are 
 * controlled in this class and a printout of each is given.
 */

package miniwrd;

import java.util.*;

public class stacks implements MiniWPI {
	//Queue of string type 
	Queue<String> commands = new LinkedList<String>();

	//default constructor
	stacks() {
	}
	//constructor with a string parameter 
	//also pushes in the initial content
	stacks(String content)
	{
		for(int i = 0; i < content.length(); i++)
		{
			char letter = content.charAt(i);
			left.push(letter);
		}
		this.printtest("Initial Content");
	}
	//Method that verifies if the cursor is at the start
	public boolean isAtStart() {
		if(left.isEmpty())
		{
			System.out.println("The cursor is at the start");
			return true;
		}
		else
		{
			System.out.println("The cursor is not at the start");
			return false;
		}
	}
	//Method that verifies if the cursor is at the end
	public boolean isAtEnd() {
		if(right.isEmpty())
		{
			System.out.println("The cursor is at the end");
			return true;
		}
		else
		{
			System.out.println("The cursor is not at the end");
			return false;
		}
	}
	//Inserts the char that is passed as a parameter
	public void insertChar(char c) {
		right.push(c);
	}
	//moves the cursor to the left and moves items 
	//from one stack to another
	public void moveLeft() {
		if(!left.isEmpty())
		{
			char temp = left.elementAt(left.size() - 1);
			left.pop();
			right.insertElementAt(temp, 0);
		}
		else
		{
			System.out.println("left side is empty");
		}
	}
	//moves the cursor to the right and moves items
	//from one stack to another
	public void moveRight() {
		if(!right.isEmpty())
		{
			char temp = right.elementAt(0);
			right.remove(0);
			left.push(temp);
		}
		else
		{
			System.out.println("right side is empty");
		}
	}
	//deletes the item behind the cursor 
	public void backspace() {
		if(left.isEmpty())
		{
			System.out.println("Cannot backspace");
		}
		else if(!left.isEmpty())
		{
			left.pop();
		}
	}
	//deletes the item ahead of the cursor
	public void delete() {
		if(!right.isEmpty())
		{
			right.remove(0);
		}
		else
		{
			System.out.println("Nothing to delete");
		}
	}
	//moves the cursor to the start
	public void moveToStart() {
		if(left.isEmpty())
		{
			this.isAtStart();
		}
		while(!left.isEmpty())
		{
			char temp = left.elementAt(left.size() - 1);
			left.pop();
			right.insertElementAt(temp, 0);
		}
	}
	//moves the cursor to the end
	public void moveToEnd() {
		if(right.isEmpty())
		{
			this.isAtEnd();
		}
		while(!right.isEmpty())
		{
			char temp = right.elementAt(0);
			right.remove(0);
			left.push(temp);
		}
	}
	//creates the format for the printing
	public String toStringCursor() {
		System.out.println(left.toString() + " | " + right.toString() + "\n");
		return null;
	}
	//searches for the item passes in the parameter
	public boolean search(char c) {
		if(right.contains(c))
		{
			while(!right.isEmpty())
			{
				while(c != right.elementAt(0))
				{
					char temp = right.elementAt(0);
					right.remove(0);
					left.push(temp);
				}
				char temp = right.elementAt(0);
				right.remove(0);
				left.push(temp);
				return true;
			}
		}
		else
		{
			while(!right.isEmpty())
			{
				char temp = right.elementAt(0);
				right.remove(0);
				left.push(temp);
			}
		}
		System.out.println("Not found");
		return false;
	}
	//adds the commands to the queue
	public void processCommand(String s) {
		commands.add(s);
	}
	//executes the actual commands and checks which one is being
	//used and if they are valid
	public void command() {
		while(commands.isEmpty())
		{
			System.out.println("Command invalid" + "\n");
			commands.remove();
		}
		while(!commands.isEmpty())
		{
			String temp = commands.peek(); 
			int test = 0;
			for(int i = 0; i < temp.length() - 1; i++)
			{
				char breaker = '[';
				char search = '(';
				if(breaker == temp.charAt(i))
				{
					char c = temp.charAt(++i);
					this.insertChar(c);
					this.printtest(temp);
					commands.remove();
					test = 1;
					
				}
				if(search == temp.charAt(i))
				{
					char c = temp.charAt(++i);
					this.search(c);
					this.printtest(temp);
					commands.remove();
					test = 1;
				}
			}
			if(temp == "Move left")
			{
				this.moveLeft();
				this.printtest(temp);
				commands.remove();
				test = 1;
			}
			else if(temp == "Move right")
			{
				this.moveRight();
				this.printtest(temp);
				commands.remove();
				test = 1;
			}
			else if(temp == "Move to start")
			{
				this.moveToStart();
				this.printtest(temp);
				commands.remove();
				test = 1;
			}
			else if(temp == "Move to end")
			{
				this.moveToEnd();
				this.printtest(temp);
				commands.remove();
				test = 1;
			}
			else if(temp == "Delete")
			{
				this.delete();
				this.printtest(temp);
				commands.remove();
				test = 1;
			}
			else if(temp == "Backspace")
			{
				this.backspace();
				this.printtest(temp);
				commands.remove();
				test = 1;
			}
			else if(temp == "At start")
			{
				this.isAtStart();
				this.printtest(temp);
				commands.remove();
				test = 1;
			}
			else if(temp == "At end")
			{
				this.isAtEnd();
				this.printtest(temp);
				commands.remove();
				test = 1;
			}
			if(test == 0)
			{
				System.out.println("Command invalid" + "\n");
				commands.remove();
			}
		}
	}
	//prints the command and calls for the format print
	public void printtest(String s) {
		System.out.print(s + ": ");
		this.toStringCursor();
	}
}
