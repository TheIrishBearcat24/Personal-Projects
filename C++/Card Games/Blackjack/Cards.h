#ifndef CARDS_H
#define CARDS_H

#include <vector>
#include <string>
#include <iostream>
#include <algorithm>
#include <ctime>
#include <stdlib.h>

// #include "Players.h"

using namespace std;

class Cards {
    private:
        string two = "Two";
        string three = "Three";
        string four = "Four";
        string five = "Five";
        string six = "Six";
        string seven = "Seven";
        string eight = "Eight";
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
            string ranks;
            string suits;
        };

        int convertedValue;

        vector<Deck> deckOfCards;

        // Players _players;

    public:
        void loadDeck();
        void printDeck();
        void shuffleDeck();
        void convertVals(string convertedString);
        void changeAceValue(int logicValue); // logic value 1 is true, logic value 0 is false;
};

#endif