import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.BoxLayout;

public class UserInterface {

    JFrame frame = new JFrame("Bury the Card");
    JPanel container = new JPanel();
    ImageGraphics rectangle1 = new ImageGraphics(0, 0, 100, 200);
    ImageGraphics rectangle2 = new ImageGraphics(200, 100, 100, 200);
    BoxLayout layout = new BoxLayout(container, BoxLayout.LINE_AXIS);

    public void _frameInitialization() {
        frame.setVisible(true);
        frame.setSize(1600, 1600);
        rectangle1.setVisible(true);
        frame.add(rectangle1);

        container.setLayout(layout);
        container.setVisible(true);

        rectangle1.setVisible(true);
        container.add(rectangle1);
        rectangle1.revalidate();
        rectangle1.repaint();

        rectangle2.setVisible(true);
        container.add(rectangle2);
        rectangle2.revalidate();
        rectangle2.repaint();

        frame.add(container);
    }

    public static void main(String[] args) {
        UserInterface _interface = new UserInterface();
        _interface._frameInitialization();
    }
}