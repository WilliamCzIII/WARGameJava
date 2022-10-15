package war;
import java.util.*;

public class Deck{
	
	List<Card> cards = new ArrayList<Card>();
	
	public Deck() {
		this.cards = cards;
		buildDeck(cards);
	}

	public void shuffle() {
		Collections.shuffle(cards);
	}
	
	
	public List<Card> getCards(){
		return cards;
	}
	public void setCards(List<Card> cards) {
		this.cards=cards;
	}
	

	
	public Card draw(List<Card> cards) {
		Card topCard = new Card();
		if (cards.size() == 0) {
			System.out.println("The deck is empty.");
			return null;
		} else {
			topCard= cards.get(0);
					cards.remove(0);
		return topCard;
		}
		
	}

	private List<Card> createSuit(int value, String suit){
		List<Card> suitList = new ArrayList<Card>();
		for ( int i = 0; i< 4; i++) {
			Card suitCard = new Card();
			suitCard.setValue(value);
			if ( i ==0) {
				suitCard.setName(suit + " of Clubs");
			}
			else if ( i == 1) {
				suitCard.setName(suit + " of Diamonds");
			}
			else if ( i == 2) {
				suitCard.setName(suit + " of Spades");
			}
			else {
				suitCard.setName(suit + " of Hearts");
			}
		}
		return suitList;
	}
	
	private void buildDeck(List<Card> cards) {
		for ( int i =2 ; i<=14 ; i++) {
			if ( i == 2) {
				cards.addAll(createSuit(i, "Two"));
			}
			else if( i==3) {
				cards.addAll(createSuit(i, "Three"));
			}
			else if ( i == 4) {
				cards.addAll(createSuit(i, "Four"));
			}
			else if ( i == 5) {
				cards.addAll(createSuit(i, "Five"));
			}
			else if ( i == 6) {
				cards.addAll(createSuit(i, "Six"));
			}
			else if ( i == 7) {
				cards.addAll(createSuit(i, "Seven"));
			}
			else if ( i == 8) {
				cards.addAll(createSuit(i, "Eight"));
			}
			else if ( i == 9) {
				cards.addAll(createSuit(i, "Nine"));
			}
			else if ( i == 10) {
				cards.addAll(createSuit(i, "Ten"));
			}
			else if ( i == 11) {
				cards.addAll(createSuit(i, "Jack"));
			}
			else if ( i == 12) {
				cards.addAll(createSuit(i, "Queen"));
			}
			else if ( i ==13) {
				cards.addAll(createSuit(i, "King"));
			}
			else if ( i ==14) {
				cards.addAll(createSuit(i, "Ace"));
			}
		}
	}
	

}