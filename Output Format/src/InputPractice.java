import java.util.Scanner;

public class InputPractice {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Please enter the price for a six-pack: ");
		double packPrice = in.nextDouble();
		
		System.out.print("Please enter the price of a two liter: ");
		double literPrice = in.nextDouble();
		
		System.out.printf("The price per can in a six pack is %3.2f: ", packPrice / 6);
		System.out.println();
		System.out.printf("The price per liter of a two liter is %3.2f: ", literPrice / 2);
	}

}
