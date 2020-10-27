#include "Cards.h"

void Cards::loadDeck() { // creates entire deck of cards
    deckOfCards = {
        {two, clubs},
        {three, clubs},
        {four, clubs},
        {five, clubs},
        {six, clubs},
        {seven, clubs},
        {eight, clubs},
        {nine, clubs},
        {ten, clubs},
        {jack, clubs},
        {queen, clubs},
        {king, clubs},
        {ace, clubs},

        {two, hearts},
        {three, hearts},
        {four, hearts},
        {five, hearts},
        {six, hearts},
        {seven, hearts},
        {eight, hearts},
        {nine, hearts},
        {ten, hearts},
        {jack, hearts},
        {queen, hearts},
        {king, hearts},
        {ace, hearts},

        {two, spades},
        {three, spades},
        {four, spades},
        {five, spades},
        {six, spades},
        {seven, spades},
        {eight, spades},
        {nine, spades},
        {ten, spades},
        {jack, spades},
        {queen, spades},
        {king, spades},
        {ace, spades},

        {two, diamonds},
        {three, diamonds},
        {four, diamonds},
        {five, diamonds},
        {six, diamonds},
        {seven, diamonds},
        {eight, diamonds},
        {nine, diamonds},
        {ten, diamonds},
        {jack, diamonds},
        {queen, diamonds},
        {king, diamonds},
        {ace, diamonds}
    };
}

void Cards::printDeck() {
    for (const Deck &d : deckOfCards) {
        cout << d.ranks << " of " << d.suits << endl; // had to look up how to print out a vector of structs
    }
}

void Cards::shuffleDeck() {
    srand(time(0)); // random number generator, if this isn't called, the same results will appear every time
    
    random_shuffle(deckOfCards.begin(), deckOfCards.end());
    printDeck();
}

int main() {
    Cards _init;
    _init.loadDeck();
    _init.shuffleDeck();

    return 0;
}