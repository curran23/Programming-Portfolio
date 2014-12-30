
public class Application 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		try
		{
		   PlayingCard myCard = new PlayingCard(1,20);
		   System.out.println(myCard.toString());
		}
		catch (Exception e)
		{
			System.out.println(e);
		}

		
	}

}
