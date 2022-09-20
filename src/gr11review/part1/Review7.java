package gr11review.part1;
import java.io.*;

public class Review7{
	public static void main(String[] args) throws IOException{
		BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

        String strSentence;
        int intSpaceCount = 0;
        int intACount = 0;

        strSentence = keyboard.readLine();
        System.out.println("There are " + strSentence.length() + " characters in the sentence.");

        for(int i = 0; i < strSentence.length(); i++){
            if(Character.isWhitespace(strSentence.charAt(i))){
                intSpaceCount ++;
            }
        }

        System.out.println("There are " + intSpaceCount + " spaces in the sentence.");

        for(int i = 0; i < strSentence.length(); i++){
            if(strSentence.charAt(i) == 'a'){
                intACount ++;
            }
        }

        System.out.println("There are " + intACount + " letter a in the sentence.");


        for(int i = strSentence.length(); i > 0 ; i -= 2){
            System.out.print("-");
        }
	}
}