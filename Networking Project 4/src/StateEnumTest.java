import java.util.*;
public class StateEnumTest {

	
	StatesEnum state;
	
	public StateEnumTest() {
		state = StatesEnum.CLOSED;
	}
	
	public StatesEnum getState() {
		return this.state;
	}
	
	public void runChoice(String userChoice) {
		state = state.displayState(userChoice);
	}
	
	public static void main(String[] args) {
		StateEnumTest myState = new StateEnumTest();
		Scanner myScanner = new Scanner(System.in);
		String userChoice;
		boolean quit = true;
		while (quit) {
			System.out.println("Choice: ");
			if (myScanner.hasNextLine() == true) {
				userChoice = myScanner.nextLine();
				myState.runChoice(userChoice);
				
			}
			else {
				System.out.println("Fail");
				quit = false;
			}	
			
		}
		quit = false;	
	}

}
