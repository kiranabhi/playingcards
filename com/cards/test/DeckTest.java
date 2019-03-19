package com.cards.test;


import com.cards.main.Card;
import com.cards.main.Deck;
import com.cards.main.IDeck;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class DeckTest {
    IDeck deck;
    @Before
    public void setUpDeck() {
        deck= new Deck();
    }

    @Test
    public void deckInitialization(){
        Assert.assertEquals(deck.getDeck().size(),52);

    }

    @Test
    public void checkShuffle(){
        List<Card> originalDeck = new ArrayList<>(deck.getDeck());
        deck.shuffle();
        List<Card> shuffledDeck = deck.getDeck();
        int countIdentical = 0;
        for(int i = 0; i < shuffledDeck.size(); i++){
            if(shuffledDeck.get(i) == originalDeck.get(i))
                countIdentical++;
        }
        Assert.assertNotEquals(shuffledDeck.size(), countIdentical);
    }

    @Test
    public void checkDealOneCard(){
        Card card = deck.dealOneCard();
        Assert.assertNotNull(card);
        Assert.assertEquals(deck.getDeck().size(),51);
    }

    @Before
    public void createNewDeck(){
        deck = new Deck();
    }

    @Test
    public void checkDealAll(){
        // The complete case
        // Shuffle cards
        deck.shuffle();
        //Check if still 52 cards exist
        Assert.assertEquals(deck.getDeck().size(),52);
        HashSet<Card> dealtCards = new HashSet<>();
        //Deal 52 cards one at a time
        for(int i = 0; i < 52; i++){
            boolean inserted = dealtCards.add(deck.dealOneCard());
            //Check if the card that is dealt is unique
            Assert.assertEquals(inserted, true);
        }
        //Check if any cards is dealt on the 53rd time we call dealOneCard()
        Assert.assertNull(deck.dealOneCard());
    }
}
