package warCardGame;

public class Card {

private int value; 	//card field value 2-14
private String suit; //card name Diamonds, Hearts, Spades, Clubs
private String name; 

public Card(String name, String suit, int value) {//card constructor 
	this.name = name;
	this.suit = suit;
	this.value = value;
}

public void describe() { //describe method value + name
	System.out.println(this.name + " of " + this.suit + " -- value of " + this.value);
}
//Getters and setters
public int getValue() {
	return value;
}

public void setValue(int value) {
	this.value = value;
}

public String getSuit() {
	return suit;
}

public void setSuit(String suit) {
	this.suit = suit;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

	
}
