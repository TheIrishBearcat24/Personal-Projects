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
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
import javax.swing.JFrame;
import javax.swing.ImageIcon;

//Link to solution: https://stackoverflow.com/questions/31033359/drawing-multiple-graphic2d-components-into-jpanel

@SuppressWarnings("serial")
public class InterfaceAndGraphics extends JPanel {
    private static final int PREF_W = 1920;
    private static final int PREF_H = 1080;
    
    private List<Shape> shapes = new ArrayList<>();
    
    ImageIcon icon = new ImageIcon("images/back_of_card.jpg");
    
    JPanel imageContainer = new JPanel();
    static JFrame frame = new JFrame("Rectangles");

    public InterfaceAndGraphics() {
        setBackground(Color.LIGHT_GRAY);
    }

    public void addShape(Shape shape) {
        shapes.add(shape);
        repaint();
    }

    public void addImage() {
        imageContainer.add(new JLabel(icon));
        imageContainer.setVisible(true);
        frame.add(imageContainer);
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

        rectangles.addShape(new Rectangle2D.Double(50, 50, 100, 200));
        rectangles.addShape(new Rectangle2D.Double(200, 100, 100, 200));
        rectangles.addShape(new Rectangle2D.Double(300, 150, 100, 200));
        rectangles.addShape(new Rectangle2D.Double(400, 200, 100, 200));

        rectangles.addImage();
        
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