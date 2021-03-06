public enum StatesEnum {
	
		CLOSED {

			StatesEnum displayState(String userChoice) {
				System.out.print("Current state is: CLOSED\n");
			
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

			StatesEnum displayState(String userChoice) {
				System.out.print("Current state is: LISTEN\n");
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

			StatesEnum displayState(String userChoice) {
				System.out.print("Current state is: SYN_SENT\n");
				
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

			StatesEnum displayState(String userChoice) {
				System.out.print("Current state is: SYN_RCVD\n");
				
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
		
			
			StatesEnum displayState(String userChoice) {
				
				System.out.print("Current state is: ESTABLISHED\n");
				
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
			
			StatesEnum displayState(String userChoice) {
				
				System.out.print("Current state is: CLOSE_WAIT\n");
				
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
			
			StatesEnum displayState(String userChoice) {
				
				System.out.print("Current state is: LAST_ACK\n");
				
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
			
			StatesEnum displayState(String userChoice) {
				
				System.out.print("Current state is: FIN_WAIT_1\n");
				
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
			
			StatesEnum displayState(String userChoice) {
				
				System.out.print("Current state is: FIN_WAIT_2\n");
				
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
				
			StatesEnum displayState(String userChoice) {
				
				System.out.print("Current state is: CLOSING\n");
				
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
			
			StatesEnum displayState(String userChoice) {
				
				System.out.print("Current state is: TIME_WAIT\n");
				return CLOSED;	
			}
		},
		
		QUIT {

			StatesEnum displayState(String userChoice) {
				System.out.println("Quitting!");
				return null;
				
			}	
		};
		
		abstract StatesEnum displayState(String userChoice);
		
}


