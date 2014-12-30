

public class StopLight implements ISwitchable 
{
	//-------------------------------------------------
	// Instance Variables
	//-------------------------------------------------
	private String color;

	
	//-------------------------------------------------
	// Constructors
	//-------------------------------------------------
	public StopLight() 
	{
		color = "Red";
	}

	
	//-------------------------------------------------
	// Class Methods
	//-------------------------------------------------	
	
	@Override
	public String getCurrentState() 
	{
		return color;
	}

	@Override
	public void flipSwitch() 
	{
		if (color.equals("Red"))
		{
			color = "Green";
		}
		else
		{
			if (color.equals("Green"))
			{
				color = "Yellow";
			}
			else
			{
				color = "Red";
			}
		}

	}


}
