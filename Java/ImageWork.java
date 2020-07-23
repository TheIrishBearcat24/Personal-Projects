import javax.swing.ImageIcon;

import java.awt.Image;

public class ImageWork {

    private static final String imagePath = "Java/images/back_of_card.jpg";
    private int x = 1000;
    private int y = 280;
    private int dx = -10;
    private int dy = -10;
    private int destX = 750;
    private int destY = 50;
    private int width;
    private int height;

    Image image;

    public ImageWork() {
        loadImage();
    }

    private void loadImage() {
        ImageIcon i = new ImageIcon(imagePath);
        image = i.getImage();
        
        width = image.getWidth(null);
        height = image.getHeight(null);
    }

    public void move() {
        if (x > destX) {
            x += dx;
        }

        else if (x < destX) {
            x -= dx;
        }

        if (y > destY) {
            y += dy;
        }

        else if (y < destY) {
            y -= dy;
        }
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getImageWidth() {
        return width;
    }

    public int getImageHeight() {
        return height;
    }

    public Image getImage() {
        return image;
    }
}