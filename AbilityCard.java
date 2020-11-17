package Card;

import java.util.ArrayList;

public class AbilityCard extends Card {

	public AbilityCard(int numOfDice, int numOfFaces, int bonus, boolean advantage, String Name, String Desc){
		
	}
	public ArrayList<Integer> getDiceRolls() {
		return Roll();
	}
	
	public String toString() {
		return(super.toString() + "\nRolls: " + getDiceRolls());
	}

}
