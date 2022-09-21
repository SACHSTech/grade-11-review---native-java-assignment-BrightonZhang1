package gr11review.part1;
import java.io.*;
import java.text.DecimalFormat;

public class Review6{
	public static void main(String[] args) throws IOException{
        // decimal format and buffered reader object creation
        DecimalFormat df = new DecimalFormat("0.00");
		BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

        // variable declaration
        double dblsubTotal = 0;
        double dblPrice;
        
        // do while loop to calculate price until user types 0
        do{
            System.out.print("Enter the price for an item: ");
            dblPrice = Double.parseDouble(keyboard.readLine());
            dblsubTotal += dblPrice;
        }while(dblPrice != 0);

        // output prices with and without tax
        System.out.println("Subtotal: $" + df.format(dblsubTotal));
        System.out.println("Tax: $" + df.format(dblsubTotal * 0.13));
        System.out.println("Total: $" + df.format(dblsubTotal * 1.13));
	}
}
