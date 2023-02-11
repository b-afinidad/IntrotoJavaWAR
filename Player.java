package finalProjectWarGame;

import java.util.ArrayList;
import java.util.List;

public class Player {
	  
	  // Fields
	  private List<Card> hand;
	  private int score;
	  private String name;
	  
	  // Constructor
	  public Player(String name) {
	    this.hand = new ArrayList<>();
		this.name = name;
	    this.score = 0;
	  }
	  
	  // Methods
	  // Describes the player and their cards
	  public void describe() {
	    System.out.println("Player " + this.name + " has:");
	    for (Card card : hand) {
	      card.describe();
	    }
	    System.out.println(this.score);
	  }
	  
	  // Removes and returns the top card of the hand
	  public Card flip() {
		    if (hand.size() > 0) {
		      Card topCard = hand.get(0);
		      hand.remove(0);
		      return topCard;
		    }
		    return null;
		  }
	  
	  // Adds a card to the player's hand from a deck
	  public void draw(Deck deck) {
		    Card drawnCard = deck.draw();
		    if (drawnCard != null) {
		      hand.add(drawnCard);
		    }
		  }
	  
	  //adds 1 to the Player's score field
	  public void incrementScore() {
		  this.score++;
	  }

	public int getScore() {
		return this.score;
	}
}