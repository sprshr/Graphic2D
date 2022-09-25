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

	public void paintComponent(Graphics gr) {
		Graphics2D g = (Graphics2D) gr;
		// face
		g.setColor(new Color(212,172,118));
		g.fillOval(100, 100, 280, 310);
		// hair
		g.setColor(Color.black);
		g.setStroke(new BasicStroke(25));
		g.drawArc(117, 110, 250, 150, 0, 150);
		// left eye
		g.setColor(Color.gray);
		g.drawOval(150, 210, 50, 10);
		g.setColor(Color.black);
		g.fillOval(162, 200, 30, 30);
		g.setColor(new Color(139, 82, 8));
		g.fillOval(175, 214, 10, 10);
		// right eye
		g.setColor(Color.gray);
		g.drawOval(275, 210, 50, 12);
		g.setColor(Color.black);
		g.fillOval(285, 200, 30, 30);
		g.setColor(new Color(139, 82, 8));
		g.fillOval(292, 214, 10, 10);
		// right eyebrow
		g.setStroke(new BasicStroke(3));
		g.setColor(Color.black);
		for (int Xvalue = 275; Xvalue <= 325; Xvalue += 5) {
			g.drawArc(Xvalue, 185, 70, 20, 175, 25);
		}
		// left eye brow
		for (int Xvalue = 145; Xvalue <= 200; Xvalue += 5) {
			g.drawArc(Xvalue, 185, 70, 20, 175, 25);
		}
		// nose
		g.setStroke(new BasicStroke(2));
		g.drawArc(223, 280, 20, 20, 180, 185);
		g.drawArc(243, 280, 20, 20, 180, 185);
		g.drawLine(223, 290, 238, 250);
		// mouth
		//g.drawArc(180, 330, 20, 20, 180, 185);
		//g.drawArc(200, 330, 20, 20, 5, 180);
		int xValue = 175;
		int startAngle = 180;
		int arcAngle = 180;
		while(xValue <= 275){
			g.drawArc(xValue += 10, 340, 10, 10, startAngle, arcAngle);
			startAngle = Math.abs(startAngle - 185);
			arcAngle = Math.abs(arcAngle - 365);
			
		}
	}

}