#include "Image.h"
#include <iostream>

int Image::getX() {
    return ui->imageLabel->x();
}

int Image::getY() {
    return ui->imageLabel->y();
}

void Image::setDest(int destX, int destY) {
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
