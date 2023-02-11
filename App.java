package finalProjectWarGame;

public class App {
	public static void main(String[] args) {
        // Instantiate a Deck and two Players
        Deck deck = new Deck();
        Player player1 = new Player("Player 1");
        Player player2 = new Player("Player 2");

        // Shuffle the deck
        deck.shuffle();
        
        System.out.println("Card Game: War\n");

        // Draw cards from the deck for each player
        for (int i = 0; i < 52; i++) {  
        	player1.draw(deck);
        	i++;
            player2.draw(deck);
            
            // Compare the cards flipped by each player
                
            Card card1 = player1.flip();           
            Card card2 = player2.flip();
                
                System.out.print("Player 1 has ");
                card1.describe();
                
                System.out.print("Player 2 has ");
                card2.describe();
                
                int cardone = card1.getValue();
                int cardtwo	= card2.getValue();	
                
                System.out.println("----------------------------");
                         
                if (cardone > cardtwo) {
                    System.out.println("Player 1 wins");
                } else if (cardtwo > cardone) {
                    System.out.println("Player 2 wins");
                } else {
                    System.out.println("It's a draw with both players having " + cardone);
                }
                
                if (card1.getValue() > card2.getValue()) {
                    player1.incrementScore();
                } else if (card2.getValue() > card1.getValue()) {
                    player2.incrementScore();
                }
            	
                int score1 = player1.getScore();
                int score2 = player2.getScore();

                if (score1 > score2) {
                    System.out.println("Player 1 is winning " + score1 + " to " + score2);
                } else if (score2 > score1) {
                    System.out.println("Player 2 is winning " + score2 + " to " + score1);
                } else {
                    System.out.println("It's a draw with both players having " + score1);
                }
                
                System.out.println("====================================================");
                System.out.println();
                
        }
           
        System.out.println("{{{{FINAL SCORE}}}}");
        
        	int score1 = player1.getScore();
           int score2 = player2.getScore();
        	System.out.println("    Player 1: " + score1);
            System.out.println("    Player 2: " + score2);
           
            System.out.print("The Winner is ");
            
            if (score1 > score2) {
            	System.out.println("Player 1!");
            } else if (score2 > score1) {
            	System.out.println("Player 2!");
            } else {
            System.out.println("It's a draw, there are no winners ='( " + score1);
            }
        
    }
}
