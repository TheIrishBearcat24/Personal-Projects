#ifndef euchre_H
#define euchre_H

using namespace std;

#include <iostream>
#include <string>
#include <vector>
#include <algorithm>

class Euchre {

    private:
        string nine = "Nine";
        string ten = "Ten";
        string jack = "Jack";
        string queen = "Queen";
        string king = "King";
        string ace = "Ace";

        string clubs = "Clubs";
        string hearts = "Hearts";
        string spades = "Spades";
        string diamonds = "Diamonds";

        struct Deck {
            string value;
            string suit;
        };

        vector<Deck> deckOfCards;

    public:
        void initDeck();
        void printDeck();
        void shuffle();
        void dealPlayer();
        void setBauers();
        void checkScore();
        bool checkWin();
        Euchre();
        
};

#endif