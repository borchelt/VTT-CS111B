package card;

public class SpellCard extends WeaponCard {
	
	
	private String AOE;
	
	
	/**
	 * the default constructor
	 */
	public SpellCard() 
	{
		super();
		AOE = "Circle";
		Range = 60;
		numOfDice = 8;
		numOfFaces = 6;
		bonus = 0;
		advantage = false;
	}
	
	
	/**
	 * the main constructor
	 * @param numOfDice the number of dice to roll
	 * @param numOfFaces the number of faces each die has
	 * @param bonus the bonus to each roll 
	 * @param advantage whether or not the rolls have advantage
	 * @param name the name of the ability
	 * @param desc the description of the ability
	 * @param Range the range of the attack
	 * @param AOE the shape of the spells area of effect
	 */
	public SpellCard(int numOfDice, int numOfFaces, int bonus, boolean advantage, String name, String desc, int Range, String AOE) 
	{
		super(numOfDice, numOfFaces, bonus, advantage, name, desc, Range);
		this.AOE = AOE;
	}
	
	
	/**
	 * sets a new shape for the spell
	 * @param a the new shape
	 */
	public void setAOE(String a) 
	{
		a = AOE;
	}
	
	/**
	 * gets the shape of the spell
	 * @return the shape of the spell
	 */
	public String getAOE() 
	{
		return AOE;
	}
	
	
	/**
	 * @return a String of the card's data
	 */
	@Override
	public String toString() {		
		if(advantage == false)
			return "Card: " + "\nname: " + name + "\ndescription: " + desc +  "\nRange: " + Range + "\nDamage Dice: " + 
					numOfDice + "d" + numOfFaces + "+" + bonus + "\nArea of Effect: " + AOE+ "\n~~~~~~~~~~~~\n\n";
		else 
			return "Card: " + "\nname: " + name + "\ndescription: " + desc +  "\nRange: " + Range + "\nDamage Dice: " +
					"(A)" + numOfDice + "d" + numOfFaces + "+" + bonus + "\nArea of Effect: " + AOE+ "\n~~~~~~~~~~~~\n\n";
				
	}
}