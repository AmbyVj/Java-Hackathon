package HackathonQns;
//Q1. Consider there is a 3 Boolean variable called a, b, c. Check if at least two out of three Booleans are true.
import java.util.Scanner;

public class BooleanCheck {

	public static void main(String[] args) {
		
		System.out.println("Enter the values(three true/false :");
		Scanner scan = new Scanner(System.in);
		boolean a = scan.nextBoolean();
		boolean b = scan.nextBoolean();
		boolean c = scan.nextBoolean();
		
		System.out.println("*Checked the given values*");
		if(a&&b&&c)
			System.out.println("All three given values are true!");
		else if(a&&b || b&&c || c&&a)
		
			System.out.println("Two out of three values are true");	
		else
			System.out.println("Two out of three values are not true");

	}

}
