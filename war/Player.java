package war;
import java.util.*;
public class Player {
	
	 List<Card> hand = new ArrayList<Card>();
	 int score;
	 String name;
	
	 public Player() {
		 this.score = 0;
		 this.name= name;
		 this.hand= null;
	 }
	 
	 public int getScore() {
		 return score;
	 }
	 
	 public void setScore() {
		 this.score = score;
	 }
	 
	 public String getName() {
		 return name;
	 }
	 
	 public void setName() {
		 this.name = name;
	 }
	 
	 public List<Card> getHand(){
		 return hand;
	 }
	 
	 public void setHand() {
		 this.hand = hand;
	 }
	 
	 
	public void describe() {
		System.out.println(name + ": ");
		for ( Card card : hand) {
			System.out.println("card");
			card.describe();
		}
	}
	
	public Card flip(List<Card> hand) {
		Card topCard = new Card();
		topCard= hand.get(0);
		hand.remove(0);
		return topCard;
	}
	
	public void drawToHand(Deck deck ){
		Card card = new Card();
		if ( card = deck.draw(deck.cards)  != null) {
			hand.add(card);
		}
		else {
			System.out.println("The deck is empty.");
		}
	}
	
	public void incrementScore() {
		this.score = score+1;
	}

}
