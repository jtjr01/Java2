/*
 * Name: Jose Terrones Jr.
 * Purpose: This class will create an array list that hold two types
 * of animals: cat and dog. Once added it will use a speakable class
 * to call the speak method from each of the types to get the right output.
 */

package animals;

import java.util.*;

public class AnimalRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Speakable> dogcatList = new ArrayList<Speakable>();
		dogcatList.add(new Dog("Fred"));
		dogcatList.add(new Cat ("Wanda"));
		for(Speakable speaking: dogcatList)
		{
			System.out.print(speaking.toString() + " says ");
			speaking.speak();
		}
	}
}
