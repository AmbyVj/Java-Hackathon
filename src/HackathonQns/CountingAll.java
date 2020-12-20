package HackathonQns;
//. WJP to find total number of integers, uppercase and lowercase character in the given string *

import java.util.Scanner;

public class CountingAll {

	public static void main(String[] args) {
		System.out.println("Enter the String : ");
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		
		int up=0,low=0,n=0;
		for(int i=0;i<str.length();i++) {
			char c = str.charAt(i);
			if(c >= 'A' && c <='Z')
				up++;
			else if(c >= 'a' && c <='z')
				low++;
			else if(c >= '0' && c <='9')
				n++;
		}
			System.out.println("Total count of Lower case letters : " + low); 
	        System.out.println("Total count of Upper case letters : " + up); 
	        System.out.println("Total count of Numbers : " + n); 		
		
	}

}
