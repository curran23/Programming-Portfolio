
public class Knife {

	protected int bladeLength;
	
	
	public Knife()
	{
		bladeLength = 3;
	}
	
	

	
	
	public void cut(Object myObject)
	{

		System.out.println("Cutting..." + myObject);
	}
	
	
	public void cut(Knife myKnife)
	{
		System.out.println("Cutting..." + myKnife);
	}
	
	
	
	
	
	
}
