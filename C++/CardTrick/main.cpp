#include "mainwindow.h"
#include "Image.h"

#include <QApplication>

int main(int argc, char *argv[])
{
    QApplication a(argc, argv);
    MainWindow w;
    Image image;

    w.show();
    return a.exec();
}
