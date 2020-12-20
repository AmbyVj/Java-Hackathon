package HackathonQns;

import java.util.ArrayList;

public class MergeBintoA {

	public static void main(String[] args) {
		
		   ArrayList<Integer> alist = new ArrayList<>();
		   ArrayList<Integer> blist = new ArrayList<>();
		   alist.add(1);
		   alist.add(2);
		   alist.add(3);
		   alist.add(4);
		   alist.add(5);
		   blist.add(6);
		   blist.add(7);
		   blist.add(8);
		   blist.add(9);
		   blist.add(10);
		   System.out.println("Array A :" +alist);
		   System.out.println("Array B :"+blist);
		   alist.addAll(blist);
		   System.out.println("\nMerged B into A");
		   System.out.println(alist);
	}

}
