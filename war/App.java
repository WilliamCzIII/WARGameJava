package war;
public class App {
	
public static void main( String[] args) {
	
	
	Deck deck = new Deck();
	Player player1 = new Player();
	Player player2 = new Player();
	deck.shuffle();
	
	
	for (int i = 0; i<52; i++) {
		if ( i%2 == 0) {
			player1.drawToHand(deck);
		}
		else {
			player2.drawToHand(deck);
		}
			}
		
		for ( int i = 0; i< 26; i++) {
			Card topCard = player1.flip(player1.hand);
			System.out.println("Player1: " + topCard.getName());
			Card topCard2 = player2.flip(player2.hand);
			System.out.println("Player2: " + topCard2.getName());
			if ( topCard.getValue() > topCard2.getValue()) {
				player1.incrementScore();
				System.out.println("Point to Player1!");
				System.out.println("Player1 score: " + player1.score);
				System.out.println("Player2 score: " + player2.score);
				System.out.println("");
			}
			else if ( topCard.getValue() == topCard2.getValue()) {
				System.out.println("Cards are equal in value!");
				System.out.println("Player1 score: " + player1.score);
				System.out.println("Player2 score: " + player2.score);
				System.out.println("");
			}
			else {
				player2.incrementScore();
				System.out.println("Point to Player2!");
				System.out.println("Player1 score: " + player1.score);
				System.out.println("Player2 score: " + player2.score);
				System.out.println("");
			}
		}
		System.out.println("");
		if ( player1.score > player2.score) {
			System.out.println("Player1 score: " + player1.score);
			System.out.println("Player2 score: " + player2.score);
			System.out.println("Winner: Player1 with a score of " + player1.score +"!!!" );
		}
		else if ( player1.score < player2.score) {
			System.out.println("Player1 score: " + player1.score);
			System.out.println("Player2 score: " + player2.score);
			System.out.println("Winner: Player2 with a score of " + player2.score + "!!!");
		}
		else {
			System.out.println("Player1 score: " + player1.score);
			System.out.println("Player2 score: " + player2.score);
			System.out.println("The game has ended in a draw.");
		}
		
	
		
	}
	

}
