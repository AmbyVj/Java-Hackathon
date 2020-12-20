package HackathonQns;
//WJP to convert int to string *

import java.util.Scanner;

public class IntToString {

	public static void main(String[] args) {
		
		System.out.println("Enter the Number : ");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		//String str = ""+num;
		String str = String.valueOf(num);
		System.out.println("Converted to String : "+str);		

	}

}
