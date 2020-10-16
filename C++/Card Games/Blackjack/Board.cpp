#include "Board.h"

void Board::setNumPlayers() {
    cout << "How many people are at the table? ";
    cin >> numPlayers;
}

int main() {
    Board board;
    board.setNumPlayers();
    return 0;
}