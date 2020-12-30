#include "Game.h"

void Game::playerDecision(char playerDecision) {
    // wanted to use switch statement, but apparently C++ doesn't like characters as inputs for switches
    if (playerDecision == hit) {
        _hit();
    }

    else if (playerDecision == stand) {
        _stand();
    }

    else if (playerDecision == doubleDown) {
        _doubleDown();
    }
}

void Game::_hit() {
    cout << "Hit" << endl;
}

void Game::_stand() {
    cout << "Stand" << endl;
}

void Game::_doubleDown() {
    cout << "Double Down" << endl;
}

void Game::placeBet(int bet) {

}

int main() {
    Game newGame;
    char playerMove;
    cout << "What do you want to do? ";
    cin >> playerMove;
    newGame.playerDecision(playerMove);
    return 0;
}