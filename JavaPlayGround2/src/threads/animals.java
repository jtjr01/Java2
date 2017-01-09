/*
 * Name: Jose Terrones Jr.
 * Purpose: This program will simulate a race between the 
 * chosen amount of animals each with a name, speed and 
 * rest factor. It will use threads to account for each
 * animals racing and report their progress. A final 
 * message will be given when it is over and report the
 * places of each animal as they finish.
 */

package threads;

import java.util.*;

public class animals implements Runnable {
	private int lapDistance = 1200; 
	String aN;
	int speed, rest, count;
	//static variables to keep their changes as the 
	//threads change them
	static int place = 1;
	static int complete = 0;
	//constructor
	animals()
	{
	}
	//constructor with parameters
	animals(String animalName, int speedOfAnimal, int restFactor, int user)
	{
		aN = animalName;
		speed = speedOfAnimal;
		rest = restFactor;
		count = user;
	}
	String getName()
	{
		return aN;
	}
	int getSpeed()
	{
		return speed;
	}
	int getRestFactor()
	{
		return rest;
	}
	int getCount()
	{
		return count;
	}
	//run controls the threads and their activities
	public void run() 
	{
		int distanceRan = 0;
		int count = 0;
		int lapsLeft = 4;
		try
		{
			//controls the race until four laps are done
			while(distanceRan != lapDistance && count != 4)
			{
				distanceRan += getSpeed();
				Thread.sleep(getRestFactor());
				//prints the completion of a lap
				if(distanceRan >= lapDistance)
				{
					count++;
					System.out.println(getName() + " has completed a lap their speed is " + getSpeed());
					System.out.println("laps left " + (lapsLeft - count));
					distanceRan = 0;
				}
			}
			//switch to control the printing of completed laps
			switch(place)
			{
				case 1:
				System.out.println(getName() + " has finished in " + place + " place!");
				break;
				default:
				System.out.println(getName() + " has finished in " + place + " place!");
				break;
			}
			place++;
			complete++;
			//once the race is over this will print the completed race msg
			if(getCount() == complete)
			{
				System.out.println("Race is over");
			}	
		}
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
	}
}
