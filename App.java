/*
 * Jason Lawrence - War Game project (card game)  July 2022  (Week 6 Coding Bootcamp project)
 */

package warGame;

public class App {
	

public static void main(String args[]) {

	//Card card1 = new Card(11, "Jack of Clubs");
	
	//card1.describe();
	
	Deck myDeck = new Deck();
	
	Player player1 = new Player("Jason");
	Player player2 = new Player("Christopher");
	myDeck.shuffle();
	
	for(int i = 1; i <= 52; i++) {   //dividing deck amongst 2 players
		if(i%2 == 0) {
			player1.draw(myDeck);
		}
		else {
			player2.draw(myDeck);
		}
	}
	
	for(int i = 1; i <= 26; i++) { //gameplay
		Card player1Card = player1.flip();
		Card player2Card = player2.flip();
		
		System.out.print("Player 1's card: "); 
		player1Card.describe();
		
		System.out.print("Player 2's card: "); 
		player2Card.describe();
		
		
		if(player1Card.getValue() > player2Card.getValue()) {
			player1.incrementScore();
			System.out.println("Player 1's card is stronger.  1 Point for player 1!");
		}
		else if(player1Card.getValue() < player2Card.getValue() ) {
			player2.incrementScore();
			System.out.println("Player 2's card is stronger. 1 point for player 2!");
		}
		else {
			//draw - no points awarded
			System.out.println("Both player's cards are equal.  No points added for this flip.");
		}
	}
	
	System.out.println(player1.getName() + "'s total score is: "+ player1.getScore());
	System.out.println(player2.getName() + "'s total score is: "+ player2.getScore());
	
	
	if(player1.getScore() > player2.getScore()){
		System.out.println(player1.getName() + "(player 1) wins!");
		
	}
	else if(player1.getScore() < player2.getScore()) {
		System.out.println(player2.getName() + "(player 2) wins!");
		
	}
	else {
		System.out.println("Looks like this match was a draw. Even Scores!");
	}
	
	
	
	
	
	//System.out.println("DECK AFTER PLAYER HAND DRAWN X2");		various print statements used for testing
	//myDeck.describe();
	

	
/*	System.out.print("Drawing a card from top of deck: "); 
	myDeck.draw().describe();
	
	System.out.print("Drawing a card from top of deck: "); 
	myDeck.draw().describe();
	
	System.out.print("Drawing a card from top of deck: "); 
	myDeck.draw().describe();
	
	System.out.println("The deck after drawing a card: ");
	myDeck.describe();
	
	
	
	myDeck.shuffle();
	System.out.println("AFTER SHUFFLING:  ");
	myDeck.describe();
	
	System.out.println("DRAWING A CARD: " ); 
	myDeck.draw().describe();
	System.out.println("DRAWING A CARD: " ); 
	myDeck.draw().describe();
	
	System.out.println("AFTER DRAWING CARDS: ");
	myDeck.describe();
	
	*/
	
}


}
