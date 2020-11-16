/**
 * A class that models dice of any number of sides
 */
package diceClassFinal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * @author Wolfgang Borchelt
 *
 */
public class Dice 
{

	int numOfDice;
	int numOfFaces;
	int bonus;
	boolean advantage;
	
	
	
	
	/**
	 * default constructor, models a single 20 sided die
	 */
	public Dice() 
	{
		numOfDice = 1;
		numOfFaces = 20;
		bonus = 0;
		advantage = false;
	}
	
	/**
	 * models a x dice with y amount of faces and a bonus of z
	 * @param numOfFaces the high bound of the die roll
	 * @param numOfDice the amount of dice to roll
	 * @param bonus the amount to add to the roll
	 * @param advantage if advantage is true, 2 dice are rolled and the higher result is taken
	 */
	public Dice(int numOfDice, int numOfFaces, int bonus, boolean advantage)
	{
		if(numOfDice < 1 || numOfFaces < 1 )
			throw new IllegalArgumentException("You cant have a negative number of objects, and they have to have at least one face");

		this.numOfDice = numOfDice;
		this.numOfFaces = numOfFaces;
		this.bonus = bonus;
		this.advantage = advantage;
	}
	
	
	
	//GETTERS 
	
	
	
	/**
	 * @return the number of dice represented by this class
	 */
	public int getNumOfDice() 
	{
		return numOfDice;
	}

	/**
	 * @return the number of faces represented by this class
	 */
	public int getNumOfFaces() 
	{
		return numOfFaces;
	}

	/**
	 * @return the bonus to add to the roll
	 */
	public int getBonus() 
	{
		return bonus;
	}

	/**
	 * @return whether or not the dice should be rolled with advantage
	 */
	public boolean hasAdvantage() 
	{
		return advantage;
	}

	
	
	//SETTERS 
	
	
	
	/**
	 * @param numOfDice sets the new number of dice to roll
	 */
	public void setNumOfDice(int numOfDice) 
	{
		this.numOfDice = numOfDice;
	}

	/**
	 * @param numOfFaces sets the new number of faces the dice have
	 */
	public void setNumOfFaces(int numOfFaces) 
	{
		this.numOfFaces = numOfFaces;
	}

	/**
	 * @param bonus sets the new bonus to the roll 
	 */
	public void setBonus(int bonus) 
	{
		this.bonus = bonus;
	}

	/**
	 * @param advantage toggles advantage
	 */
	public void setAdvantage(boolean advantage) 
	{
		this.advantage = advantage;
	}
	
	
	/**
	 * rolls the dice modeled by the class
	 * @return an array of different results from rolling the dice
	 */
	public ArrayList<Integer> Roll()
	{
		Random dice = new Random();
		
		ArrayList<Integer> rolls = new ArrayList<Integer>();
		
		if(advantage == false)
		{
			for(int i = 0; i < numOfDice; i++)
				rolls.add(dice.nextInt((numOfFaces)) +1 + bonus);
		}
		
		
		else
		{
			for(int i = 0; i < numOfDice; i++)
			{
				ArrayList<Integer> possibleRolls = new ArrayList<Integer>();
				possibleRolls.add(dice.nextInt((numOfFaces -1)) +1 + bonus);
				possibleRolls.add(dice.nextInt((numOfFaces -1)) +1 + bonus);
				Collections.sort(possibleRolls);
				rolls.add(possibleRolls.get(1));
			}
		}
		
		return rolls;
		
		
	}
	
	
	
	/**
	 * rolls the current modeled dice, then returns the result of adding them with a bonus
	 * @return
	 */
	public int AddRoll()
	{
		Random dice = new Random();
		
		int total = 0;
		
		if(advantage == false)
		{
			for(int i = 0; i < numOfDice; i++)
				total += dice.nextInt((numOfFaces)) +1;
		}
		
		
		else
		{
			for(int i = 0; i < numOfDice; i++)
			{
				ArrayList<Integer> possibleRolls = new ArrayList<Integer>();
				possibleRolls.add(dice.nextInt((numOfFaces -1)) +1);
				possibleRolls.add(dice.nextInt((numOfFaces -1)) +1);
				Collections.sort(possibleRolls);
				total += possibleRolls.get(1);
			}
		}
		
		return total + bonus;
	}
	
	
	
	
	
