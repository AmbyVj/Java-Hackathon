package HackathonQns;

import java.util.Scanner;

//. WJP to display number of occurrence of all character *
public class OccuranceOfChars {

	public static void main(String[] args) {
		
		System.out.println("Enter the String : ");
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		
		System.out.println("\nGiven String : "+str);	
	    System.out.println("\nOccurances of each Character  :");
	    str = str.toLowerCase();
	    char[] cArray = str.toCharArray();
	    
	    for(int i=0;i<cArray.length;i++)
		{
			int count =1;
			for(int j=i+1;j<cArray.length;j++)	
				if(cArray[i] == cArray[j])
				  {
					count++;
					cArray[j]='X'; //Mark as visited -to avoid printing again;
					
				  }
			if(count>0 && cArray[i] != 'X' && cArray[i] !=' ')
				System.out.println(cArray[i] +"--"+count);
		}
	}

}
