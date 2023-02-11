package finalProjectWarGame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
  List<Card> cards = new ArrayList<Card>();
  
  Deck() {
	  String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
	    for (int i = 2; i <= 14; i++) {
	      for (String suit : suits) {
	        String cardName = "";
	        switch (i) {
	          case 11:
	            cardName = "Jack of " + suit;
	            break;
	          case 12:
	            cardName = "Queen of " + suit;
	            break;
	          case 13:
	            cardName = "King of " + suit;
	            break;
	          case 14:
	            cardName = "A of " + suit;
	            break;
	          default:
	            cardName = i + " of " + suit;
	            break;
	        }
	        this.cards.add(new Card(i, cardName));
	      }
	    }
	  }
  
  public void shuffle() {
	    Collections.shuffle(this.cards);
	  }
	  
	  // Draw method
	  public Card draw() {
	    if (this.cards.size() > 0) {
	      Card topCard = this.cards.get(0);
	      this.cards.remove(0);
	      return topCard;
	    }
	    return null;
	  }
}