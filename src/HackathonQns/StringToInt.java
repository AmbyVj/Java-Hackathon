package HackathonQns;
//. WJP to convert string to int *

import java.util.Scanner;

public class StringToInt {

	public static void main(String[] args) {
		
		System.out.println("Enter the String : ");
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		int total=0;
		//int i =Integer.valueOf(str);
		for (int i = 0; i < str.length(); ++i) {
			char c=str.charAt(i);
			total+=(int)c;
			  
			}
		System.out.println("Integer Value : "+total);

	}

}
