package u3pp;

import java.util.Scanner;

/**
 * YOUR COMMENTS HERE
 * 
 * @author YOUR NAME HERE
 */

class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);

		System.out.print("Enter a year (or enter STOP to end): ");
		String input = sc.nextLine();
		if (input == ("STOP")){
			sc.close();
		}
		
		
		

		while (!input.toUpperCase().equals("STOP")) {
			int year = Integer.parseInt(input);
			if (LeapYear.isLeapYear(year)== true) {
				System.out.println (year + " is a leap year");
			
			}
			else 
			{
				System.out.println (year + " is not a leap year");
			}
			
			System.out.print("Enter a year (or enter STOP to end): ");
			input = sc.nextLine();
			
		}
		sc.close();
	}
}