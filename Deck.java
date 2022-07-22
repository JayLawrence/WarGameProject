package warGame;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Deck {
	
	private List<Card> cards = new ArrayList<Card>();

	public Deck() {   //constructor - instantiates a full 52-card deck
		
		for(int i = 1; i <=4; i++) {  //loop for 4 suits 
		String suit = "";
		if(i == 1) {
			suit = "hearts";
		}
		else if(i == 2) {
			suit = "spades";
		}
		else if(i == 3) {
			suit = "diamonds";
		}
		else if(i==4) {
			suit = "clubs";
		}
		
			for(int j = 2; j <= 14; j++) {   //inner loop for values 2 - Ace / 2-14)
			Card card = new Card();
			card.setValue(j);
			if(j <= 10) {
				card.setName("" + j + " of " + suit);
			}
			else if(j == 11) {
				card.setName("jack of " + suit);
			}
			else if(j== 12) {
				card.setName("queen of " + suit);
			}
			else if(j== 13) {
				card.setName("king of " + suit);
							
			}
			else if(j== 14) {
				card.setName("ace of " + suit);
			}
			cards.add(card);   //after setting the suit and the value through each iteration, add that card to the deck - the ArrayList called "cards"
			}
			
		}
	}
		


	public void describe() {   //print out whole deck (for testing purposes only, not used during game implementation)
		for(Card card: cards) {
			card.describe();
		}
	}
	
	
	public Card draw(){
	
	Card topOfDeck = new Card(cards.get(0).getValue(), cards.get(0).getName() );
	cards.remove(0);
	return topOfDeck;
		
	}
	
	public void shuffle() {
		List<Card> shuffledCards = new ArrayList<Card>();
		Random rand = new Random();
		for(int i = 0; i < 52; i++) {   //note: shuffle here is hard-coded to a 52-card deck. If used elsewhere, set deck size to a global variable value.
		
		int randCardIndex = rand.nextInt(cards.size());
		
		shuffledCards.add(cards.get(randCardIndex));
		cards.remove(randCardIndex);
		//remove cards(randCardIndex) next here --!		
		}
	cards = shuffledCards;
	}
	
}

