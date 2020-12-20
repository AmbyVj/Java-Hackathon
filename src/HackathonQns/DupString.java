package HackathonQns;

import java.util.Scanner;

public class DupString {

	public static void duplicates(String str)
	{
		char[] cArray = str.toCharArray();
		System.out.println("\nDuplicated Characters are :");
		for(int i=0;i<cArray.length;i++)
		{
			int count =1;
			for(int j=i+1;j<cArray.length;j++)
			{ 	
				if(cArray[i] == cArray[j])
				  {
					count++;
					cArray[j]='*'; //Mark as visited -to avoid printing again;
					
				  }
			}
			if(count>1 && cArray[i] != '*' && cArray[i] !=' ')
				System.out.print(cArray[i] +" ");
		}
		
	}
	
	public static void main(String[] args) {
			
		System.out.println("Enter the String : ");
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
	
		System.out.println("\nGiven String : "+str);
		
		DupString.duplicates(str);
		
	}

}
