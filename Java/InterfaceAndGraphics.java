import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Shape;

import java.awt.geom.Rectangle2D;

import java.awt.image.BufferedImage;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.JFrame;

import javax.imageio.ImageIO;

import java.io.File;
import java.io.IOException;

//Link to solution: https://stackoverflow.com/questions/31033359/drawing-multiple-graphic2d-components-into-jpanel

@SuppressWarnings("serial")
public class InterfaceAndGraphics extends JPanel {
    private static final int PREF_W = 1920;
    private static final int PREF_H = 1080;
    
    private List<Shape> shapes = new ArrayList<>();

    static JFrame frame = new JFrame("Bury the Card");

    BufferedImage _img;

    String filePath = "Java/images/back_of_card.jpg";

    File f = new File(filePath);

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

        g2.drawImage(_img, 200, 50, 100, 250, null);
        g2.drawImage(_img, 200, 500, 100, 250, null);
        g2.drawImage(_img, 800, 50, 100, 250, null);
        g2.drawImage(_img, 800, 500, 100, 250, null);
        g2.drawImage(_img, 1000, 280, 100, 250, null);
    }

    public void imageLoad() {
        try {
            _img = ImageIO.read(f);
        }

        catch (IOException e) {
            System.out.println("File not loaded!");
            System.exit(0);
        }
    }

    public static void createGUI() {
        InterfaceAndGraphics rectangles = new InterfaceAndGraphics();

        rectangles.addShape(new Rectangle2D.Double(200, 50, 100, 200));
        rectangles.addShape(new Rectangle2D.Double(200, 500, 100, 200));
        rectangles.addShape(new Rectangle2D.Double(800, 50, 100, 200));
        rectangles.addShape(new Rectangle2D.Double(800, 500, 100, 200));
        rectangles.addShape(new Rectangle2D.Double(1000, 280, 100, 200));
        
        rectangles.imageLoad();
        
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