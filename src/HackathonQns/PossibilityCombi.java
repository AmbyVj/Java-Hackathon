package HackathonQns;

import java.util.Scanner;

/*
 * Write a program which inputs a positive natural number N and 
 * prints the possible consecutive number combinations, 
 * which when added give N. INPUT: N = 9 OUTPUT: 4 + 5 2 + 3+ 4 *

 */
public class PossibilityCombi {

	public static void main(String[] args) {
		
		System.out.println("Enter the number : ");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int temp=num;
		for(int i=1;i<=num/2;i++) 
		{
			if(i + (temp-i) == num)
				System.out.println( i + " + "+(temp-i));
			else 
				continue;
		 }
	}
}