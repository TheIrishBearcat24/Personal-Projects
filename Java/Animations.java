import java.util.Random;

import java.io.IOException;
import java.io.File;

import javax.imageio.ImageIO;

import javax.swing.JPanel;
import javax.swing.Timer;

import java.awt.event.*;

@SuppressWarnings("serial")
public class Animations extends JPanel {

    InterfaceAndGraphics ui = new InterfaceAndGraphics();

    private int xDelta, yDelta;
    private int xPos, yPos;
    
    public void moveCard() throws IOException {
        InterfaceAndGraphics._button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
                    ui._img = ImageIO.read(new File("Java/images/back_of_card.jpg"));
                } catch (IOException e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                }

            Random rnd = new Random();
            do {
                xDelta = rnd.nextInt(4);
            } while (xDelta == 0);
            do {
                yDelta = rnd.nextInt(4);
            } while (yDelta == 0);
            if (rnd.nextBoolean()) {
                xDelta *= -1;
            }
            if (rnd.nextBoolean()) {
                yDelta *= -1;
            }

            xPos = (getPreferredSize().width - ui._img.getWidth()) / 2;
            yPos = (getPreferredSize().height - ui._img.getHeight()) / 2;

            Timer timer = new Timer(40, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    xPos += xDelta;
                    yPos += yDelta;
                    if (xPos + ui._img.getWidth() > getWidth()) { 
                        xPos = getWidth() - ui._img.getWidth();
                        xDelta *= -1;
                    } else if (xPos < 0) {
                        xPos = 0;
                        xDelta *= -1;
                    }
                    if (yPos + ui._img.getHeight() > getHeight()) { 
                        yPos = getHeight() - ui._img.getHeight();
                        yDelta *= -1;
                    } else if (yPos < 0) {
                        yPos = 0;
                        yDelta *= -1;
                    }

                    repaint();
                }
            });
            timer.start();
                }
            
        });
    }
}