/*
 * Jose Terrones Jr.
 * Purpose: This program will create lottery tickets that contain six unique numbers
 */

package lottery;

public class call_lottery {

	public static void main(String[] args) {
		
		lottery_ticket lott = new lottery_ticket();
		lott.ask_user();
		lott.create_ticket();
		lott.print();
	}

}
