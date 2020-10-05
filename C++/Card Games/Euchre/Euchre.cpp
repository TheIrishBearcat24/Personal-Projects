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
        {queen, diamonds},
        {king, clubs},
        {king, hearts},
        {king, spades},
        {king, diamonds}
    };
}

void Euchre::printDeck() {
    for (const Deck &d : deckOfCards) {
        cout << d.value << " of " << d.suit << endl;
    }
}

void Euchre::shuffle() {
    random_shuffle(deckOfCards.begin(), deckOfCards.end());
}

Euchre::Euchre() {
    initDeck();
    shuffle();
    printDeck();
}

int main() {
    Euchre();
    return 0;
}