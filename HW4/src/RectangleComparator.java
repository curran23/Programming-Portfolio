import java.util.Comparator;
import java.awt.Rectangle;

public class RectangleComparator implements Comparator<Rectangle> {
		
		private double r1Area;
		private double r2Area;
		Rectangle rect1 = new Rectangle();
		Rectangle rect2 = new Rectangle();
		
	
		public int compare(Rectangle r1, Rectangle r2) {
			r1Area = r1.getHeight() * r1.getWidth();
			r2Area = r2.getHeight() * r2.getWidth();
		
			if (r1Area > r2Area) {
				return 1;
			}
			if (r1Area < r2Area) {
				return -1;
			}
			else {
				return 0;
			}
		}	
	}
		