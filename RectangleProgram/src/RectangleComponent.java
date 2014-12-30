import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;
import javax.swing.JFrame;

public class RectangleComponent extends JComponent {

	/**
	 * @param args
	 */
	public void paintComponent(Graphics g) {
		
		Graphics2D g2 = (Graphics2D) g;
		
		Rectangle box = new Rectangle(5, 10, 20, 30);
		g2.draw(box);
		
		box.translate(15, 25);
		
		g2.draw(box);
		
		JFrame frame = new JFrame();
		
		frame.setSize(300,400);
		frame.setTitle("Two rectangles");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		RectangleComponent component = new RectangleComponent();
		frame.add(component);
		
		frame.setVisible(true);
		
	}

}
