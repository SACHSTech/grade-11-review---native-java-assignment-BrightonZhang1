package gr11review.part1;
import java.io.*;

public class Review5{
	public static void main(String[] args) throws IOException{
		BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

		int intYearlyAmount;
		double dblCompound;
		int intTarget;
		double dblMoney = 0;
		int intYear = 0;

		System.out.print("Enter the yearly invested amount: ");
		intYearlyAmount = Integer.parseInt(keyboard.readLine());

		System.out.print("Enter the compound interest rate: ");
		dblCompound = (Double.parseDouble(keyboard.readLine())) / 100;

		System.out.print("Enter the target amount: ");
		intTarget = Integer.parseInt(keyboard.readLine());

		if(intTarget != 0){
		    while(dblMoney <= intTarget){
			dblMoney += intYearlyAmount;

			if(dblCompound != 0){
			    dblMoney *= (dblCompound + 1);
			}

			intYear++;
		    }
		}

		if(dblCompound == 0 && dblMoney != 0 && intTarget != 0){
		    intYear--;
		}

		System.out.println("The target amount will be earned in " + intYear + " years.");
	}
}
