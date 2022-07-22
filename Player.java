package warGame;

import java.util.ArrayList;
import java.util.List;

public class Player {
	

	//attributes:
private List<Card> hand = new ArrayList<Card>();
private int score;
private String name;


	//constructor(s):
	public Player(String name) {
		this.name = name;
		score = 0;
		//note that "hand" is not initialized by constructor. This will happen via draw method.
	}

	public void describe() {
	
	System.out.println("Player name: " + name);
	System.out.println("Player score: " + score);
	System.out.println("Player hand: ");
		for(Card card: hand) {
			card.describe();
		}
	}

	
	public void draw(Deck deck) {   //draws a card from the passed Deck (note that the Deck's draw method will remove the top card from the list after drawing)
		hand.add(deck.draw());
	}
	
	
	public Card flip() {
	
		if(!hand.isEmpty()) {
		
		Card topCard = hand.get(0);
		hand.remove(0);
		return topCard;
		}
		return new Card();
	}
	
	public void incrementScore() {
		score++;
	}

	public int getScore() {
		return score;
	}
	
	public String getName() {
		return name;
	}


}

