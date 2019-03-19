package com.cards.main;

/******************************************************************************
 *  Runner.java
 *  Runner with the Deck of Cards
 *  Compilation:  javac Runner.java
 *  Execution:    java Runner
 *
 * This class calls various methods in the class Deck
 ******************************************************************************/


public class Runner {
    public static void main ( String [] arguments )
    {
        IDeck c = new Deck();
//        Card currentCard = c.dealOneCard();
//        System.out.println(currentCard.toString());
        c.dealAllCards();
    }
}