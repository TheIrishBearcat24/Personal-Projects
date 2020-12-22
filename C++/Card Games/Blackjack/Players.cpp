#include "Players.h"

void Players::dealPlayers() {
    _board.setNumPlayers();

    for (int i = 0; i < 2; i++) {
        cout << "This is a test" << endl;
    }
}

// void Players::setPlayerInfo(struct Player & p) {

// }

int main() {
    Players p;

    p.dealPlayers();

    return 0;
}