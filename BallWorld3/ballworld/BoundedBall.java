package ballworld;
import javax.swing.JFrame;
import javax.swing.JPanel;



public class BoundedBall extends Ball 
{

	private JPanel myWorld;
	
	public BoundedBall(int x, int y, int r, int dx, int dy, JPanel aPanel) 
	{
		super(x, y, r, dx, dy);
		myWorld = aPanel;
	}
	
	@Override
	public void move()
	{
		super.move();
		
		int maxWidth = myWorld.getWidth();
		if (( x < 0) || ( x > maxWidth))
			reverseDeltaX();
			
		int maxHeight = myWorld.getHeight();
		if (( y < 0) || ( y > maxHeight))
			reverseDeltaY();
	}
}
