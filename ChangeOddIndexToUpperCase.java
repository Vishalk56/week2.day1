package week2.day1;

import java.util.Iterator;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		// Problem statement : to convert the odd index to upper case n a string
		
		String str="welcome";
		char[] chArr=str.toCharArray();
		for (int i = 0; i < chArr.length; i++) {
			if(i%2!=0) {
				char upperCase = Character.toUpperCase(chArr[i]);
				System.out.print(upperCase);
			}else {
				System.out.print(chArr[i]);
			}
			
		}

	}

}
