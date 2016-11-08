package collections;

import java.io.FileNotFoundException;
import java.util.*;

public class novel_read {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creates a hash set
		HashSet<String> hash = new HashSet<String>();
		//Creates a tree set
		TreeSet<String> tree = new TreeSet<String>();
		//Selects the file to read
		java.io.File file = new java.io.File("warpeace.txt");
		try{
			Scanner reader = new Scanner(file);
			//starts the timer
			long startTime = System.currentTimeMillis();
			//loops through the file and adds words to the hashset
			while(reader.hasNext())
			{
				String word = reader.next();
				hash.add(word);
			}
			//ends the time and gives the difference
			long endTime = System.currentTimeMillis() - startTime;
			System.out.println("The time for the hashset is " + endTime);
			Scanner reader1= new Scanner(file);
			//Starts the timer
			long startTime1 = System.currentTimeMillis();
			//loops thought the file and adds words to the treeset
			while(reader1.hasNext())
			{
				String word = reader1.next();
				tree.add(word);
			}
			//ends the time and gives the difference
			long endTime1 = System.currentTimeMillis() - startTime1;
			System.out.println("The time for the treeset is " + endTime1);
			//starts the reader anew for the hashset
			
		}
		//catches the exception if file is not found
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
