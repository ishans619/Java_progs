package Javaprac;
import java.util.*;

public class Array {
	
	public static void main(String [] args) {
		
		
		System.out.println("enter the length that the array will have :");
		Scanner me = new Scanner (System.in);
		int arr_length = me.nextInt();
		int arr[] = new int[arr_length];
		System.out.println("enter the elements that will be in the array");
		for(int i = 0 ; i<arr_length ; i++) {
			
			arr[i] = me.nextInt();
			
		}
		
		System.out.println("the array that has been given by the user is:");
		for(int i = 0 ; i < arr_length ; i++) {
			
			System.out.print(arr[i]+" ");
			
		}
		
	}

}
