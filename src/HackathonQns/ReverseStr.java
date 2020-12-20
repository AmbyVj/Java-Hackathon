package HackathonQns;

import java.util.Scanner;
import java.util.StringTokenizer;

//import com.sun.tools.javac.main.CommandLine.Tokenizer;

//Q13. Given a string print the reverse of the string.(Input: Java Code Output: edoC avaJ) *
public class ReverseStr {

	public static void main(String[] args) {
		System.out.println("Enter the string to reverse : ");
		Scanner scan = new Scanner(System.in);
		String str= scan.nextLine();
		String rev ="";
	     /*
	      * str.subSequence(2, 5));	     
		str.split(regex);
		str.split(regex, limit); 
		StringTokenizer stoken = new StringTokenizer(str)
		 */
		for(int i =str.length()-1;i>=0;i--)
			rev = rev +str.charAt(i);
		System.out.println("Reversed a String : "+rev);
	}

}
