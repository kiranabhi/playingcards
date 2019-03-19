package com.cards.util;

import com.cards.main.Card;
import java.util.List;
import java.util.Random;

public class CardUtils {
    public static Card getRandomCard(List<Card> deck){
        Random rand = new Random();
        int rIndex = rand.nextInt(deck.size());
        return deck.get(rIndex);
    }
}
