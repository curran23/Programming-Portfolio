
public class Parallelogram implements IPolygon
{

	//-------------------------------------------------------------
	// Instance Variables
	//-------------------------------------------------------------
	private double length;
	private double height;
	
	//-------------------------------------------------------------
	// Constructors
	//-------------------------------------------------------------	
	public Parallelogram() 
	{
		this(10,10);
	}
	
	public Parallelogram(double myHeight, double myLength)
	{
		height = myHeight;
		length = myLength;
	}

	//-------------------------------------------------------------
	// Class Methods
	//-------------------------------------------------------------	
	
	public double area() 
	{
		return length * height;
	}


	public int numberOfSides() 
	{
		return 4;
	}
}
