package HackathonQns;
import java.util.Arrays;
//Quick sort in Java

public class QuickSort {
	

	  // divide the array on the basis of pivot
	  int partition(int array[], int start, int end) {

	    int pivot = array[end];
    
	    int i = start-1;

	    for (int j = start; j < end; j++) {
	      if (array[j] <= pivot) {
	        i++;
	        int temp = array[i];
	        array[i] = array[j];
	        array[j] = temp;
	      }
	    }

	    // put pivot in position
	    int temp = array[i + 1];
	    array[i + 1] = array[end];
	    array[end] = temp;
	    return (i + 1);
	  }

	  void quickSort(int array[], int start, int end) {
	    if (start < end) {

	      int pi = partition(array, start, end);
	      // for left sort 
	      quickSort(array, start, pi - 1);
	      // for right sort 
	      quickSort(array, pi + 1, end);
	    }
	  }

	 
	 public static void main(String args[]) {

	   
	    int[] iArray = { 18, 27, 42, 15, 88, 11, 3 };
	    int size = iArray.length;
	    
	    QuickSort qs = new QuickSort();
	    qs.quickSort(iArray, 0, size - 1);
	    
	    System.out.println("Sorted Array: ");
	    System.out.println(Arrays.toString(iArray));
	  }
	

}
