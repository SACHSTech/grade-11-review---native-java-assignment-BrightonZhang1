package gr11review.part1;
import java.io.*;
import java.text.DecimalFormat;

public class Review4{
	public static void main(String[] args) throws IOException{
        DecimalFormat df = new DecimalFormat("0.00");
		BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

        int intItemNum;
        double dblsubTotal = 0;

		System.out.print("How many items do you want to buy? ");
        intItemNum = Integer.parseInt(keyboard.readLine());
        
        for(int i = 0; i < intItemNum; i++){
            System.out.print("Enter the price for item " + (i + 1) + ": ");
            dblsubTotal += Double.parseDouble(keyboard.readLine());
        }

        System.out.println("Subtotal: $" + df.format(dblsubTotal));
        System.out.println("Tax: $" + df.format(dblsubTotal * 0.13));
        System.out.println("Total: $" + df.format(dblsubTotal * 1.13));
    }
}
