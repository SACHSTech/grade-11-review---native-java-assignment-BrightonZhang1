package gr11review.part1;
import java.io.*;

public class Review8{
	public static void main(String[] args) throws IOException{
		int intCounter = 0;
		for(int i = 0; i < 1000; i++){
			int intNumOne = (int) Math.round(Math.random() * 8);
			int intNumTwo = (int) Math.round(Math.random() * 8);
			int intNumThree = (int) Math.round(Math.random() * 8);
			System.out.println(intNumOne + " " + intNumTwo + " " + intNumThree);
			if(intNumOne == intNumTwo && intNumTwo == intNumThree){
				intCounter++;
			}
		}
		System.out.println(intCounter);
	}
}