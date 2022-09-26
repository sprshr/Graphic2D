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
		this.drawEars(g);
		this.drawFace(g);
		this.drawHair(g);
		this.drawLeftEye(g);
		this.drawLeftEyeBrow(g);
		this.drawMouth(g);
		this.drawNose(g);
		this.drawRightEye(g);
		this.drawRightEyeBrow(g);
		this.drawSignature(g);
	}
	public void drawFace(Graphics2D g){
		g.setColor(new Color(212, 172, 118));
		g.fillOval(100, 100, 280, 310);
	}
	public void drawEars(Graphics2D g){
		g.setColor(new Color(212, 172, 118));
		g.fillRoundRect(80, 230, 40, 60, 25, 35);
		g.fillRoundRect(360, 230, 40, 60, 25, 35);
		g.setColor(new Color(49, 49, 49));
		g.fillOval(85, 253, 12, 14);
		g.fillOval(383, 253, 12, 14);
	}
	public void drawHair(Graphics2D g){
		g.setColor(Color.black);
		g.setStroke(new BasicStroke(25));
		g.drawArc(117, 110, 250, 150, 0, 150);
	}
	public void drawLeftEye(Graphics2D g){
		g.setStroke(new BasicStroke(25));
		g.setColor(new Color(174, 182, 188));
		g.drawOval(150, 210, 50, 10);
		g.setColor(Color.black);
		g.fillOval(162, 200, 30, 30);
		g.setColor(new Color(139, 82, 8));
		g.fillOval(175, 214, 10, 10);
	}
	public void drawRightEye(Graphics2D g){
		g.setStroke(new BasicStroke(25));
		g.setColor(new Color(174, 182, 188));
		g.drawOval(275, 210, 50, 12);
		g.setColor(Color.black);
		g.fillOval(285, 200, 30, 30);
		g.setColor(new Color(139, 82, 8));
		g.fillOval(292, 214, 10, 10);
	}
	public void drawLeftEyeBrow(Graphics2D g){
		g.setStroke(new BasicStroke(3));
		g.setColor(Color.black);
		for (int xValue = 145; xValue <= 200; xValue += 5) {
			g.drawArc(xValue, 185, 70, 20, 175, 25);
		}
	}
	public void drawRightEyeBrow(Graphics2D g){
		g.setStroke(new BasicStroke(3));
		g.setColor(Color.black);
		for (int xValue = 275; xValue <= 325; xValue += 5) {
			g.drawArc(xValue, 185, 70, 20, 175, 25);
		}
	}
	public void drawNose(Graphics2D g){
		g.setColor(Color.black);
		g.setStroke(new BasicStroke(2));
		g.drawArc(223, 280, 20, 20, 180, 185);
		g.drawArc(243, 280, 20, 20, 180, 185);
		g.drawLine(223, 290, 238, 250);
	}
	public void drawMouth(Graphics2D g){
		int xValue = 175;
		int startAngle = 180;
		int arcAngle = 180;
		while (xValue <= 275) {
			g.drawArc(xValue += 10, 340, 10, 10, startAngle, arcAngle);
			// alternates between 5-180 and 185-180
			startAngle = Math.abs(startAngle - 185);
			arcAngle = Math.abs(arcAngle - 365);
		}
		g.setColor(new Color(214, 184, 93));
		g.drawArc(190, 370, 100, 20, 0, 180);
	}
	public void drawSignature(Graphics2D g){
		g.setStroke(new BasicStroke(2));
		g.setColor(Color.darkGray);
		g.setFont(new Font("Ink Free", Font.PLAIN, 22));
		g.drawString("Sepehr Sahraian", 320, 480);
	}
}