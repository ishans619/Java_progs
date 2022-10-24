package Javaprac;
import java.util.*;
public class Linearsearch {
	
	public static void main(String args []) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("enter the number to be searched");
		int key = sc.nextInt();
		int arr[] = {1,2,3,4,5,6,7,8,9,0};
		
		for(int i = 1 ; i <= arr.length ; i++ ) {
			if(arr[i] == key) {
				System.out.println(arr[i]+" is the number ur looking for ");
				
			}
			
			else {
				System.out.println("the number is not in this array");
			}
			
		}
		
		
		
	}

}
