import javax.swing.JFrame;

public class ItalianFlagViewer
{
   public static void main(String[] args)
   {
      JFrame frame = new JFrame();
      frame.setSize(300, 300);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      ItalianFlagComponent component = new ItalianFlagComponent();
      frame.add(component);
      frame.setVisible(true);
   }
}

