public class Trapezoid implements IPolygon
{

	//-------------------------------------------------------------
	// Instance Variables
	//-------------------------------------------------------------
	private double lengthA;
	private double lengthB;
	private double height;
	
	//-------------------------------------------------------------
	// Constructors
	//-------------------------------------------------------------	
	public Trapezoid() 
	{
		this(10,5,10);
	}
	
	public Trapezoid(double myHeight, double myLengthA, double myLengthB)
	{
		height = myHeight;
		lengthA = myLengthA;
		lengthB = myLengthB;
	}

	//-------------------------------------------------------------
	// Class Methods
	//-------------------------------------------------------------	
	
	public double area() 
	{
		return (lengthA + lengthB) * height / 2;
	}


	public int numberOfSides() 
	{
		return 4;
	}
}