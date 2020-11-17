package Card;

public class TestCard{

	public static void main(String[] args) {
		Card NewCard;
		NewCard = new Card();
		
		
		Card CardOne = new Card("Card Name", "This is the Description of the card");
		
		
		WeaponCard Knife = new WeaponCard(1, 20, 0, false, "Knife", "This is a Knife", 5);
		
	
		SpellCard FireBall = new SpellCard(1, 20, 0, false, "FireBall", "Shoots a FireBall", 15, "Circle");
		System.out.println(FireBall.toString());
		
		AbilityCard Ability = new AbilityCard(1, 20, 0, false, "Ability", "Does An Ability");
		System.out.println(Ability);
	}
}
