package gr11review.part1;
import java.io.*;

public class Review1{
	public static void main(String[] args) throws IOException{
		// buffered reader object creation
		BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

		// variable declaration
		int intMonthNum;
		int intDayNum;

		// input statements using buffered reader
		System.out.print("Enter the month number: ");
		intMonthNum = Integer.parseInt(keyboard.readLine());

        System.out.print("Enter the day number: ");
        intDayNum = Integer.parseInt(keyboard.readLine());

		// if statements to calculate specific month days
		int intTotalDays = intDayNum;
		if(intMonthNum > 1){
			for(int i = 0; i < intMonthNum; i++){
				if(i <= 7 && i % 2 == 1){
					intTotalDays += 31;
				}
				else if(i <= 7 && (i == 4 || i == 6)){
					intTotalDays += 30;
				}
				else if(i == 2){
					intTotalDays += 28;
				}
				else if(i >= 8 && i % 2 == 0){
					intTotalDays += 31;
				}
				else if(i >= 8 && i % 2 == 1){
					intTotalDays += 30;
				} 
			}
		}

		// output total days
		System.out.println(intTotalDays);
	}
}