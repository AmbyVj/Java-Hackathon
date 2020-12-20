package HackathonQns;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

//Given a string print the unique words of the string. *

public class UniqueString {

	public static void main(String[] args) {
		System.out.println("Enter the String : ");
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		
		String[] strArr = str.split(" ");
		
		Map<String,String> map = new LinkedHashMap<>();
		
		for(int i=0; i<strArr.length;i++) {
			if(!map.containsKey(strArr[i])) 
				map.put(strArr[i],"Unique");			
			}
		
		System.out.println(map);

	}

}
