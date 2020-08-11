#ifndef IMAGE_H
#define IMAGE_H

#include "mainwindow.h"
#include "ui_mainwindow.h"

#include <QPixmap>

using namespace Qt;

// single colon here means that Image is sub-class of MainWindow
// so now it can access the different items on the UI
class Image : public MainWindow {
private:
    int dx = -10;
    int dy = -10;
    int x, y;
public:
    void moveImage();
    int getX();
    int getY();
    void setDest(int destX, int destY);
};

#endif // IMAGE_H
