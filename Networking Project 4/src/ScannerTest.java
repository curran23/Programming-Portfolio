import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		InputStreamReader isReader = new InputStreamReader(System.in);
		BufferedReader myReader = new BufferedReader(isReader);
		
		System.out.print("Enter name: ");
		
		try {
			String name = myReader.readLine();
			System.out.println(name);
		} 
		catch (IOException e) {
		
		}
	}	

}
