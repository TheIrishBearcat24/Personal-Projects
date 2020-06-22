// import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class UserInterface {

    JFrame frame = new JFrame("Bury the Card");
    JPanel container1 = new JPanel();
    ImageGraphics rectangle1 = new ImageGraphics(100, 100, 100, 200);
    ImageGraphics rectangle2 = new ImageGraphics(800, 100, 100, 200);
    
    public void _frameInitialization() {
        frame.setVisible(true);
        frame.setSize(1600, 1600);
        frame.add(rectangle1);
    }

    public static void main(String[] args) {
        UserInterface _interface = new UserInterface();
        _interface._frameInitialization();
    }
}