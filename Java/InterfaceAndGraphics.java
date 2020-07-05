import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Shape;

import java.awt.geom.Rectangle2D;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.JFrame;

//Link to solution: https://stackoverflow.com/questions/31033359/drawing-multiple-graphic2d-components-into-jpanel

@SuppressWarnings("serial")
public class InterfaceAndGraphics extends JPanel {
    private static final int PREF_W = 1920;
    private static final int PREF_H = 1080;
    
    private List<Shape> shapes = new ArrayList<>();

    static JFrame frame = new JFrame("Rectangles");

    public InterfaceAndGraphics() {
        setBackground(Color.LIGHT_GRAY);
    }

    public void addShape(Shape shape) {
        shapes.add(shape);
        repaint();
    }
    @Override
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
        InterfaceAndGraphics rectangles = new InterfaceAndGraphics();

        rectangles.addShape(new Rectangle2D.Double(200, 50, 100, 200));
        rectangles.addShape(new Rectangle2D.Double(200, 500, 100, 200));
        rectangles.addShape(new Rectangle2D.Double(800, 50, 100, 200));
        rectangles.addShape(new Rectangle2D.Double(800, 500, 100, 200));
        rectangles.addShape(new Rectangle2D.Double(1000, 280, 100, 200));

        // rectangles.addImage(imageContainer, "https://cdn.shopify.com/s/files/1/0200/7616/products/playing-cards-bicycle-rider-back-1_1024x1024.png?v=1535755695");
        
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.getContentPane().add(rectangles);
        frame.pack();
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