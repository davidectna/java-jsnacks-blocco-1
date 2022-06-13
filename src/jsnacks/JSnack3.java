package jsnacks;

import java.util.Random;

public class JSnack3 {
	

	public static void main(String[] args){
		
String [] nameList = new String [10];
		
		nameList[0] = "Lorenzo";
		nameList[1] = "Dries";
		nameList[2] = "Kalidou";
		nameList[3] = "Edinson";
		nameList[4] = "Ezequiel";
		nameList[5] = "Diego";
		nameList[6] = "Paolo";
		nameList[7] = "Marek";
		nameList[8] = "Carlo";
		nameList[9] = "Maurizio";
		
		
String [] surnameList = new String [10];
		
surnameList[0] = "Insigne";
surnameList[1] = "Mertens";
surnameList[2] = "Koulibaly";
surnameList[3] = "Cavani";
surnameList[4] = "Lavezzi";
surnameList[5] = "Maradona";
surnameList[6] = "Cannavaro";
surnameList[7] = "Hamsik";
surnameList[8] = "Ancelotti";
surnameList[9] = "Sarri";

   
		Random randomName1 = new Random ();
		int max = 10;
		int numberName1 = randomName1.nextInt(max);
		
		Random randomSurname1 = new Random ();
		int numberSurname1 = randomSurname1.nextInt(max);
		
		
		Random randomName2 = new Random ();
		int numberName2 = randomName2.nextInt(max);
		
		Random randomSurname2 = new Random ();
		int numberSurname2 = randomSurname2.nextInt(max);
		
		
		Random randomName3 = new Random ();
		int numberName3 = randomName3.nextInt(max);
		
		Random randomSurname3 = new Random ();
		int numberSurname3 = randomSurname3.nextInt(max);
		
		System.out.println("I'm a Name Generator:");
		
		System.out.println((nameList[numberName1])+(" ")+(surnameList[numberSurname1]));
		System.out.println((nameList[numberName2])+(" ")+(surnameList[numberSurname2]));
		System.out.println((nameList[numberName3])+(" ")+(surnameList[numberSurname3]));
		
	}
}
