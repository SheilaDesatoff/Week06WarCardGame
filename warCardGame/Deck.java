package warCardGame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	
List<Card> cards = new ArrayList<Card>(); //hold all 52 cards in the deck


Deck () { //constructor
String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"}; //array list of suits
String[] numbers = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"}; //array list of values
	
	for (String suit : suits) { 
		int count = 2;
		for (String number : numbers) { //starts at the count of 2 through 14
			Card card = new Card (number, suit, count); //instantiate a new card for each new card
			this.cards.add(card);
			count++;
			
		}
	}
}
//getters and setters
public List<Card> getCards() {
	return cards;
}

public void setCards(List<Card> cards) {
	this.cards = cards;
}

//shuffles the deck
public void shuffle () { 
	Collections.shuffle(this.cards);
	}

//draw a card and remove index 0
public Card draw() { 
	return cards.remove(0); 
}

public void describe() {
	for (Card card : this.cards) {
		card.describe(); 

		}
	}
}
