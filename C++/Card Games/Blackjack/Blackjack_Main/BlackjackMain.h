#ifndef BlackjackMain_H
#define BlackjackMain_H

#include <vector>
#include <string>
#include <variant>

using namespace std;

class BlackjackMain {
    private:
        struct suits {
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
        };

        struct ranks {
            string clubs = "Clubs";
            string hearts = "Hearts";
            string spades = "Spades";
            string diamonds = "Diamonds";
        };

        struct values {
            int two = 2;
            int three = 3;
            int four = 4;
            int five = 5;
            int six = 6;
            int seven = 7;
            int eight = 8;
            int nine = 9;
            int ten = 10;
            int jack = 10;
            int queen = 10;
            int king = 10;
            int ace = 11;
        };

    public:
    
};

#endif