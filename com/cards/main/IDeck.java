/******************************************************************************
 *  IDeck.java
 *  Deck of Cards Interface
 * 
 *
 * This interface defines the functions of Deck of Cards 
 ******************************************************************************/
package com.cards.main;

import java.util.List;

public interface IDeck {
    Card dealOneCard();
    void dealAllCards();
    void shuffle();
    List<Card> getDeck();
}