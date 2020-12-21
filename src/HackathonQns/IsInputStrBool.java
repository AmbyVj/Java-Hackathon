package HackathonQns;

import java.util.Scanner;

public class IsInputStrBool {
    
	public static void main(String[] args) {
		int i =10;
		String str ="abc";
		Boolean b =true;
		System.out.println("Integer is passed as an Object "+check(i));
		System.out.println("String is passed as an Object "+check(str));
		System.out.println("Boolean is passed as an Object "+check(b));
		
	}
	
	public static Object check(Object obj) {
	  if(obj instanceof Integer)
		  return obj;
	  else if(obj instanceof String)
		  return obj;
	  else if(obj instanceof Boolean)
		  return obj;
	return obj;
	}  

}
