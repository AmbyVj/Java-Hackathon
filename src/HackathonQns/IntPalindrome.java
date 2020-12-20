package HackathonQns;

import java.util.Scanner;

////Q4. Given an array of integers check the Palindrome of the series.
public class IntPalindrome {

	public static void main(String[] args) {
		
		System.out.println("Enter the integer to check Palindrome : ");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int rem, rev=0, num1 = num;
		
		while(num!=0)
		{
			rem =num%10;
			rev =rev*10+rem;
			num =num/10;
		}
		if(rev==num1)
			System.out.println("Yes,Given number is a palindrome!");
		else
			System.out.println("No,Given number is not a  palindrome!");	
	

	}

}
