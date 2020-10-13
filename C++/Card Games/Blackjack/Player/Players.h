#ifndef PLAYERS_H
#define PLAYERS_H

#include "C:\Users\Cameron Clarke\Desktop\Personal-Projects\C++\Card Games\Blackjack\Cards.h"
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

        Board _board;
    public:
        void dealPlayers();
        Player getPlayerInfo();
        void setPlayerInfo(struct Player &);
};

#endif