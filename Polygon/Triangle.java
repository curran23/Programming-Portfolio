public class Triangle implements IPolygon
{

	//-------------------------------------------------------------
	// Instance Variables
	//-------------------------------------------------------------
	private double base;
	private double height;
	
	//-------------------------------------------------------------
	// Constructors
	//-------------------------------------------------------------	
	public Triangle() 
	{
		this(10,10);
	}
	
	public Triangle(double myHeight, double myBase)
	{
		base = myBase;
		height = myHeight;
	}

	//-------------------------------------------------------------
	// Class Methods
	//-------------------------------------------------------------	
	
	public double area() 
	{
		return base * height / 2;
	}


	public int numberOfSides() 
	{
		return 3;
	}
}
