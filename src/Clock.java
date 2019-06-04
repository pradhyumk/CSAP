

import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;

public class Clock extends Applet {

	public void paint(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		int x = 23;
		int y = 5;
		int w = 500;
		int h = 500;
		Ellipse2D.Double c1 = new Ellipse2D.Double(x, y, w, h);
		g2.draw(c1);
		c1.setFrame(x, y, w, h);
		// hour hand
		Rectangle hour = new Rectangle(270, 50, 5, 190);
		g2.setColor(Color.green);
		g2.fill(hour);
		g2.draw(hour);

		final int size = 50;
		String num = "12";
		Font nums = new Font("Serif", Font.BOLD, size);
		g2.setFont(nums);
		g2.setColor(Color.red);
		g2.drawString(num, 250, 50);
		g2.drawString("1", 380, 100);
		g2.drawString("3", 480, 260);
		g2.drawString("2", 457, 170);
		g2.drawString("4", 454, 366);
		g2.drawString("5", 369, 453);
		g2.drawString("6", 264, 480);
		g2.drawString("7", 150, 447);
		g2.drawString("8", 70, 356);
		g2.drawString("9", 54, 260);
		g2.drawString("10", 80, 153);
		g2.drawString("11", 158, 77);
		
		Rectangle min = new Rectangle(270, 235, 120, 5);
		g2.setColor(Color.yellow);
		g2.fill(min);
		g2.draw(min);

	}
}
