package u3pp;

/**
 * YOUR COMMENTs HERE
 * 
 * @author Christian Martin-Ross
 *
 */

public class LeapYear {
	/**
	 * YOUR COMMENTS HERE
	 */
	public static boolean isLeapYear(int year) {
		if (year >= 1582 && (year % 4 == 0))	
		{
			if (year % 100 !=0 || (year % 100 == 0 && year % 400 == 0)) 
			{
				return true;
			}
				
				
					
		}
		else 
		{
			return false;
		}
		return false;
		
	}
}
