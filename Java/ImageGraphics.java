import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class ImageGraphics extends JPanel {

    int x, y, width, height;

    //Default constructor
    public ImageGraphics() {

    }

    //Constructor to set position of each rectangle instead of default position
    public ImageGraphics(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    //Draws the rectangle with the specific coordinates and dimensions
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D graphics2d = (Graphics2D) g;
        
        graphics2d.setColor(new Color(178, 212, 216));
        graphics2d.drawRect(x, y, width, height);

        graphics2d.fillRect(x, y, width, height);
    }
}