package gr11review.part1;
import java.io.*;

public class Review7{
	public static void main(String[] args) throws IOException{
		// buffered reader object creation
		BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

		// variable declaration
		String strSentence;
		int intSpaceCount = 0;
		int intACount = 0;

		// user input and outputs # of characters
		strSentence = keyboard.readLine();
		System.out.println("There are " + strSentence.length() + " characters in the sentence.");

		// for loop counting number of spaces using .isWhitespace()
		for(int i = 0; i < strSentence.length(); i++){
		    if(Character.isWhitespace(strSentence.charAt(i))){
			intSpaceCount ++;
		    }
		}

		System.out.println("There are " + intSpaceCount + " spaces in the sentence.");

		// for loop counting number of letter a's
		for(int i = 0; i < strSentence.length(); i++){
		    if(strSentence.charAt(i) == 'a'){
			intACount ++;
		    }
		}

		System.out.println("There are " + intACount + " letter a in the sentence.");

		// for loop printing "-" every 2 characters of the string
		for(int i = strSentence.length(); i > 0 ; i -= 2){
		    System.out.print("-");
		}
	}
}
