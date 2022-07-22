//Class representing a single playing card (one element of a standard 52-card U.S. playing card deck).



package warGame;


public class Card {

	
private int value; // 2-14; 2-10 are face value, J, Q, K, Ace = 11, 12, 13, 14 value, respectively
private String name;  //name includes suite, e.g. queen of spades, 5 of hearts


//constructor(s):

public Card() {   //default constructor
	
}

public Card(int value, String name) {   //constructor w/ initializing arguments - value/name
	this.value = value;
	this.name = name;
}

//setters and getters:

public void setValue(int value) {
	this.value = value;
}

public int getValue() {
	return this.value;
}

public void setName(String name) {
	this.name = name;
}

public String getName() {
	return this.name;
}

//describe method

public void describe() {
	System.out.println("Card name: " + name + " Card Value: " + value);
}

}
