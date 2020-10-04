#include "Euchre.h"

void Euchre::initDeck() {
    deckOfCards = {
        {nine, clubs},
        {nine, hearts},
        {nine, spades},
        {nine, diamonds},
        {ten, clubs},
        {ten, hearts},
        {ten, spades},
        {ten, diamonds},
        {jack, clubs},
        {jack, hearts},
        {jack, spades},
        {jack, diamonds},
        {queen, clubs},
        {queen, hearts},
        {queen, spades},
        {queen, diamonds}
    };
}

void Euchre::testPrint() {
    for (const Deck &d : deckOfCards) {
        cout << d.value << " of " << d.suit << endl;
    }
}

Euchre::Euchre() {
    initDeck();
    testPrint();
}

int main() {
    Euchre();
    return 0;
}