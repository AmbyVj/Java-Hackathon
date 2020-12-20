package HackathonQns;

import java.util.Scanner;

public class OnlyPlusOpr {
     static int count;
		public static void main(String[] args) {
			//int a=30, b=10;
			int temp = 0;
			System.out.println("Enter two integer numbers : ");
			Scanner sc=new Scanner(System.in);
			int a=sc.nextInt();
			int b=sc.nextInt();
			
			for(int i =1;i<=a;i++)		
				temp += b;
			System.out.println("Multiplication Using '+' :" +temp);
			temp=0;
			while(true)
			{
				if(temp != a) {
					temp += b;
					++count;
					continue;
			       }
				else {
					System.out.println("Division using '+'   : "+count);
				    break;				
				  }					
			  }	
			temp=0;
			for(int i =1; i<count;i++)
				temp +=b;
			System.out.println("Subtraction using '+': "+temp);
		}

}
