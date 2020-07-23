import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.geom.Rectangle2D;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.Timer;

@SuppressWarnings("serial")
public class InterfaceAndGraphics extends JPanel {
    private final int PREF_W = 1920;
    private final int PREF_H = 1080;

    private List<Shape> shapes = new ArrayList<>();

    static JFrame frame = new JFrame("Bury the Card");
    static JButton _button = new JButton("Run animation");
    static JPanel container = new JPanel();

    private static final String soundPath = "Java/audio/dealCard.wav";

    static Sounds sounds = new Sounds();
    ImageWork _image = new ImageWork();

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

        g2.drawImage(_image.image, _image.getX(), _image.getY(), this);

        _button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Timer timer = new Timer(30, new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        _image.move();
                        repaint(_image.getX(), _image.getY(), _image.getImageWidth(), _image.getImageHeight());
                    }
                });
        
                timer.start();
			}
            
        });
    }

    private static void createGUI() {
        InterfaceAndGraphics rectangles = new InterfaceAndGraphics();

        rectangles.addShape(new Rectangle2D.Double(150, 50, 189, 266));
        rectangles.addShape(new Rectangle2D.Double(150, 500, 189, 266));
        rectangles.addShape(new Rectangle2D.Double(750, 50, 189, 266));
        rectangles.addShape(new Rectangle2D.Double(750, 500, 189, 266));
        rectangles.addShape(new Rectangle2D.Double(1000, 280, 189, 266));

        _button.setVisible(true);
        container.setVisible(true);
        container.add(_button);

        rectangles.add(container);
        
        sounds.playSound(soundPath);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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