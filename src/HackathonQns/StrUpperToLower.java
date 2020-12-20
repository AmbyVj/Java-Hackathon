package HackathonQns;

import java.util.Scanner;

//Q8. How can we make String upper case to lower case? 
public class StrUpperToLower {

	public static void main(String[] args) {
	
		System.out.println("Enter a String(UPPER to lower) : ");
		Scanner scan = new Scanner(System.in);
		String str= scan.nextLine();
		//System.out.println("Lower case of String : "+str.toLowerCase());
		char[] cArray = str.toCharArray();
		
		for(int i=0;i<cArray.length;i++)
			if(cArray[i]>='A' && cArray[i]<='Z')
				cArray[i] = (char)(int)(cArray[i]+32);
		System.out.println("\nLowercase Conversion : ");
		for(int i=0;i<cArray.length;i++)
			System.out.print(cArray[i]);
		
   }

}
