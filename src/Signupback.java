import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Signupback extends JPanel {
	BufferedImage img;
	
	public Signupback(String path) {
		File imgFile = new File(path);
		try {
			img = ImageIO.read(imgFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.drawImage(img, 0, 0, img.getWidth(), img.getHeight(), null);
	}

}
