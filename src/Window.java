import java.awt.Dimension;
import javax.swing.JFrame;


public class Window extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Window(String title){
		super(title);
		this.setSize(new Dimension(640, 480));
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.show();
	}
}
