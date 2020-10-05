#ifndef BOARD_H
#define BOARD_H

#include <iostream>

using namespace std;

class Board {
    private:
        int numPlayers; // number of players
        int currentAmount; // variable for current amount of money
        int bet;

        struct playerMoves {
            char hit = 'H';
            char stand = 'S';
            char double_down = 'D';
        };
    public:
        void setNumPlayers();
        int getNumPlayers();

        int getCurrentAmount();

        void placeBet();

        void playerDecision(); // this is for hit, stand, or double down
};

#endif