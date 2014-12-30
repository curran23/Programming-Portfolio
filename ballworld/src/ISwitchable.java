

public interface ISwitchable 
{

	/**
	 * Gets the current state of the object.
	 * 
	 * @return The current state as represented as a String.
	 */
	public String getCurrentState();
	
	
	/**
	 * Flips the switch from the current state to the next state.
	 */
	public void flipSwitch();
	
}

