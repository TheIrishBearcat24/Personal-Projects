#ifndef CARDS_H
#define CARDS_H

#include <vector>
#include <string>
#include <iostream>
#include <algorithm>
#include <ctime>
#include <stdlib.h>

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

        int convertedValue;
        int handSum = 0;

    public:
        struct Deck {
            string ranks;
            string suits;
        };

        vector<Deck> deckOfCards;

        vector<Deck> randRemove(); // randomly removes card from deck

        void loadDeck();
        void printDeck();
        void shuffleDeck();

        void convertVals(string convertedString); // changes strings to int values
        int getConvertedValue(); // useful for updating current hand sum

        void changeAceValue(bool _switch); // sometimes Ace is either 1 or 11, depending on other card values

        int getHandSum(); // will be useful for determining when to hit or not when implementing card counting
        int rng(); // had to define a RNG function so that I could access the randIndex value w/o having to run uneeded code
};

#endif