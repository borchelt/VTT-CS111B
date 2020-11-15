package Card;

public class TestCard {

	public static void main(String[] args) {
		Card NewCard;
		NewCard = new Card();
		NewCard.getName();
		NewCard.getDesc();
		
		Card CardOne = new Card("Card Name", "This is the Description of the card");
		CardOne.getName();
		CardOne.getDesc();
		
		System.out.print(CardOne);
	}
}
