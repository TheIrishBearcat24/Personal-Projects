#include "Board.h"

void Board::setNumPlayers() {
    cout << "How many people are at the table? ";
    cin >> numPlayers;
    cout << "There are " << numPlayers << " players at the table" << endl;
}

int Board::getCurrentAmount() {
    return currentAmount;
}

// int main() {
//     Board board;
//     board.setNumPlayers();
//     return 0;
// }