#ifndef PLAYERS_H
#define PLAYERS_H

#include "Cards.h"
#include "Board.h"

#include <vector>

using namespace std;

class Players : public Board {
    private:
        struct Player {
            int currentPot;
            int betAmount;
            vector<string[]> playerHand;  
        };

        
        
    public:
        void dealPlayers();
        Player getPlayerInfo();
        void setPlayerInfo(struct Player &);
};

#endif