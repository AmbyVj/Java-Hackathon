package HackathonQns;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		System.out.println("Enter the number of elements in array : ");
		Scanner scan=new Scanner(System.in);
		int len=scan.nextInt();
		System.out.println("Enter the elements to sort : ");
		int[] iArray = new int[len];
		for(int i =0 ; i<len;i++)
			iArray[i] =scan.nextInt();
		Arrays.sort(iArray);
		
		System.out.println("\nGiven Array after sorted : ");
		for(int i=0;i<len;i++)
			System.out.print(iArray[i]+" ");
		System.out.println("\nEnter the element to search : ");
		int elem = scan.nextInt();
		int low,high,mid;
		low=0;
		high=len-1;
		
		while(low<=high)
		{

		mid = (low+ high)/2;
		if(iArray[mid] == elem) {
			System.out.println("Element found at index : "+(mid+1));
			break;
		}
		else if(elem> iArray[mid])
			low= mid+1;
		else if(elem< iArray[mid])
			high=mid-1;
	}
	
		

	}

}
