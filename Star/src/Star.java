import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

public class Star {
	
	/** Constructs a star based on the top left tip of the star
	 @param x the x-coordinate of the top left tip of the star
	 @param y the y-coordinate of the top left tip of the star
	 * @return 
	 */
	
	private int xLeft;
	private int yTop;
	
	public void Car(int x, int y) {
		xLeft = x;
		yTop = y;
	}
	
	/** Draws the car
	 @param g2 the graphics context
	 */
	public void draw(Graphics2D g2) {
		//Top left tip of the star
		Point2D.Double p1 = new Point2D.Double(xLeft + 10, yTop + 10);
		//Top tip of the star
		Point2D.Double p2 = new Point2D.Double(xLeft + 20, yTop + 20);
		//Top right tip of the star
		Point2D.Double p3 = new Point2D.Double(xLeft + 30, yTop + 20);
		//Bottom right tip of the star
		Point2D.Double p4 = new Point2D.Double(xLeft + 30, yTop - 20);
		//Bottom left tip of the star
		Point2D.Double p5 = new Point2D.Double(xLeft, yTop - 20);
		
		Line2D.Double l1 = new Line2D.Double(p1, p3);
		Line2D.Double l2 = new Line2D.Double(p3, p5);
		Line2D.Double l3 = new Line2D.Double(p5, p2);
		Line2D.Double l4 = new Line2D.Double(p2, p4);
		Line2D.Double l5 = new Line2D.Double(p4, p1);
		
		g2.draw(l1);
		g2.draw(l2);
		g2.draw(l3);
		g2.draw(l4);
		g2.draw(l5);
	}
}
