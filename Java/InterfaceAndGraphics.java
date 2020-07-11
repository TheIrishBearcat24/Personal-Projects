import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;

// import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;

import java.awt.geom.Rectangle2D;

import java.awt.image.BufferedImage;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.JFrame;
import javax.swing.JButton;

import javax.imageio.ImageIO;

import java.io.File;
import java.io.IOException;

@SuppressWarnings("serial")
public class InterfaceAndGraphics extends JPanel {
    private final int PREF_W = 1920;
    private final int PREF_H = 1080;

    private List<Shape> shapes = new ArrayList<>();

    static JFrame frame = new JFrame("Bury the Card");
    public static JButton _button = new JButton("Run animation");
    static JPanel container = new JPanel();

    private BufferedImage _img;

    private String filePath = "Java/images/back_of_card.jpg";
    private static String soundPath = "Java/audio/dealCard.wav";

    private File f = new File(filePath);

    static AnimationsAndSound animationsAndSound = new AnimationsAndSound();

    public InterfaceAndGraphics() {
        setBackground(Color.LIGHT_GRAY);
    }

    private void addShape(Shape shape) {
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
        for (Shape shape : shapes) {
            g2.draw(shape);
        }

        g2.drawImage(_img, 1000, 280, 189, 266, null);
    }

    private void imageLoad() {
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

        container.setVisible(true);

        rectangles.addShape(new Rectangle2D.Double(150, 50, 189, 266));
        rectangles.addShape(new Rectangle2D.Double(150, 500, 189, 266));
        rectangles.addShape(new Rectangle2D.Double(750, 50, 189, 266));
        rectangles.addShape(new Rectangle2D.Double(750, 500, 189, 266));
        rectangles.addShape(new Rectangle2D.Double(1000, 280, 189, 266));

        _button.setVisible(true);
        container.setVisible(true);
        container.add(_button);

        rectangles.add(container);
        
        rectangles.imageLoad();

        animationsAndSound.dealCard(soundPath);
        
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.getContentPane().add(rectangles);
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createGUI();
            }
        });
    }
}