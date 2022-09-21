package gr11review.part1;
import java.io.*;

public class Review8{
	public static void main(String[] args) throws IOException{
		// variable declaration
		int intCounter = 0;

		// for loop rolling 3 numbers 1000 times
		for(int i = 0; i < 1000; i++){

			// new random number generated every loop
			int intNumOne = (int) Math.round(Math.random() * 8);
			int intNumTwo = (int) Math.round(Math.random() * 8);
			int intNumThree = (int) Math.round(Math.random() * 8);
			System.out.println(intNumOne + " " + intNumTwo + " " + intNumThree);

			// if statement checking if numbers match
			if(intNumOne == intNumTwo && intNumTwo == intNumThree){
				intCounter++;
			}
		}
		// outputs the number of matching rolls
		System.out.println(intCounter);
	}
}
