package card;

import java.util.ArrayList;

public class AbilityCard extends Card {

	/**
	 * the default constructor
	 */
	public AbilityCard() 
	{
		super();
		numOfDice = 1;
		numOfFaces = 20;
		bonus = 0;
		advantage = false;
	}
	
	
	
	/**
	 * the main constructor, models an ability card and any dice rolls that will go with it
	 * @param numOfDice the number of dice to roll
	 * @param numOfFaces the number of faces each die has
	 * @param bonus the bonus to each roll 
	 * @param advantage whether or not the rolls have advantage
	 * @param name the name of the ability
	 * @param desc the description of the ability
	 */
	public AbilityCard(int numOfDice, int numOfFaces, int bonus, boolean advantage, String name, String desc)
	{
		super(name, desc);
		
		if(numOfDice < 1 || numOfFaces < 1 )
			throw new IllegalArgumentException("You cant have a negative number of objects, and they have to have at least one face");

		this.numOfDice = numOfDice;
		this.numOfFaces = numOfFaces;
		this.bonus = bonus;
		this.advantage = advantage;
	}
	
	
	
	/**
	 * rolls the dice needed for the ability 
	 * @return the result of the roll(s)
	 */
	public ArrayList<Integer> getDiceRolls() 
	{
		return roll();
	}
	
	
	
	/**
	 * @return a String of the card's data
	 */
	@Override
	public String toString() 
	{
		
		if(advantage == false)
			return "\nCard: " + "\nname: " + name + "\ndescription: " + desc + "\nRolls: " + numOfDice + "d" + numOfFaces + "+" + bonus;
		else 
			return "\nCard: " + "\nname: " + name + "\ndescription: " + desc + "\nRolls: " + "(A) " + numOfDice + "d" + numOfFaces + "+" + bonus;
	}

}