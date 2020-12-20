package HackathonQns;

import java.util.Scanner;

public class RecursiveFact {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number to find factorial : ");
		int iNum = scan.nextInt();
		
		System.out.println("Factorial Value : " +fact(iNum));

	}

	public static int fact(int n)
	{
		if(n==1)
			return 1;
		else 
			return (n*fact(n-1));
	}
}
