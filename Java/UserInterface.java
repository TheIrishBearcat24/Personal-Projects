import javax.swing.JFrame;

public class UserInterface {

    JFrame frame = new JFrame();
    ImageGraphics rectangle1 = new ImageGraphics(50, 100, 100, 200);
    
    public void _frameInitialization() {
        frame.setVisible(true);
        frame.setSize(1600, 1000);
        frame.add(rectangle1);
        rectangle1.initialize();
    }

    public static void main(String[] args) {
        UserInterface _interface = new UserInterface();
        _interface._frameInitialization();
    }
}