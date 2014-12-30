
import javax.swing.JButton;
import javax.swing.JFrame;



public class SimpleFrame extends JFrame 
{

	public SimpleFrame() 
	{	
		setTitle("I'm just a simple frame");
		setSize(400, 200);
		
		
		
		JButton top = new JButton("Top");
		JButton bottom = new JButton("Bottom");
		JButton left = new JButton("Left");
		JButton right = new JButton("Right");
		JButton center = new JButton("Center");
		

		add("North", top);
		add("South", bottom);
		add("West",left);
		add("East", right);
		//add("Center", center);
		
	}

}
