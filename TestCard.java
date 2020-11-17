  
package drivers;

import card.*;

public class TestCard{

	public static void main(String[] args) {
		Card NewCard;
		NewCard = new Card();
		
		
		Card CardOne = new Card("Card name", "This is the description of the card");
		
		
		WeaponCard Knife = new WeaponCard(1, 4, 0, false, "Knife", "This is a Knife", 5);
		
	
		SpellCard FireBall = new SpellCard(8, 6, 0, false, "FireBall", "Shoots a FireBall", 15, "Circle");
		System.out.println(FireBall);
		
		AbilityCard Ability = new AbilityCard(1, 20, 0, false, "Ability", "Does An Ability");
		System.out.println(Ability);
	}
}
