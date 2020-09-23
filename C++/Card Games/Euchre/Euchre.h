#ifndef euchre_H
#define euchre_H

using namespace std;

#include <iostream>
#include <string>
#include <map>
#include <vector>

class Euchre {

    private:
        char nine = 'N';
        char ten = 'T';
        char jack = 'J';
        char queen = 'Q';
        char king = 'K';
        char ace = 'A';

        string clubs = "Clubs";
        string hearts = "Hearts";
        string spades = "Spades";
        string diamonds = "Diamonds";

        map<char, string> deck = {
            {nine, clubs},
            {ten, clubs},
            {jack, clubs},
            {queen, clubs},
            {king, clubs},
            {ace, clubs},

            {nine, hearts},
            {ten, hearts},
            {jack, hearts},
            {queen, hearts},
            {king, hearts},
            {ace, hearts},
            
            {nine, spades},
            {ten, spades},
            {jack, spades},
            {queen, spades},
            {king, spades},
            {ace, spades},

            {nine, diamonds},
            {ten, diamonds},
            {jack, diamonds},
            {queen, diamonds},
            {king, diamonds},
            {ace, diamonds}
        };
    
    public:
        void testPrint(map<char, string> &);
        void shuffle();
        void dealPlayer();
        void setBauers();
        void checkScore();
        bool checkWin();
        Euchre();
        
};

#endif