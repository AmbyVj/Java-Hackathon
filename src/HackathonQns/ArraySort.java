package HackathonQns;

import java.util.Arrays;
import java.util.Scanner;

//Q3. Given an array of integers, sort the integer values.
public class ArraySort {

	public static void main(String[] args) {
		int temp;
		System.out.println("Enter the array length : ");
		Scanner scan = new Scanner(System.in);
		int len = scan.nextInt();
		int[] iArray = new int[len];
		
		System.out.println("Enter the elements to sort : ");
		for(int i=0; i<len;i++)
			iArray[i] = scan.nextInt();
		
		for(int i =0;i<len;i++)
			for(int j=i+1;j<len;j++)
			{
				if(iArray[i]>iArray[j])
				{
					temp=iArray[i];
					iArray[i]=iArray[j];
					iArray[j]=temp;
				}
			}
		//Arrays.sort(iArray);
		System.out.println("**Sorted Array**");
		for(int i=0; i<len;i++)
			System.out.print(iArray[i]+" ");
		
		}
		
			
}


