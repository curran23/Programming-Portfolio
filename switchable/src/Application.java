public class Application {


	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		//Use one line or the other.
		ISwitchable switch1 = new StopLight();
		//ISwitchable switch1 = new StopLight();
		
		System.out.println("Starting program...");
		
		System.out.println(switch1.getCurrentState());
		
		for (int i = 0; i < 10; i++)
		{
			System.out.print("Flip the Switch...  ");
			switch1.flipSwitch();
		
			System.out.println(switch1.getCurrentState());
		}
		
		System.out.println("...Exiting program.");

	}

}
