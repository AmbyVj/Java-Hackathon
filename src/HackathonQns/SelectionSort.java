package HackathonQns;

import java.util.Scanner;

public class SelectionSort {
	
          public static void main(String[] args) {
			/*
			 ** ALGORITHM **
			  1.Search the minimum value in the given input list
			  2.Set & Swap that value to the particular index position
		      3.Increment the pointer to next element
		      4.Repeat until the list gets sorted
			 */
				
			System.out.println("Enter the length of array : ");
			Scanner sc = new Scanner(System.in);
			int arrayLength = sc.nextInt();
			
			int i,j, iMin=0, temp=0;
			int numbers[] = new int[arrayLength];
			
			System.out.println("Enter the numbers to sort : ");
			for(i=0; i<arrayLength; i++)
				numbers[i] = sc.nextInt();
			
			// Setting the index position to the pointer iMin.
			//First value will be the iMin pointer at beginning.
			for(i=0;i<arrayLength;i++)
			{	//i index position:numbers from i index to array length
				iMin = i;
			   for(j=i+1; j<arrayLength; j++)
			   {
				   if(numbers[j] < numbers[iMin])
					 //Update the index of Minimum value  
					   iMin = j;	
			   }
				temp = numbers[i];
				numbers[i] = numbers[iMin];
				numbers[iMin] = temp;  
			}	
			
		   System.out.println("After sorted : ");	
		   for(i=0; i<arrayLength; i++)	
			   System.out.print(numbers[i] +" ");
		   }
  }  
