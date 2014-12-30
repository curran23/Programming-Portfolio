import java.io.*;
import java.util.*;

public class Total {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
	
		// Get the input and output file names
		Scanner console = new Scanner(System.in);
		System.out.print("Input File: ");
		String inputFileName = console.next();
		System.out.print("Output File: ");
		String outputFileName = console.next();
		
		// Construct a file reader and writer
		try
		{
		File inputFile = new File(inputFileName);
		Scanner in = new Scanner(inputFile);
		PrintWriter out = new PrintWriter(outputFileName);
		
		// Read the input and write the output
			
		double total = 0;
		
		while (in.hasNextDouble()) {
			double value = in.nextDouble();
			out.printf("%10.2f\n", value);
			total = total + value;
		}
		out.printf("Total: %8.2f\n", total);
		out.printf("Have a nice day BITCH");
		
		in.close();
		out.close();
		
		System.out.print("File manipulation complete");
		}
		catch (FileNotFoundException exception) {
			System.out.println("Could not find the specified file");
		}
	}
}
