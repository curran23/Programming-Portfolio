
import javax.swing.JFrame;



public class BoundedBall extends Ball 
{

	private JFrame myWorld;
	
	public BoundedBall(int x, int y, int r, int dx, int dy, JFrame aFrame) 
	{
		super(x, y, r, dx, dy);
		myWorld = aFrame;
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
