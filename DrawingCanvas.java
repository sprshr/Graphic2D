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
		// ears
		g.fillRoundRect(80, 230, 40, 60, 25, 35);
		g.fillRoundRect(360, 230, 40, 60, 25, 35);
		g.setColor(new Color(49,49,49));
		g.fillOval(85, 253, 12, 14);
		g.fillOval(383, 253, 12, 14);
		// hair
		g.setColor(Color.black);
		g.setStroke(new BasicStroke(25));
		g.drawArc(117, 110, 250, 150, 0, 150);
		// left eye
		g.setColor(new Color(174, 182, 188));
		g.drawOval(150, 210, 50, 10);
		g.setColor(Color.black);
		g.fillOval(162, 200, 30, 30);
		g.setColor(new Color(139, 82, 8));
		g.fillOval(175, 214, 10, 10);
		// right eye
		g.setColor(new Color(174, 182, 188));
		g.drawOval(275, 210, 50, 12);
		g.setColor(Color.black);
		g.fillOval(285, 200, 30, 30);
		g.setColor(new Color(139, 82, 8));
		g.fillOval(292, 214, 10, 10);
		// right eyebrow
		g.setStroke(new BasicStroke(3));
		g.setColor(Color.black);
		for (int xValue = 275; xValue <= 325; xValue += 5) {
			g.drawArc(xValue, 185, 70, 20, 175, 25);
		}
		// left eye brow
		for (int xValue = 145; xValue <= 200; xValue += 5) {
			g.drawArc(xValue, 185, 70, 20, 175, 25);
		}
		// nose
		g.setStroke(new BasicStroke(2));
		g.drawArc(223, 280, 20, 20, 180, 185);
		g.drawArc(243, 280, 20, 20, 180, 185);
		g.drawLine(223, 290, 238, 250);
		int xValue = 175;
		int startAngle = 180;
		int arcAngle = 180;
		//mouth
		while(xValue <= 275){
			g.drawArc(xValue += 10, 340, 10, 10, startAngle, arcAngle);
			// alternates between 5-180 and 185-180
			startAngle = Math.abs(startAngle - 185);
			arcAngle = Math.abs(arcAngle - 365);
		}
		g.setColor(new Color(214, 184, 93));
		g.drawArc(190, 370, 100, 20, 0, 180);
		// signature
		g.setStroke(new BasicStroke(2));
		g.setColor(Color.darkGray);
		g.setFont(new Font("Ink Free", Font.PLAIN, 22));
		g.drawString("Sepehr Sahraian", 320, 480);
	}
}