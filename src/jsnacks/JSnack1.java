package jsnacks;

import java.util.Scanner;

public class JSnack1 {

	public static void main(String[] args) {
		
		int sume = 0;
				
		Scanner scan = new Scanner (System.in);
		
		
		for (int i=0 ; i < 5; i++) {
		System.out.println("Tell me a number of your choice:");
		int numberChoice = scan.nextInt();	 
		sume += numberChoice ;
		}
		
		System.out.println("The final sume is: " + sume);
   }
}