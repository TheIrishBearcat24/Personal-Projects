import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import java.util.List;

import javax.swing.*;

@SuppressWarnings("serial")
public class ImageGraphics extends JPanel {
    public static final int PREF_W = 500;
    public static final int PREF_H = PREF_W;
    public List<Shape> shapes = new ArrayList<>();

    public ImageGraphics() {
        setBackground(Color.LIGHT_GRAY);
    }

    public void addShape(Shape shape) {
        shapes.add(shape);
        repaint();
    }

    @Override // make it bigger
    public Dimension getPreferredSize() {
        if (isPreferredSizeSet()) {
           return super.getPreferredSize();
        }
        
        return new Dimension(PREF_W, PREF_H);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        for (Shape shape : shapes) {
          g2.draw(shape);
        }
    }

    public static void createGUI() {
        ImageGraphics rectangles = new ImageGraphics();

        rectangles.addShape(new Rectangle2D.Double(100, 0, 100, 100));
        rectangles.addShape(new Rectangle2D.Double(200, 50, 100, 100));
        rectangles.addShape(new Rectangle2D.Double(300, 150, 100, 100));
        rectangles.addShape(new Rectangle2D.Double(400, 200, 100, 100));

        JFrame frame = new JFrame("Rectangles");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.getContentPane().add(rectangles);
        frame.pack();
        frame.setLocationByPlatform(true);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                createGUI();
            }
        });
    }
}