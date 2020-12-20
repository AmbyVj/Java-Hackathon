package HackathonQns;

import java.util.Scanner;

//Q2. write a program to find factorial (Non Recursive) 
public class Factorial {

	public static void main(String[] args) {
		int num,fact=1;
		System.out.println("Enter the number to find the Factorial value: ");
		Scanner scan = new Scanner(System.in);
		num = scan.nextInt();
		
		for(int i=1; i<=num;i++)
			fact *= i;
		System.out.println("\nFactorial of "+num+" is "+fact);

	}

}
