package HackathonQns;
//Given an array prints the unique numbers and also print the number of occurrences of duplicate numbers. *

import java.util.Arrays;
import java.util.Scanner;

public class OccurancesOfNumbers {

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
	int count;	
	
	for(int i=0;i<iTotal;)
	  {
	   count=1;
	    for(int j=i+1;j<iTotal;j++) 
	      {
	        if(iElements[i]==iElements[j])
			   count=count+1;
	       }
	     System.out.print("The Number " + iElements[i]+" occured "+count+" times \n");
	     i=i+count;
	   } 
	

	}

}
