

public class Door implements ISwitchable 
{
	//-------------------------------------------------
	// Instance Variables
	//-------------------------------------------------
	
	private boolean open;

	
	//-------------------------------------------------
	// Constructors
	//-------------------------------------------------
	public Door() 
	{
		open = true;
	}

	
	//-------------------------------------------------
	// Class Methods
	//-------------------------------------------------
	@Override
	public String getCurrentState() 
	{
		if (open)  
		{ 
			return "Open"; 
		}
		else 
		{ 
			return "Closed"; 
		}
	}

	@Override
	public void flipSwitch() 
	{
		open = !open;
	}

}
