package gr11review.part1;
import java.io.*;

public class Review2{
	public static void main(String[] args) throws IOException{
		BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("0 - print a joke about your hair");
		System.out.println("1 - print a joke about your feet");
		System.out.println("2 - print a joke about your clothes");
		System.out.println("3 - print a joke about your teacher");
		System.out.print("Choose a menu option: ");

		switch(Integer.parseInt(keyboard.readLine())){
		    case 0:
			System.out.println("Why do bees have sticky hair?\nThey always use honeycombs.");
			break;

		    case 1:
			System.out.println("Which chips do your feet like the most? Dori-toes.");
			break;

		    case 2:
			System.out.println("My tailor really likes fixing my clothes. Or sew it seams.");
			break;

		    case 3:
			System.out.println("My English teacher used to quote lord of the rings to us. 'She used to say you shall not pass'");
			break;

		    default:
			System.out.println("Invalid menu option");
		}

	}
}
