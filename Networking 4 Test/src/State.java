import java.util.*;
public class State {
		
	// Creating an enumeration with each state detailed out so it can output the correct
	// information based on the input received
	public enum StateEnum {
		
		CLOSED {

			StateEnum displayState(String userChoice) {
			
				if (userChoice.toLowerCase().equals("passive open")) {
					System.out.println("recv: " + userChoice);
					System.out.println("send: <nothing>");
					return LISTEN;
				}
				else if (userChoice.toLowerCase().equals("active open")) {
					System.out.println("recv: " + userChoice);
					System.out.println("send: SYN");
					return SYN_SENT;
				}
				else if (userChoice.toLowerCase().equals("quit")) {
					return QUIT;
				}
				else {
					System.out.println("recv: " + userChoice);
					System.out.println("Invalid");
					return CLOSED;
				}
			}
			
		},
		
		LISTEN {

			StateEnum displayState(String userChoice) {
			
				if (userChoice.toUpperCase().equals("SYN")) {
					System.out.println("recv: " + userChoice);
					System.out.println("send: SYN,ACK");
					return SYN_RCVD;
				}
				else if (userChoice.toLowerCase().equals("quit")) {
					return QUIT;
				}
				else {
					System.out.println("recv: " + userChoice);
					System.out.println("Invalid");
					return LISTEN;
				}
			}
			
		},
		
		SYN_SENT {

			StateEnum displayState(String userChoice) {
				
				if (userChoice.toUpperCase().equals("SYN")) {
					System.out.println("recv: " + userChoice);
					System.out.println("send: SYN,ACK");
					return SYN_RCVD;
				}
				else if (userChoice.toUpperCase().equals("SYN,ACK")) {
					System.out.println("recv: " + userChoice);
					System.out.println("send: ACK");
					return ESTABLISHED;
				}
				else if (userChoice.toLowerCase().equals("close")) {
					System.out.println("recv: " + userChoice);
					return CLOSED;
				}
				else if (userChoice.toLowerCase().equals("quit")) {
					return QUIT;
				}
				else {
					System.out.println("Invalid");
					return SYN_SENT;
				}

			}	
		},
		
		
		SYN_RCVD {

			StateEnum displayState(String userChoice) {
				
				if (userChoice.toUpperCase().equals("ACK")) {
					System.out.println("recv: " + userChoice);
					System.out.println("send: <nothing>");
					return ESTABLISHED;
				}
				else if (userChoice.toLowerCase().equals("close")) {
					System.out.println("recv: " + userChoice);
					System.out.println("send: FIN");
					return FIN_WAIT_1;
				}
				else if (userChoice.toLowerCase().equals("quit")) {
					return QUIT;
				}
				else {
					System.out.println("Invalid");
					return SYN_RCVD;
				}
				
			}
			
		},
		
		ESTABLISHED {
		
			StateEnum displayState(String userChoice) {
				
				if (userChoice.toUpperCase().equals("FIN")) {
					System.out.println("recv: " + userChoice);
					System.out.println("send: ACK");
					return CLOSE_WAIT;
				}
				else if (userChoice.toLowerCase().equals("close")) {
					System.out.println("recv: " + userChoice);
					System.out.println("send: FIN");
					return FIN_WAIT_1;
				}
				else if (userChoice.toLowerCase().equals("quit")) {
					return QUIT;
				}
				else {
					System.out.println("Invalid");
					return ESTABLISHED;
				}
			}
			
		},
		
		CLOSE_WAIT {
			
			StateEnum displayState(String userChoice) {
				
				if (userChoice.toLowerCase().equals("close")) {
					System.out.println("recv: " + userChoice);
					System.out.println("send: FIN");
					return LAST_ACK;
				}
				else if (userChoice.toLowerCase().equals("quit")) {
					return QUIT;
				}
				else {
					System.out.println("Invalid");
					return CLOSE_WAIT;
				}
			}
			
		},
		
