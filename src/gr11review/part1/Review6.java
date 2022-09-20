package gr11review.part1;
import java.io.*;
import java.text.DecimalFormat;

public class Review6{
	public static void main(String[] args) throws IOException{
        DecimalFormat df = new DecimalFormat("0.00");
		BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

        double dblsubTotal = 0;
        double dblPrice;
        
        do{
            System.out.print("Enter the price for an item: ");
            dblPrice = Double.parseDouble(keyboard.readLine());
            dblsubTotal += dblPrice;
        }while(dblPrice != 0);

        System.out.println("Subtotal: $" + df.format(dblsubTotal));
        System.out.println("Tax: $" + df.format(dblsubTotal * 0.13));
        System.out.println("Total: $" + df.format(dblsubTotal * 1.13));
	}
<<<<<<< HEAD
}
=======
}
>>>>>>> ba44e09120c4800577aaaaca348f4869aa9cf68d
