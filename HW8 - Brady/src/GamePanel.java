import java.awt.*;

import javax.swing.JPanel;
public class GamePanel extends JPanel
{
	private UNODECK1 myCard;
	UNOCard1 currentCard;
	public static final int FIRST_CARD = 0;
	UNODECK1 deck = new UNODECK1(0);
	public GamePanel() 
	    {
			
	        myCard = new UNODECK1(0);
	        //this.setBackground(Color.white); 
	        //PlayingCardPanel panel=new PlayingCardPanel();
	        this.setBackground(new java.awt.Color(255,255,128));
	        this.setPreferredSize(new java.awt.Dimension(200,200));
	        this.setLocation(200, 200);
	    }
	 
		// override the paint method
		public void paintComponent(java.awt.Graphics graphics)
		{
			super.paintComponent(graphics);  // paint background 
	 
			// get panel dimension
			int w=getWidth();  // should be 200
			int h=getHeight(); // should be 200
	 
			// create a Graphics2D object for drawing shape
			java.awt.Graphics2D gr=(java.awt.Graphics2D) graphics;
		}
		public void getCard(java.awt.Graphics graphics)
		{
			
			super.paintComponent(graphics);
			java.awt.Graphics2D gr=(java.awt.Graphics2D) graphics;
			System.out.println(deck);
			System.out.println(deck.getSize());
			UNOCard1 x = deck.getCard(FIRST_CARD);
			
			
			int cardWidth=70, cardHeight=90;
			gr.setColor(java.awt.Color.WHITE);
			gr.fillRect(0,0,cardWidth,cardHeight);
			gr.setColor(java.awt.Color.BLACK );  // with black border
			gr.drawRect(0,0,cardWidth-1,cardHeight-1);
			Font font=new Font("Dialog",Font.PLAIN, 15);
			gr.setFont(font);
			
			
			x.toString();
			System.out.println(x);
			System.out.println(deck.getSize());
			gr.drawString (x.toString(), 5, 45);
			repaint();
		}
		public void shuffle()
		{
			UNODECK1 deck = new UNODECK1(0);
			deck.toString();
			System.out.println(deck);
			System.out.println(deck.getSize());
			repaint();
		}
		
		
	}