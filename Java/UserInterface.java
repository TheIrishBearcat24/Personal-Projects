import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.BoxLayout;

public class UserInterface {

    JFrame frame = new JFrame("Bury the Card");
    JPanel container = new JPanel();
    JLabel label1 = new JLabel("1");
    JLabel label2 = new JLabel("2");
    JLabel label3 = new JLabel("3");

    JPanel rectangle1 = new ImageGraphics(0, 0, 100, 200);
    JPanel rectangle2 = new ImageGraphics(200, 0, 100, 200);
    JPanel rectangle3 = new ImageGraphics(100, 0, 100, 200);

    BoxLayout layout = new BoxLayout(container, BoxLayout.LINE_AXIS);

    public void _frameInitialization() {
        frame.setVisible(true);
        frame.setSize(1600, 1600);

        container.setLayout(layout);
        container.setVisible(true);
        rectangle1.setVisible(true);
        label1.setVisible(true);
        rectangle1.add(label1);
        container.add(rectangle1);
        rectangle1.revalidate();
        rectangle1.repaint();

        rectangle2.setVisible(true);
        container.add(rectangle2);
        rectangle2.revalidate();
        rectangle2.repaint();

        rectangle3.setVisible(true);
        container.add(rectangle3);
        rectangle3.revalidate();
        rectangle3.repaint();
        frame.add(container);
    }

    public static void main(String[] args) {
        UserInterface _interface = new UserInterface();
        _interface._frameInitialization();
    }
}