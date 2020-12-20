package HackathonQns;

import java.util.Scanner;

public class RevWords {

	public static void main(String[] args) {
		System.out.println("Enter the string to reverse : ");
		Scanner scan = new Scanner(System.in);
		String str= scan.nextLine();
		String[] sArray = str.split(" ");
		String rev ="";
		
		for(int i=sArray.length-1;i>=0;i--)
		{   
			String word = sArray[i];
			rev += word + " ";
		}
		System.out.println("Reversed : "+rev);
	
  }
}
