#ifndef GAME_H
#define GAME_H

using namespace std;

#include <iostream>
#include "Players.h"

class Game {
    private:
        int currentAmount; // variable for current amount of money
        int bet; // how much player wants to bet

        char hit = 'H';
        char stand = 'S';
        char doubleDown = 'D';

    public:
        void dealPlayers();
        void checkGame();
        void placeBet(int bet);
        void playerDecision(char decision); // this is for hit, stand, or double down
        int getBalance();
        void _hit();
        void _stand();
        void _doubleDown();
};

#endif