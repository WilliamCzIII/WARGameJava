package war;
public class App {
	
public static void main( String[] args) {
	
	
	Deck deck = new Deck(); //create new deck of cards
	Player player1 = new Player();// create players
	Player player2 = new Player();
	deck.shuffle();//shuffle deck
	
	
	for (int i = 0; i<52; i++) {//deal cards to players from the original deck
		if ( i%2 == 0) {
			player1.drawToHand(deck);
		}
		else {
			player2.drawToHand(deck);
		}
			}
		
		for ( int i = 0; i< 26; i++) {//reveal cards and compare values to each other
			Card topCard = player1.flip(player1.hand);
			System.out.println("Player1: " + topCard.getName());
			Card topCard2 = player2.flip(player2.hand);
			System.out.println("Player2: " + topCard2.getName());
			if ( topCard.getValue() > topCard2.getValue()) {//score increase for player1
				player1.incrementScore();
				System.out.println("Point to Player1!");
				System.out.println("Player1 score: " + player1.score);
				System.out.println("Player2 score: " + player2.score);
				System.out.println("");
			}
			else if ( topCard.getValue() == topCard2.getValue()) {//tie result
				System.out.println("Cards are equal in value!");
				System.out.println("Player1 score: " + player1.score);
				System.out.println("Player2 score: " + player2.score);
				System.out.println("");
			}
			else {
				player2.incrementScore();//score increase for player2
				System.out.println("Point to Player2!");
				System.out.println("Player1 score: " + player1.score);
				System.out.println("Player2 score: " + player2.score);
				System.out.println("");
			}
		}
		System.out.println("");//determining who won or lost
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
