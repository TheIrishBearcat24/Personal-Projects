import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;

public class UserInterface {

    // found these constants from playing around with the frame
    final int maxX = 1425;
    final int maxY = 175;

    JFrame frame = new JFrame("Bury the Card");
    JPanel container = new JPanel();
    ImageGraphics rectangle1 = new ImageGraphics(50, 0, 100, 200);
    ImageGraphics rectangle2 = new ImageGraphics(100, 0, 100, 200);

    // BorderLayout layout = new BorderLayout(100, 100);

    GridBagLayout _gbl = new GridBagLayout();
    GridBagConstraints _gbc = new GridBagConstraints();

    public void _interfaceSetup() {
        frame.setVisible(true);
        frame.setSize(1920, 1080);

        _displayRectangles();

        frame.add(container);
    }

    public void _displayRectangles() {
        container.setLayout(_gbl);
        container.setVisible(true);

        // rectangle2.setVisible(true);
        // container.add(rectangle2);
        // rectangle2.revalidate();
        // rectangle2.repaint();

        _gbc.fill = GridBagConstraints.HORIZONTAL;

        _gbc.gridx = 0;
        _gbc.gridy = 0;

        rectangle1.setVisible(true);
        rectangle1.revalidate();
        rectangle1.repaint();
        container.add(rectangle1, _gbc);
    }

    public static void main(String[] args) {
        UserInterface _interface = new UserInterface();
        _interface._interfaceSetup();
    }
}