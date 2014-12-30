
public class Rectangle implements IPolygon
{

	//-------------------------------------------------------------
	// Instance Variables
	//-------------------------------------------------------------
	private double width;
	private double height;
	
	//-------------------------------------------------------------
	// Constructors
	//-------------------------------------------------------------	
	public Rectangle() 
	{
		this(10,10);
	}
	
	public Rectangle(double myHeight, double myWidth)
	{
		width = myWidth;
		height = myHeight;
	}

	//-------------------------------------------------------------
	// Class Methods
	//-------------------------------------------------------------	
	
	public double area() 
	{
		return width * height;
	}


	public int numberOfSides() 
	{
		return 4;
	}
}
