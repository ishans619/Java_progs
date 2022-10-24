package Javaprac;
import  java.util.*;

public class Javainitials {
	
	public static void main (String args []) {
		
		//calculator
		
		Scanner sc = new Scanner (System.in);
		System.out.println("enter the numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("enter the operation");
		String operation = sc.next();
		
		
		switch(operation) {
		
		case "add" : System.out.println(a+b);
		break;
		case "sub" : System.out.println(a-b);
		break;
		case "mul" : System.out.println(a*b);
		break;
		case "div" : System.out.println(a/b);
		break;
		case "modulo" : System.out.println(a%b);
		break;
	    default : System.out.println("itna paisa me itna hi milega");
		break;
		
		
		
		
		}
		
		
		
		
	}
	

}
