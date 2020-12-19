package card;


public class WeaponCard extends Card{
	protected int Range;
	
	/**
	 * the default constructor
	 */
	public WeaponCard() 
	{
		super();
		Range = 0;
		numOfDice = 1;
		numOfFaces = 8;
		bonus = 0;
		advantage = false;
	}
	
	
	/**
	 * The main constructor
	 * @param numOfDice the number of dice to roll
	 * @param numOfFaces the number of faces each die has
	 * @param bonus the bonus to each roll 
	 * @param advantage whether or not the rolls have advantage
	 * @param name the name of the ability
	 * @param desc the description of the ability
	 * @param Range the range of the attack
	 */
	public WeaponCard(int numOfDice, int numOfFaces, int bonus, boolean advantage, String name, String desc, int Range)
	{
		super(name, desc);
		this.Range = Range;
		this.numOfDice = numOfDice;
		this.numOfFaces = numOfFaces;
		this.bonus = bonus;
		this.advantage = advantage;
	}
	
	
	/**
	 * sets the range of the weapon
	 * @param a the new range
	 */
	public void setRange(int a) 
	{
		a = Range;
	}

	
	/**
	 * @return the range of the weapon
	 */
	public int getRange() 
	{
		return Range;
	}
	
	
	/**
	 * rolls the damage of the weapon
	 * @return the damage of the weapon
	 */
	public int getDamage() 
	{
            return addRoll();
	}
	
	
	/**
	 * @return a String of the card's data
	 */
	@Override
	public String toString() 
	{	
		if(advantage == false)
			return "Card: " + "\nname: " + name + "\ndescription: " + desc +  "\nRange: " + Range +
					"\nDamage Dice: " + numOfDice + "d" + numOfFaces + "+" + bonus+ "\n~~~~~~~~~~~~\n\n";
		else 
			return "Card: " + "\nname: " + name + "\ndescription: " + desc +  "\nRange: " + Range +
					"\nDamage Dice: " + "(A) " + numOfDice + "d" + numOfFaces + "+" + bonus+ "\n~~~~~~~~~~~~\n\n";
				
	}
	
}