package warCardGame;

import java.util.ArrayList;
import java.util.List;

public class Player {

List<Card> handList = new ArrayList<Card>(); //players hand, list of cards, new list of cards called handList is ArrayList of card
 int score; //players score
 String name; //players name 
 int value; 

public Player(String name, int score) {
	this.name = name;
	this.score = 0;
}

//Methods


//describe - prints out information about the player and calls the describe method or each card in the hand list
public void describePlayer(String name, int score) {
		this.name = name;
		this.score = score;
		this.value = value;
		System.out.println("Player: " + name + "has score of " + score + " " + value);
}

//flip - removes and returns the tip card of the handList index0
	public Card flip() {
		Card topCard = handList.get(0);
		handList.remove(0);
		return topCard;
}
	
//draw - takes a deck as an argument and calls the draw method on the deck, adding the returned card to the hand field
public void draw (Deck deck) {
	Card card = deck.draw();
	handList.add(card);
}

//incrementScore - adds 1 to the player's score, each card is worth 1 point, get high card add 1 point
public void incrementScore() {
	this.score++;
}

public int getScore() {
	return score;

}
//getters and setters
	public List<Card> getHandList() {
		return handList;
	}

	public void setHandList(List<Card> handList) {
		this.handList = handList;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public void setScore(int score) {
		this.score = score;


}

}

