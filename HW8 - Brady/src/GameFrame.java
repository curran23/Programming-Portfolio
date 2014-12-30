import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GameFrame extends JFrame
{
	private JPanel field;
	private JPanel menu;
	private GamePanel card1;
	private UNODECK1 card2;
   
    public GameFrame()
    {
    	this.setLayout(new FlowLayout());
 	   	this.setSize( 400, 300 );
        this.setTitle( "Brady's Cards " );
        this.createFieldPanel();
        this.createMenuPanel();

        //Add the field and menu panels to the frame.
        this.add(field);
        this.add(menu);
    }
	
	private void createMenuPanel()
    {
      //Set up the menu area.
      menu = new JPanel();
      menu.setBounds(0,300,250,200);
   
      //Create a button and add a listener to it.
      JButton drawButton = new JButton("Draw Card");
      drawButton.setSize(300,200);
      drawButton.addActionListener(new DrawListener());
   
      JButton shuffleButton = new JButton("Shuffle");
      shuffleButton.setSize(300,200);
      shuffleButton.addActionListener(new ShuffleListener());
      //Add the button to the menu area.
      menu.add(drawButton);
      menu.add(shuffleButton);
    
    }
	
	private void createFieldPanel()
 	{
    //Set up the card field area.
    field = new JPanel();
    field.setBounds(50,50,250,200);
   
    //Create the card and add them.
    card1 = new GamePanel();
    field.add(card1);
    }
 
	private class DrawListener implements ActionListener 
	{
		public void actionPerformed(ActionEvent e) 
	    {
			card1.getCard(getGraphics());
	    }
	}
	private class ShuffleListener implements ActionListener 
	{
		public void actionPerformed(ActionEvent e) 
	    {
			
			card1.shuffle();
	    }
	}
	

}