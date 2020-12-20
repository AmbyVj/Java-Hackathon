package HackathonQns;
//Input (ht, wt): (65, 100) (70, 150) (56, 90) (75, 190) (60, 95) (68, 110)
//Output: The longest tower is length 6 and includes from top to bottom: (56, 90) (60,95) (65,100) (68,110) (70,150) (75,190)
import java.util.TreeMap;

public class TowerSort {

	public static void main(String[] args) {
		
		TreeMap<Integer,Integer> tmap = new TreeMap<>();
		tmap.put(65, 100);
		tmap.put(70, 150);
		tmap.put(56, 90);
		tmap.put(75, 190);
		tmap.put(60, 95);
		tmap.put(68, 110);
		System.out.println("The length of the tower is : " +tmap.size());
		System.out.println("From top to bottom : "+tmap);
		

	}

}
