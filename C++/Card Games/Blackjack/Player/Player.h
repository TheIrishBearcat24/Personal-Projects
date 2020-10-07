#ifndef PLAYER_H
#define PLAYER_H

class Player {
    private:
        struct player {
            int currentPot; // amount of money player has
            int betAmount;
        }
    public:
        void dealPlayers();
};

#endif