import javax.swing.*;
import java.awt.*;

public class DrawingCanvas extends JComponent{
	private int width;
	private int height;

	public DrawingCanvas(int width, int height){
		this.width = width;
		this.height = height;
		this.setPreferredSize(new Dimension(width, height));
	}

	public void paintComponent(Graphics gr){
		Graphics2D g = (Graphics2D) gr;
		//draw stuff here
	}
}