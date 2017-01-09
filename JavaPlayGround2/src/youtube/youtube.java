/*
 * Name: Jose Terrones Jr.
 * Purpose: Opens users browser to a youtube link.
 */

package youtube;

import java.net.*;
import java.awt.Desktop;

public class youtube {
	public static void main (String args[]) throws Exception
	{
	 	URI oracle = new URI("https://www.youtube.com/watch?v=8F9jXYOH2c0");
	    Desktop.getDesktop().browse(oracle);
 	}
}

