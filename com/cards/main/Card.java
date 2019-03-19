/******************************************************************************
 *  Card.java
 *  Card in a deck
 *
 * This card represents a poker style card
 ******************************************************************************/
package com.cards.main;

public class Card {
    // Enumeration that represents all the Suits in a deck of cards
    public enum Suit {
        HEARTS,
        SPADES,
        CLUBS,
        DIAMONDS
    }
    
    // Enumeration that represents all the ranks in a suit
    public enum Rank {
        ACE,
        TWO,
        THREE,
        FOUR,
        FIVE,
        SIX,
        SEVEN,
        EIGHT,
        NINE,
        TEN,
        JACK,
        QUEEN,
        KING
    }

    private Suit suit;
    private Rank rank;

    public Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    /* Get the suite of a card */
    public Suit getSuit() {
        return suit;
    }

    /* Get the rank of a card */
    public Rank getRank() {
        return rank;
    }

    /* Print the Card */
    public String toString() {
        return  this.rank.toString()+" of "+this.suit.toString();
    }

}