package gr11review.part1;
import java.io.*;
import java.text.DecimalFormat;

public class Review4{
	public static void main(String[] args) throws IOException{
		// decimal format and buffered reader objects created
		DecimalFormat df = new DecimalFormat("0.00");
		BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

		// variable declaration
		int intItemNum;
		double dblsubTotal = 0;

		// user input
		System.out.print("How many items do you want to buy? ");
		intItemNum = Integer.parseInt(keyboard.readLine());

		// for loop taking user input per item and adding to subtotal
		for(int i = 0; i < intItemNum; i++){
		    System.out.print("Enter the price for item " + (i + 1) + ": ");
		    dblsubTotal += Double.parseDouble(keyboard.readLine());
		}

		// output and calculations with and without tax
		System.out.println("Subtotal: $" + df.format(dblsubTotal));
		System.out.println("Tax: $" + df.format(dblsubTotal * 0.13));
		System.out.println("Total: $" + df.format(dblsubTotal * 1.13));
    	}
}
