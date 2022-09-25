import javax.swing.*;
import java.awt.*;

class Main {
	//set your size here
	public static final int CANVAS_WIDTH = 500;
	public static final int CANVAS_HEIGHT = 400;

  public static void main(String[] args) {
		JFrame frame = new JFrame("My Program");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		DrawingCanvas canvas = new DrawingCanvas(CANVAS_WIDTH, CANVAS_HEIGHT);
		
    frame.add(canvas);
		frame.pack();
		
		frame.setVisible(true);
  }
}