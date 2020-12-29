#ifndef CARDS_H
#define CARDS_H

#include <vector>
#include <string>
#include <iostream>
#include <algorithm>
#include <ctime>
#include <stdlib.h>

#include "Players.h"

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
        int handSum = 0;

        vector<Deck> deckOfCards;

    public:
        void loadDeck();
        void printDeck();
        void shuffleDeck();

        void convertVals(string convertedString);
        int getConvertedValue();

        void changeAceValue(bool _switch);
};

#endif