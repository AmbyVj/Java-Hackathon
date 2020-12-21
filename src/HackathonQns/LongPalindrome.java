package HackathonQns;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeMap;

public class LongPalindrome {

	public static void main(String[] args) {
		System.out.println("Enter the string for Palindrome : ");
		Scanner scan = new Scanner(System.in);
		String str= scan.nextLine();
		
		String[] str1 = str.split(" ");	
		ArrayList<String> li = new ArrayList<>();
		
		for(int i=0;i<str1.length;i++)
		{
		  String rev ="";
		  String word = str1[i];
	
		for(int j=word.length()-1;j>=0;j--)
			rev = rev +word.charAt(j);
		if(word.toLowerCase().equals(rev.toLowerCase()))
		  {
			li.add(word);
			System.out.println(word + "-- This word is a Palindrome!");
		  }
		else
		  System.out.println(word + "-- Not a Palindrome!");
		}
		Collections.sort(li);
		System.out.println("\nPalindrome words : "+li);
		
		int size = li.size()-1;
		System.out.println("\nLongest Palindrome : "+li.get(size));
	}

}
