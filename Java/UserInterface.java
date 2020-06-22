import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.GridLayout;

public class UserInterface {

    JFrame frame = new JFrame("Bury the Card");
    JPanel container = new JPanel(new GridLayout(1, 1));
    ImageGraphics rectangle1 = new ImageGraphics(100, 50, 100, 200);
    ImageGraphics rectangle2 = new ImageGraphics(400, 50, 100, 200);
    
    public void _frameInitialization() {
        frame.setVisible(true);
        frame.setSize(1600, 1600);
        container.add(rectangle1);
        container.add(rectangle2);
        frame.add(container);
        container.setVisible(true);
    }

    public static void main(String[] args) {
        UserInterface _interface = new UserInterface();
        _interface._frameInitialization();
    }
}