package HackathonQns;

import java.util.Scanner;

public class MergeSort {

	public static void main(String[] args) {
		System.out.println("Enter the length of array : ");
		Scanner sc = new Scanner(System.in);
		int arrLength = sc.nextInt();
		
		int numbers[] = new int[arrLength];
		
		System.out.println("Enter the numbers to sort : ");
		for(int i=0; i<arrLength; i++)
			numbers[i] = sc.nextInt();
		
		mergeSplitting(numbers);
		
		System.out.println("After sorted using Merge Sort algorithm :");
		for(int i=0; i<arrLength; i++)
			System.out.println(numbers[i]);
	}
	
	
	static void mergeSplitting(int array[])
	{
		int arrayLength = array.length;
		//Only one element in the list, then return;
		if(arrayLength<2)
			return;
		int iMid = arrayLength/2;
		int left[] = new int[iMid];
		int right[] = new int[arrayLength-iMid];
		
		for(int i=0; i<iMid; i++)
		  left[i]=array[i];
		
		for(int j=iMid; j<arrayLength;j++)
			right[j-iMid] = array[j];
		//Recursive call
		mergeSplitting(left);
		mergeSplitting(right);
		mergeSorting(left,right,array);
	}
  
		
		
	public static void mergeSorting(int left[],int right[],int array[])
	 {
		int leftLength = left.length;
		int rightLength = right.length;
		int i=0,j=0,k=0; //for left side & for right side & for main merging array loop
		
        while(i<leftLength && j<rightLength)
		 {
			if(left[i]<=right[j])
				array[k++]=left[i++];				 
			else
				array[k++]=right[j++];
		 }
		
		//to add remaining elements in either array.
		while(i<leftLength)
		  {	
			array[k++] = left[i++];
		  }
		while(j<rightLength)
		  {	
			array[k++] = right[j++];
		  }

	}

}
