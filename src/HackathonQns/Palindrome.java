package HackathonQns;

import java.util.Scanner;

//package HackathonQns;

public class Palindrome {

	public static void main(String[] args) {
		
		System.out.println("Enter a word for Palindrome : ");
		Scanner scan = new Scanner(System.in);
		String str= scan.next();
		String rev ="";
	
		for(int i =str.length()-1;i>=0;i--)
			rev = rev +str.charAt(i);
		
		if(str.toLowerCase().equals(rev.toLowerCase()))
			System.out.println("Given word is a Palindrome!");
		else
			System.out.println("Not a Palindrome!");
			
			
	}

}
