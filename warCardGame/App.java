package warCardGame;

public class App {

//main method 
public static void main(String[] args) {

//Instantiating player 1 and 2
Player player1 = new Player ("Gordon", 0);
Player player2 = new Player ("Sam", 0);

//deck of 52 cards described and shuffled 
Deck shuffleDeck = new Deck();

//shuffleDeck.describe(); //prints out shuffled deck
shuffleDeck.shuffle();

System.out.println("----------------------Shuffled Deck----------------------");

//deal 26 cards to each player using a traditional loop and call the flip method for each player
//print out where each list shows for each player


for (int i = 0; i < 26; i++) { //0 index, i less than 26, increment 
	player1.handList.add(shuffleDeck.draw());
	player2.handList.add(shuffleDeck.draw());
}


for (int i = 0; i < 26; i++) {
	player1.handList.get(i).describe();
	player2.handList.get(i).describe();
}
System.out.println();
System.out.println("---------------------War-------------------");
for (int i = 0; i < 26; i++) {
	Card player1card = player1.flip(); //flip the card over
	Card player2card = player2.flip(); 
	System.out.print(player1.name + "'s card is: " );
	player1card.describe();
	System.out.print(player2.name + "'s card is: " );
	player2card.describe();

//compare the value for each card and call incrementScore method on the player who has the high value
//Print a message to say which player got the point "Gordon wins 1 point" if tie print "no point awarded"

if (player1card.getValue() > player2card.getValue()) {
    player1.incrementScore();
    System.out.println(player1.name + " wins 1 point");
    
} else if (player2card.getValue() > player1card.getValue()) {
    player2.incrementScore();
    System.out.println(player2.name + " wins 1 point");
} else {
    System.out.println("Tie - no points awarded"); // cards drawn were of the same value
}
System.out.println(player1.name + "'s score is " + player1.getScore());
System.out.println(player2.name + "'s Score is " + player2.getScore());
System.out.println();
}

//after loop compare the final scores of the players
//print the final score of each player and print if player 1 or 2 won and the score
System.out.println("----------------------Final Score----------------------");
System.out.println(player1.name + "'s final score: " + player1.getScore());
System.out.println(player2.name + "'s final score: " + player2.getScore());
if (player1.getScore() > player2.getScore()) {
    System.out.println(player1.name + " wins!");
} else if (player2.getScore() > player1.getScore()) {
    System.out.println(player2.name + " wins!");
} else {
    System.out.println("Game is a tie"); // cards drawn were of the same value
}

System.out.println("----------------------Game Over----------------------");


	}

}


























