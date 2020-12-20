package HackathonQns;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class UniquesNumbers {

	public static void main(String[] args) {
		System.out.println("Enter the number of elements in array : ");
		Scanner sc=new Scanner(System.in);
		int iTotal=sc.nextInt();
		
		int[] iElements = new int[iTotal];
		
		System.out.println("Enter the array elements : ");
		for(int i=0; i<iTotal; i++) 
		  {
			iElements[i]=sc.nextInt();
		  }
		//sort the given elements
		Arrays.sort(iElements);
		System.out.println("Number of occurances : ");
		int count,uniq =0;	
		
		for(int i=0;i<iTotal;)
		  {
		   count=1;
		    for(int j=i+1;j<iTotal;j++) 
		      {
		        if(iElements[i]==iElements[j])
				   count=count+1;
		       }
		     if(count==1)
		    	 System.out.println("\nUnique element : "+iElements[i]);
		     else
		     System.out.print("\nThe Number " + iElements[i]+" occured "+count+" times \n");
		     i=i+count;
		   } 
		


	}

	}