		LAST_ACK {
			
			StateEnum displayState(String userChoice) {
				
				if (userChoice.toUpperCase().equals("ACK")) {
					System.out.println("recv: " + userChoice);
					System.out.println("send: <nothing>");
					return CLOSED;
				}
				else if (userChoice.toLowerCase().equals("quit")) {
					return QUIT;
				}
				else {
					System.out.println("Invalid");
					return LAST_ACK;
				}
			}
			
		},
		
		FIN_WAIT_1 {
			
			StateEnum displayState(String userChoice) {
				
				if (userChoice.toUpperCase().equals("ACK")) {
					System.out.println("recv: " + userChoice);
					System.out.println("send: <nothing>");
					return FIN_WAIT_2;
				}
				else if (userChoice.toUpperCase().equals("FIN")) {
					System.out.println("recv: " + userChoice);
					System.out.println("send: <nothing>");
					return CLOSING;
				}
				else if (userChoice.toUpperCase().equals("FIN,ACK")) {
					System.out.println("recv: " + userChoice);
					System.out.println("send: ACK");
					return TIME_WAIT;
				}
				else if (userChoice.toLowerCase().equals("quit")) {
					return QUIT;
				}
				else {
					System.out.println("Invalid");
					return FIN_WAIT_1;
				}
				
			}
			
		},
		
		FIN_WAIT_2 {
			
			StateEnum displayState(String userChoice) {
				
				if (userChoice.toUpperCase().equals("FIN")) {
					System.out.println("recv: " + userChoice);
					System.out.println("send: ACK");
					return TIME_WAIT;
				}
				else if (userChoice.toLowerCase().equals("quit")) {
					return QUIT;
				}
				else {
					System.out.println("Invalid");
					return FIN_WAIT_2;
				}
			}
			
		},
		
		CLOSING {
				
			StateEnum displayState(String userChoice) {
				
				if (userChoice.toUpperCase().equals("ACK")) {
					System.out.println("recv: " + userChoice);
					System.out.println("send: <nothing>");
					return TIME_WAIT;
				}
				else if (userChoice.toLowerCase().equals("quit")) {
					return QUIT;
				}
				else {
					System.out.println("Invalid");
					return CLOSING;
				}
				
			}
			
		},
		
		TIME_WAIT {
			
			StateEnum displayState(String userChoice) {
				
				return CLOSED;	
			}
		},
		
		// The only problem with quit is that the user has to enter quit twice
		// In order for the program to move into the quit state.
		QUIT {

			StateEnum displayState(String userChoice) {
				System.out.println("Quitting!");
				System.exit(1);
				return null;
				
			}	
		};
		
		// Make an abstract object using the method in order to make sure it is callable
		abstract StateEnum displayState(String userChoice);
	// End of the enumeration declaration
	}

	// Main program code is below this lien 
	StateEnum theState;
	
	// Initial constructor setting the state to closed
	public State() {
		theState = StateEnum.CLOSED;
	}
	
	// Method used to call the Enumeration method while using a state object
	public void runChoice(String userChoice) {
		theState = theState.displayState(userChoice);
	}
	
	// Method to get the current state of the State Diagram so I can print it
	public StateEnum returnState() {
		return this.theState;
	}
	
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		String userInput;
		State myState = new State();
		boolean yes = true;
		while (yes) {
			System.out.println("Current state is: " + myState.returnState());
			System.out.print("Choice: ");
			// Ensure there is a next line before we set the userInput variable
			if (!myScanner.hasNextLine()) {
				System.exit(1);
			}
			else {
				userInput = myScanner.nextLine();
			
				// If the user provides no input, consider that to mean quit the program
				// I was having trouble with this and getting a LineNotFound exception
				// When trying to test the program using an input file
				if (userInput.equals("")) {
					System.exit(1);
				}
				else {
					myState.runChoice(userInput);
				}
			}
		}
		myScanner.close();
		yes = false;
	}

}
