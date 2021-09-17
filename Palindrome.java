package week2.day1;

import org.bouncycastle.util.Arrays;

public class Palindrome {

	public static void main(String[] args) {
		String str = "madam";
		String rev = "";

		System.out.println(str.length());

		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}

	if(rev.equalsIgnoreCase(str)) {
		System.out.println("Given string is a palindrome : "+str);
	}else {
		System.out.println("Given string is not palindrome : "+str);
	}

	}

}
