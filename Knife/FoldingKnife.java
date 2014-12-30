
public class FoldingKnife extends Knife 
{
  
	boolean open;
   
   
	public FoldingKnife()
	{
		open = false;
		bladeLength = 3;
	}
	
	
	public void cut(String myObject)
	{
		open = true;
		super.cut(myObject);
	}
	
	
}
