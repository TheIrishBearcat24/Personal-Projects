import javax.swing.ImageIcon;

import java.awt.Image;

public class ImageWork {

    private static final String imagePath = "Java/images/back_of_card.jpg";
    private int x = 1000;
    private int y = 280;
    private int dx = -10;
    private int dy = -10;
    private int width;
    private int height;

    Image image;

    public ImageWork() {
        loadImage();
    }

    //loads up image
    private void loadImage() {
        ImageIcon i = new ImageIcon(imagePath);
        image = i.getImage();
        
        width = image.getWidth(null);
        height = image.getHeight(null);
    }

    /**
     * @param destX x coordinate for the card to move to
     * @param destY y coordinate for the card to move to
     * 
     * x is the starting x position for the deck of cards
     * y is the starting y position for the deck of cards
     * 
     * the logic below prevents the card from moving out of the screen
     */
    public void move(int destX, int destY) {
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