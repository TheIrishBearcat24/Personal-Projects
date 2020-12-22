#ifndef BOARD_H
#define BOARD_H

#include <iostream>

using namespace std;

class Board {
    private:
        int numPlayers; // number of players
        int currentAmount; // variable for current amount of money
        int bet;

        char hit = 'H';
        char stand = 'S';
        char double_down = 'D';
    public:
        void setNumPlayers();

        int getCurrentAmount();
        int getNumPlayers(); // will need this for Players class when dealing?

        void placeBet(int bet);

        void playerDecision(char decision); // this is for hit, stand, or double down
};

#endif