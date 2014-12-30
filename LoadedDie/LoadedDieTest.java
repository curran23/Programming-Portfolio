import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * Tester class for the new LoadedDie class.
 * @author Michael J. Holmes
 * @version 1.0   2/25/2013
 *
 */


public class LoadedDieTest 
{
	
	private LoadedDie die1;

    

    @Before
    public void setUp() throws Exception
    {
        die1 = new LoadedDie(6,6,.9);
    }

	
	@Test
	public void test() 
	{
		int numberOf6s = 0;
		
		for (int i = 0; i < 1000; i++)
		{
			if(die1.roll()==6)
				numberOf6s++;
		}
        //Validates that the loaded die gets 6s 90% of the time.		
		assertEquals(.9,numberOf6s/1000.0,.05);
	}

}