	//These methods work regardless of the other dice variables, and are they same for every instance
	
	

	/**
	 * models rolling a die with x amount of faces using the Random Class
	 * @param numOfFaces the high bound of the die roll
	 * @return a random number from 1 to the number of faces on the die.
	 */
	public int Roll(int numOfFaces)
	{
		Random dice = new Random();
		
		//because Random includes 0 and dice don't, add 1 to the result, this dosen't change the upper limit because it is originally exclusive
		return dice.nextInt((numOfFaces)) +1; 
		
		
	}
	
	
	
	/**
	 * models rolling x dice with y amount of faces using the Random Class
	 * @param numOfFaces the high bound of the die roll
	 * @param numOfDice the amount of dice to roll
	 * @return an ArrayList of the outcomes of each roll
	 */
	public ArrayList<Integer> Roll(int numOfDice, int numOfFaces)
	{
		Random dice = new Random();
		ArrayList<Integer> rolls = new ArrayList<Integer>();
		for(int i = 0; i < numOfDice; i++)
			rolls.add(dice.nextInt((numOfFaces)) +1);
		
		return rolls;
			
		
	}
	
	
	
	/**
	 * models rolling x dice with y amount of faces and a bonus of z using the Random Class
	 * @param numOfFaces the high bound of the die roll
	 * @param numOfDice the amount of dice to roll
	 * @param bonus the amount to add to the roll
	 * @param advantage if advantage is true, 2 dice are rolled and the higher result is taken
	 * @return an ArrayList of the outcomes of each roll
	 */
	public ArrayList<Integer> Roll(int numOfDice, int numOfFaces, int bonus, boolean advantage)
	{
		Random dice = new Random();
		
		ArrayList<Integer> rolls = new ArrayList<Integer>();
		
		if(advantage == false)
		{
			for(int i = 0; i < numOfDice; i++)
				rolls.add(dice.nextInt((numOfFaces)) +1 + bonus);
		}
		
		
		else
		{
			for(int i = 0; i < numOfDice; i++)
			{
				ArrayList<Integer> possibleRolls = new ArrayList<Integer>();
				possibleRolls.add(dice.nextInt((numOfFaces -1)) +1 + bonus);
				possibleRolls.add(dice.nextInt((numOfFaces -1)) +1 + bonus);
				Collections.sort(possibleRolls);
				rolls.add(possibleRolls.get(1));
			}
		}
		
		return rolls;
	}
	
	
	
	
	/**
	 * models rolling x dice with y amount of faces, adding them all up, then adding a bonus of z
	 * @param numOfFaces the high bound of the die roll
	 * @param numOfDice the amount of dice to roll
	 * @param bonus the amount to add to the roll
	 * @param advantage if advantage is true, 2 dice are rolled and the higher result is taken
	 * @return an ArrayList of the outcomes of each roll
	 */
	public int AddRoll(int numOfDice, int numOfFaces, int bonus, boolean advantage)
	{
		Random dice = new Random();
		
		int total = 0;
		
		if(advantage == false)
		{
			for(int i = 0; i < numOfDice; i++)
				total += dice.nextInt((numOfFaces)) +1;
		}
		
		
		else
		{
			for(int i = 0; i < numOfDice; i++)
			{
				ArrayList<Integer> possibleRolls = new ArrayList<Integer>();
				possibleRolls.add(dice.nextInt((numOfFaces -1)) +1);
				possibleRolls.add(dice.nextInt((numOfFaces -1)) +1);
				Collections.sort(possibleRolls);
				total += possibleRolls.get(1);
			}
		}
		
		return total + bonus;
	}

	/**
	 * returns the dice class as a string in the form of numOfDiceDnumOfFaces+bonus if the roll has advantage, there will be (A) at the start of it.
	 */
	@Override
	public String toString() 
	{
		if(advantage == false)
			return numOfDice + "d" + numOfFaces + "+" + bonus;
		else 
			return "(A) " + numOfDice + "d" + numOfFaces + "+" + bonus;
	}
	
	
	
}
