public class GameApp {

	/**
	 * @param args
	 * @throws OutOfCardsException 
	 */
	public static void main(String[] args) throws OutOfCardsException {
		// TODO Auto-generated method stub
	try {
	GameFrame aDeck = new GameFrame();
	
	aDeck.setVisible(true);
	}	
	catch (Exception e) {
		System.out.println("Out of Cards");
	}
}
}


