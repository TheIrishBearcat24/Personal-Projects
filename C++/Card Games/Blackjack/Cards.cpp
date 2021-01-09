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
    for (const Deck & d : deckOfCards) {
        cout << d.ranks << " of " << d.suits << endl; // had to look up how to print out a vector of structs
    }
}

void Cards::shuffleDeck() {
    srand(time(0)); // random number generator, if this isn't called, the same results will appear every time
    random_shuffle(deckOfCards.begin(), deckOfCards.end()); // actually shuffles the deck
    printDeck();
    cout << endl << endl;
}

void Cards::convertVals(string convertedVal) {
    if (convertedVal == two) {
        convertedValue = 2;
        cout << "Converted value: " << convertedValue;
    }

    else if (convertedVal == three) {
        convertedValue = 3;
        cout << "Converted value: " << convertedValue;
    }

    else if (convertedVal == four) {
        convertedValue = 4;
        cout << "Converted value: " << convertedValue;
    }

    else if (convertedVal == five) {
        convertedValue = 5;
        cout << "Converted value: " << convertedValue;
    }

    else if (convertedVal == six) {
        convertedValue = 6;
        cout << "Converted value: " << convertedValue;
    }

    else if (convertedVal == seven) {
        convertedValue = 7;
        cout << "Converted value: " << convertedValue;
    }

    else if (convertedVal == eight) {
        convertedValue = 8;
        cout << "Converted value: " << convertedValue;
    }

    else if (convertedVal == nine) {
        convertedValue = 9;
        cout << "Converted value: " << convertedValue;
    }

    else if (convertedVal == ten) {
        convertedValue = 10;
        cout << "Converted value: " << convertedValue;
    }

    else if (convertedVal == jack) {
        convertedValue = 10;
        cout << "Converted value: " << convertedValue;
    }

    else if (convertedVal == queen) {
        convertedValue = 10;
        cout << "Converted value: " << convertedValue;
    }

    else if (convertedVal == king) {
        convertedValue = 10;
        cout << "Converted value: " << convertedValue;
    }
}

int Cards::getConvertedValue() {
    return convertedValue;
}

void Cards::changeAceValue(bool _switch) {
    if (_switch == true) {
        handSum += 1;
    }

    else {
        handSum += 11;
    }
}

int Cards::getHandSum() {
    cout << "Hand sum: " << handSum << endl;
    return handSum;
}

vector<Cards::Deck> Cards::randRemove() {
    srand(time(0)); // RNG

    for (int i = 1; i < 4; i++) { // figured out that I have to start the counter at 1, otherwise the number of remaining
        // cards is 1 off of where it should be
        int removedIndex = rand() % 52; // random number between 0 and 51
        deckOfCards.erase(deckOfCards.begin() + removedIndex); // according to documentation, this auto-shrinks the vector
        cout << endl; // just here for spacing
        cout << deckOfCards.size() << endl; // this is just here to make sure that the card was successfully removed
        printDeck();
    }

    return deckOfCards;
}

int main() {
    Cards _cards;
    _cards.loadDeck();
    _cards.randRemove();
    return 0;
}