/******************************************************************************
 *  Deck.java
 *  Deck of Cards
 *
 * This class represents a Deck of Cards 
 * and performs various functions on those cards
 ******************************************************************************/
package com.cards.main;

import com.cards.util.CardUtils;
import java.util.ArrayList;
import java.util.Random;

public class Deck implements IDeck {
    private ArrayList<Card> deck;

    public Deck() {
        deck = new ArrayList<>(Card.Suit.values().length * Card.Rank.values().length);
        initializeDeck();
    }

    public ArrayList<Card> getDeck(){
        return this.deck;
    }

    // Creates a new deck of cards
    private void initializeDeck() {
        // Creating all possible cards
        for (Card.Suit suit : Card.Suit.values()) {
            for (Card.Rank rank : Card.Rank.values()) {
                Card card = new Card(suit, rank);
                deck.add(card);
            }
        }
    }

    // Shuffle Deck
    public void shuffle(){
        Random rand = new Random();
        int deckSize = deck.size();
        for(int i = 0; i < deckSize; i++){
            // Pick a random from remaining cards
            int rIndex = i + rand.nextInt(deckSize-i);

            //Swap cards
            Card temp = deck.get(rIndex);
            deck.set(rIndex, deck.get(i));
            deck.set(i, temp);
        }
    }

    // Returns a random card from the deck of cards
    public Card dealOneCard() {
        if(deck.isEmpty()) return null;
        //Get a random card from the current deck
        Card pickedCard = CardUtils.getRandomCard(deck);
        // Remove the selected card from the deck
        deck.remove(pickedCard);
        return pickedCard;
    }

    // Returns all cards that were dealt
    public void dealAllCards()
    {
        //Shuffle
        shuffle();
        //Deal
        while(!deck.isEmpty())
            System.out.println(dealOneCard().toString());
    }
}
