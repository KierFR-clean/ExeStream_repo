package EmpManagementSys;

import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;

import javax.swing.*;

public class Scale {
	int breadth, height;
	public Scale(int height, int breadth) {
		// TODO Auto-generated constructor stub
		this.breadth = breadth;
		this.height = height;
	}
	
	ImageIcon resizeImg(URL path) {
		try {
            BufferedImage image = ImageIO.read(path);
            
            BufferedImage resized = new BufferedImage(height, breadth, BufferedImage.TYPE_INT_ARGB);
            
            Graphics2D g2d = resized.createGraphics();
            
            //preserves collinearity
            AffineTransform iform = AffineTransform.getScaleInstance(
                (double) height / image.getWidth(),
                (double) breadth / image.getHeight());
            
            g2d.setRenderingHint(java.awt.RenderingHints.KEY_INTERPOLATION,
                                 java.awt.RenderingHints.VALUE_INTERPOLATION_BICUBIC);
            g2d.setRenderingHint(java.awt.RenderingHints.KEY_RENDERING,
                                 java.awt.RenderingHints.VALUE_RENDER_QUALITY);
            g2d.setRenderingHint(java.awt.RenderingHints.KEY_ANTIALIASING,
                                 java.awt.RenderingHints.VALUE_ANTIALIAS_ON);
            
            g2d.drawRenderedImage(image, iform);
            g2d.dispose();
            
            return new ImageIcon(resized);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
	
}
