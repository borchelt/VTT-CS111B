package Card;

public class SpellCard extends WeaponCard {
	private String AOE;
	
	public SpellCard() {
		AOE = "Circle";
	}
	public SpellCard(int numOfDice, int numOfFaces, int bonus, boolean advantage, String Name, String Desc, int Range, String AOE) {
		this.AOE = AOE;
	}
	
	public void setAOE(String a) {
		a = AOE;
	}
	
	public String getAOE() {
		return AOE;
	}
	
	public String toString() {
		return(super.toString() +  "\nArea of Effect: " + AOE);
				
	}
}
