#ifndef PLAYERS_H
#define PLAYERS_H

#include "Cards.h"
#include "Board.h"

#include <vector>

using namespace std;

class Players {
    private:
        struct Player {
            int currentPot;
            int betAmount;
            vector<string[]> playerHand;  
        };
    public:
        Board _board;
        void dealPlayers();
        Player getPlayerInfo();
        void setPlayerInfo(struct Player &);
};

#endif