import javax.swing.JFrame;

public class StarViewer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		
		frame.setSize(300, 400);
		frame.setTitle("Star");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		StarComponent star = new StarComponent();
		frame.add(star);
		
		frame.setVisible(true);

	}

}
