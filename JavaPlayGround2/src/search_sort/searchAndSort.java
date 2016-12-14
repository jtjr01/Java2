/*
 * Nane: Jose Terrones Jr.
 * Purpose: Creates an array of random numbers that will
 * be sorted by finding the smallest integer and bringing it to the
 * front until it is sorted.
 */

package search_sort;

import java.util.*;

public class searchAndSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numbers[] = new int[10];
		for (int i = 0; i < 10; i++) {
			numbers[i] = (int) (Math.random() * 100);
		}
		for (int i = 0; i < 10; i++) {
			System.out.print(numbers[i] + " ");
		}
		System.out.println("\n");
		int j;
		boolean flag = true;
		int temp;
		while (flag) {
			flag = false;
			for (j = 0; j < numbers.length - 1; j++) {
				if (numbers[j] < numbers[j + 1]) 
				{
					temp = numbers[j];
					numbers[j] = numbers[j + 1];
					numbers[j + 1] = temp;
					flag = true; 
				}
			}
			for (int i = 9; i >= 0; i--) {
				System.out.print(numbers[i] + " ");
			}
				System.out.print("\n");
		}
		System.out.print("Completed sort: \n");
		for (int i = 9; i >= 0; i--) {
			System.out.print(numbers[i] + " ");
		}
	}

}
