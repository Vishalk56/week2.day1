package week2.day1;

public class FindTypes {
	/*
	 * // Here is the input String test =
	 * "$$ Welcome to 2nd Class of Automation $$ ";
	 * 
	 * // Here is what the count you need to find int letter = 0, space = 0, num =
	 * 0, specialChar = 0;
	 * 
	 * // Build the logic to find the count of each Pseudo Code: a) Convert the
	 * String to character array b) Traverse through each character (using loop) c)
	 * Find if the given character is what type using (if) i) Character.isLetter ii)
	 * Character.isDigit iii)Character.isSpaceChar iv) else -> consider as special
	 * character
	 */

	public static void main(String[] args) {

		String test = "$$ Welcome to 2nd Class of Automation $$ ";
		int letter = 0, space = 0, num = 0, specialChar = 0;

		char[] charArray1 = test.toCharArray();
		for (int i = 0; i < charArray1.length; i++) {
			if (Character.isLetter(charArray1[i])) {
				letter++;
			} else if (Character.isDigit(charArray1[i])) {
				num++;
			} else if (Character.isSpaceChar(charArray1[i])) {
				space++;
			} else {
				specialChar++;
			}
		}

		System.out.println("Letters : " + letter + "\nDigits : " + num + "\nSpaces : " + space + "\nspecial character : "
				+ specialChar);

	}

}
