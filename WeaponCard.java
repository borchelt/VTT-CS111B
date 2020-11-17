package Card;

import java.util.ArrayList;

public class WeaponCard extends Card{
	private int Range;
	public WeaponCard() {
		Range = 0;
	}
	
	public WeaponCard(int numOfDice, int numOfFaces, int bonus, boolean advantage, String Name, String Desc, int Range) {
		this.Range = Range;
	}
	
	public void setRange(int a) {
		a = Range;
	}

	public int getRange() {
		return Range;
	}
	
	
	public ArrayList<Integer> getDamage() {
		return Roll();
	}
	
	public String toString() {
		return(super.toString() +  "\nRange: " + Range + "\nDamage: " + getDamage());
				
	}
	
}
