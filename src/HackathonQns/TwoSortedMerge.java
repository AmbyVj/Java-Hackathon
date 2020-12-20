package HackathonQns;
/*
 * WJP to merge two sorted array.(Do not use third array) 
 * array1[10] = 1,2,4,6,9,10 array2[4] = 3, 5,7,8 
 * After merge : array1[10] = 1,2,3,4,5,6,7,8,9,10 *
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class TwoSortedMerge {

	public static void main(String[] args) {
		
		ArrayList<Integer> array1 = new ArrayList<>(Arrays.asList(1,2,4,6,9,10));
		ArrayList<Integer> array2 = new ArrayList<>(Arrays.asList(3,5,7,8));
		System.out.println("Array 1 : "+array1);
		System.out.println("Array 2 :" +array1);
		array1.addAll(array2);
		Collections.sort(array1);
		System.out.println("Sorted & merged : "+array1);
	}

}
