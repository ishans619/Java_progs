package Javaprac;
import java.util.*;

public class Solidtriangle {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("enter the number of rows and coloumns");
		int r = sc.nextInt();
		int c = sc.nextInt();
		for(int i = 1 ; i <= r ; i++) {
			
			for(int j = 1 ; j<=c ; j++ ) {
				
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
