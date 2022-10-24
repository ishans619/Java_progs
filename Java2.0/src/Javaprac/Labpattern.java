package Javaprac;

public class Labpattern {
	
	public static void main(String args []) {
		
		int n = 6;
		
		for(int i = 1 ; i <= 6 ; i++ ) {
			
			for(int j = 1 ; j<= 3 ; j++) {
				
				System.out.print("  * ");
			}
			System.out.println();
		}
		
		for(int i = 1 ; i<=n ; i++) {
			
			for(int j = 1 ; j <= i ; j++ ) {
				
						
					System.out.print(" ");
					}
			
			for(int j = 1 ; j<=6 ; j++) {
				
				System.out.println(" * ");
			}
			
			System.out.println();
					
				}
				
			System.out.println();
			
			
		}
		
		
		
	}


