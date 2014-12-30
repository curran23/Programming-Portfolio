import java.awt.Rectangle;


public class GreetingPractice {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String greeting = "Hello, Curran!";
		System.out.println(greeting);
		int numberOfCharacters = greeting.length();
		System.out.print("Number of characters in greeting: ");
		System.out.println(numberOfCharacters);
		String greeting2 = greeting.replaceAll("Curran", "Fuck Face");
		System.out.println(greeting2);
		int numberOfCharacters2 = greeting2.length();
		System.out.print("New number of characters in greeting: ");
		System.out.println(numberOfCharacters2);
		int width = 20;
		System.out.print("Width: ");
		System.out.println(width);
		double area = width * 2.54;
		area = area * 1.96;
		System.out.print("Area: ");
		System.out.println(area);
		String river = "Mississippi";
		String bigRiver = river.toUpperCase();
		System.out.print("River: ");
		System.out.println(river);
		System.out.print("Big river: "); 
		System.out.println(bigRiver);
		new Rectangle(5, 10, 20, 30);
		System.out.println(new Rectangle());

	}

}
