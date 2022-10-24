package Javaprac;
import java.util.*;

public class InsertionInArray {
	
	//we need to take an array input from the user along with an element to be
	//inserted with the position to insert it at
	
	public static void insertionArray(int num,int pos,int n,int arr[]) {
		
		for(int i = n-1 ; i>=pos ; i--) {
			
			arr[i+1] = arr[i];
			
		}
		arr[pos-1] = num;
		
	}
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("enter the length of the array");
		int n = sc.nextInt();
		System.out.println("enter the array elements");
		int arr[] = new int[100];
		for(int i = 0 ; i < n ; i++) {
			
			 arr[i] = sc.nextInt();
			
		}
		
		System.out.println("enter the element to be inserted");
		int num = sc.nextInt();
		
		System.out.println("enter the position at which the element is to be inserted");
		int pos = sc.nextInt();
		
		System.out.println("array before inserting the given element");
		for(int i = 0 ; i < n ; i++) {
			System.out.print(arr[i]+" ");
			
		}
		
			System.out.println();
		
		 InsertionInArray obj = new InsertionInArray();
		
		 obj.insertionArray(num,pos,n,arr);
		
		System.out.println("the array after inserting the element is :");
		for(int i = 0 ; i < n ; i++) {
			
			System.out.print(arr[i]+" ");
			
		}
		
			System.out.println(arr[n]);
		
	}

}
