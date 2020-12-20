package HackathonQns;

import java.util.Scanner;

public class StrLowerToUpper {

	public static void main(String[] args) {
		System.out.println("Enter a String(lower to UPPER) : ");
		Scanner scan = new Scanner(System.in);
		String str= scan.nextLine();
		//System.out.println("Upper case of String : "+str.toUpperCase());
		char[] ch= str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>='a' && ch[i]<='z')
				ch[i]=(char)((int)ch[i]-32);
		}
		System.out.println("\nUppercase Conversion : ");
		for(int i=0;i<ch.length;i++)
			System.out.print(ch[i]);
	}

}
