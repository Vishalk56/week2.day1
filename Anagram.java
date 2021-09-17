package week2.day1;

import java.util.Arrays;
import java.util.Iterator;

public class Anagram {

	public static void main(String[] args) {
		String str1 = "stops", str2 = "potss";

		char[] charArray1 = str1.toCharArray();
		Arrays.sort(charArray1);
		for (int i = 0; i < charArray1.length; i++) {
			System.out.println(charArray1[i]);
		}

		System.out.println("*****************");
		char[] charArray2 = str2.toCharArray();
		Arrays.sort(charArray2);
		for (int i = 0; i < charArray2.length; i++) {
			System.out.println(charArray2[i]);
		}
		
		// Checking Arrays equal
		boolean charEquals = Arrays.equals(charArray1, charArray2);
		if(charEquals) {
			System.out.println("Its Anagram");
		}else {
			System.out.println("Its not Anagram");
		}

		// Other way to check Anagram  - by converting charArray to String
		String string1 = new String(charArray1);
		String string2 = new String(charArray2);

		// string1.chars()
		System.out.println("String 1 : " + string1);
		System.out.println("String 2 : " + string2);

		if (string1.equals(string2)) {
			System.out.println("Its Anagram");
		} else {
			System.out.println("Not Anagram");
		}
	}
}
