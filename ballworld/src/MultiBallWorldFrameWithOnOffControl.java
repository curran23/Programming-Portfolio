

import java.awt.Button;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;


public class MultiBallWorldFrameWithOnOffControl extends JFrame implements IBallWorldFrame
{
	  private static final int FRAME_WIDTH  = 600;
	  private static final int FRAME_HEIGHT = 400;
	  protected static final int INTERACTIONS  = 5000;
	
	
   //---------------------------------------------------------
   // Instance Variables
   //---------------------------------------------------------
	private Ball[] ballArray;
	private int counter;
	private OnOffSwitch mySwitch; 
	private boolean a;

	
	
	//-------------------------------------------------
	// Constructors
	//-------------------------------------------------
	public MultiBallWorldFrameWithOnOffControl() 
	{
		this(1);
	}

	public MultiBallWorldFrameWithOnOffControl(int numberOfBalls) 
	{
		  super();

		  setSize (FRAME_WIDTH, FRAME_HEIGHT);
		  setTitle("Multi Ball World");

	      ballArray = new BoundedBall[numberOfBalls];
	      for (int i = 0; i < ballArray.length; i++)
	      {    	  
	    	  int myDx = (int) (20 * Math.random());
	    	  int myDy = (int) (10 * Math.random());
	    	  
	          ballArray[i] = new  BoundedBall(  84-i*2, 84-i*2, 10, myDx, myDy, this);
	      }
	      
	      Button moveButton = new Button( "Move");
	      moveButton.addActionListener( new MoveButtonListener());
	      add("South", moveButton);
	    
	      mySwitch = new OnOffSwitch();
	    
	}
	
	
	//-------------------------------------------------
	// Class Methods
	//-------------------------------------------------
	@Override
	  public void paint( Graphics g )
	  {
		  super.paint(g);
		  
	      for (int i = 0; i < ballArray.length; i++)
	      {
	          ballArray[i].paint( g );
	      
	         
		    if (mySwitch.getCurrentState().equals("on"))
		    {
				ballArray[i].move();
			}
	      
	        try 
	        {
	  		  Thread.sleep(10);
	  	    } 
	        catch (InterruptedException e) 
	        {
	  		  e.printStackTrace();
	  	    }
	      
	        repaint();

		  }
	  }
	
	
	//-------------------------------------------------
	// Inner Classes
	//-------------------------------------------------

	  private class MoveButtonListener implements ActionListener
	  {

		@Override
		public void actionPerformed(ActionEvent e) 
		{
			mySwitch.flipSwitch();
		}
		  
	  }
	
	
	
	private class OnOffSwitch implements ISwitchable
	{
		private boolean on;
		
		public OnOffSwitch()
		{
			on = false;
		}
		
		
		@Override
		public String getCurrentState() 
		{
			if (on)
				return "on";
			else
				return "off";
		}

		@Override
		public void flipSwitch() 
		{
			on = !on;
		}
		
	}
	
	
}
