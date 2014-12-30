import java.awt.Rectangle;
import java.util.*;


public class SortDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rectangle rect1 = new Rectangle(5, 10, 20, 30);
		Rectangle rect2 = new Rectangle(10, 20, 30, 15);
		Rectangle rect3 = new Rectangle(10, 20, 45, 10);
		
		ArrayList<Rectangle> list = new ArrayList<Rectangle>();
		
		list.add(rect1);
		list.add(rect2);
		list.add(rect3);
		
		Collections.sort(list);
		
		for (int i = 0; i < list.size(); i++) {
			Rectangle r = list.get(i);
			System.out.println(r.getWidth() + " " + r.getHeight());
		}
		
	}

}
