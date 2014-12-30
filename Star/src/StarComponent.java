import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

public class StarComponent extends JComponent {
	// Component draws a star shape
	public void paintComponent(Graphics g) {
		
		Graphics2D g2 = (Graphics2D) g;
		
		Star star1 = new Star();
		
		star1.draw(g2);
	}

}
