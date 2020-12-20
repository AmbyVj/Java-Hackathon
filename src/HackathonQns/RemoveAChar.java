package HackathonQns;

import java.util.Scanner;

public class RemoveAChar {

	public static void main(String[] args) {
		System.out.println("Enter the String : ");
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		
		System.out.println("Enter a char to remove : ");
		String c = scan.next();
		//String str1 = str.replace(c, "");
		str=str.replaceAll(String.valueOf(c), "");
		
		System.out.println(str);
	}

}
