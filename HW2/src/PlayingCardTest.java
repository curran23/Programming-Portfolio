import org.junit.After;
import org.junit.Before;
import org.junit.Test;

	/**
	 * 
	 * @author CurranLipsett
	 * @date  2/11/2013
	 * @version 1.0
	 */

public class PlayingCardTest {
	PlayingCard card1 = new PlayingCard();
	PlayingCard card2 = new PlayingCard();

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testEqualsPlayingCard() {
		if (card1.equals(card2)) {
			System.out.println("The cards match");
		}
		else {
			System.out.println("The cards do not match");
		}
	}

}
