import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Ellipse2D.Double;

public class Slinky extends Applet {
	public void paint(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		double x = 10;
		double y = 10;
		double w = 100;
		double h = 100;
		double k = 0;
		double xpos = x + k, ypos = y + k;
		Ellipse2D.Double c1 = new Ellipse2D.Double(ypos, ypos, w, h);

		for (k = -7.917; k < -0.145; k += .1) {
			xpos = -(-100 * k);
			ypos = -(-1 * k * 3 * Math.pow(Math.sin(k), 2)) * 20;

			c1.setFrame(xpos + 800, ypos + 475, w, h);
			g2.draw(c1);
		}

	}
}