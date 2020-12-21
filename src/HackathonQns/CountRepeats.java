package HackathonQns;
//.WJP to find total number of repeated integers, uppercase and lowercase character in the give string *


import java.util.Scanner;

public class CountRepeats {

	public static void main(String[] args) {
		
		System.out.println("Enter the String : ");
		Scanner scan=new Scanner(System.in);
		String str = scan.next();
		
		
		char[] ch = str.toCharArray();	
		for(int i=0;i<ch.length;i++)
			{
				int count =1;
				for(int j=i+1;j<ch.length;j++)	
					if(ch[i] == ch[j])
					  {
						count++;
						ch[j]='X'; //Mark as visited -to avoid printing again;
						
					  }
				if(count>1 && ch[i] != 'X' && ch[i] !=' ') {
					if(ch[i] >='A' && ch[i] <='Z')
					    System.out.println("Upper Case  "+ch[i] +" is repeated--"+count);
					else if(ch[i] >= 'a' && ch[i] <='z')
					System.out.println("Lower Case  "+ch[i] +" is repeated--"+count);
					else if(ch[i] >='0' && ch[i] <='9')
					System.out.println("Integer number  " +ch[i] +" is repeated--"+count);
				}
					
			}
		  

	}

}
