import java.util.ArrayList;

public class Player {
	private ArrayList<Card> onHand = new ArrayList<Card>();
	private int totalpoint = 0;
	private int currentCard = 0;
	private DeckOfCards myDeckOfCards ;
	private boolean softCard = true;
	private boolean bust = false;
	public Player(DeckOfCards myDeckOfCards) {
		this.myDeckOfCards = myDeckOfCards;
		Card card = myDeckOfCards.dealCard();
		onHand.add(card);
		totalpoint += Rule.getPointOfCard(card.getFace());
		//totalpoint += Rule.getePointOfCard(card.geteFace());
	}
	
	public int getTotalPoint() {
		return totalpoint;
	}
	
	public Card getOnHand(){
		return onHand.get(currentCard++);
	}
	
	public boolean getBust() {
		return bust;
	}
	
	public void addCard() {
		Card card = myDeckOfCards.dealCard();
		onHand.add(card);
		totalpoint += Rule.getPointOfCard(card.getFace());
		//totalpoint += Rule.getePointOfCard(card.geteFace());
		if(totalpoint>=21)
			checkBust();
	}
	
	public void checkBust() {
		for(int i = 0; i < onHand.size(); i++) {
			if(onHand.get(i).getFace().equalsIgnoreCase("Ace")&&softCard) {
				totalpoint-=10;
				softCard = false;
				return;
			}
		}
		bust = true;
		System.out.println("bust");

	}
	
	/*public void checkBust() {
		for(int i = 0; i < onHand.size(); i++) {
			if(onHand.get(i).geteFace()==Rule.efaces.Ace&&softCard) {
				totalpoint-=10;
				softCard = false;
				return;
			}
		}
		bust = true;
		System.out.println("bust");

	}*/
    
	public boolean checkBlackjack() {
		if(onHand.size()==2)
			return true;
		else
			return false;
	}
	
	public String toString(){
		String cardOnHand = "";
        for(int i=0;i<onHand.size();i++){
            cardOnHand += (i+1)+". " + onHand.get(i).toString()+"\n";
        }
        return cardOnHand;

    }
}