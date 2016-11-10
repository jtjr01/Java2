/*
 * Name   : Jose Terrones Jr.
 * Date   : October 16, 2014
 * Purpose: Creates the measurable generic class and 
 * 			determines which item is larger
 * Inputs : Different sized circles 
 * Outputs: The largest circle 
 */

package generics;

import java.util.*;

public abstract class measurable<E> {
	
	private E e;
	abstract int getMeasure();
	//default constructor
	measurable()
	{
	}
	//returns the biggerObj after they are compared
	public static <E extends measurable<E>> E max(ArrayList<E> items)
	{
		E biggerObj = items.get(0);
		for(int i = 1; i < items.size(); i++)
		{
			E obj2 = items.get(i);
			//if loop compares the objects by determining which is bigger by
			//subtraction and comparing to 0
			if (obj2.getMeasure()-biggerObj.getMeasure()>0)
	         {
	            biggerObj = obj2;
	         }
		}
		return biggerObj;
	}
}
