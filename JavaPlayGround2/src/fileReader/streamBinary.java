/*
 * Name: Jose Terrones Jr,.
 * Purpose: Reads in a doc file with text saved within.
 * After reading the file it will take the each item within
 * and if the item falls within a char value of 32 through 126.
 * If the item does fall within the parameter it is printed if not 
 * it is ignored.
 */

package fileReader;

import java.util.*;
import java.io.*;

public class streamBinary {
	public static void main(String[] args) throws IOException {
		try
		{
			InputStream inputStream = new FileInputStream("outputhw8.doc");
			int data;
			int count = 1;
			while((data = inputStream.read()) != -1)
			{
				if(data >= 32 && data <= 126)
				{
					char value = (char)data;
					if(count != 64)
					{
						System.out.print(value);
						count++;
					}
					else if (count == 64)
					{
						System.out.println(value);
						count = 0;
					}
				}
			}
		}
		catch(FileNotFoundException e){}
		finally{}
	}
}
