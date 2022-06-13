package jsnacks;

import java.util.Scanner;

public class JSnack2  {
 
	public static void main(String[] args) {
	
		int numberChoice;
		
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Tell me a even number please; Remember, if you write a odd number the system will put automatically the following even number  ");
		numberChoice = scan.nextInt();
		
		if(numberChoice % 2 == 0) {
			System.out.println(numberChoice);
		}
		else {
			System.out.println(numberChoice + 1);
		}
}
}
