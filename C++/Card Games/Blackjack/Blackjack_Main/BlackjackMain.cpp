#include "BlackjackMain.h"

void BlackjackMain::loadDeck() {
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

void BlackjackMain::printDeck() {
    for (const Deck &d : deckOfCards) {
        cout << d.ranks << " of " << d.suits << endl;
    }
}

void BlackjackMain::shuffleDeck() {
    srand(time(0));
    
    for (int i = 0; i < 3; i++) {
        random_shuffle(deckOfCards.begin(), deckOfCards.end());
        cout << endl;
    }
}

int main() {
    BlackjackMain _init;
    _init.loadDeck();
    _init.shuffleDeck();

    return 0;
}