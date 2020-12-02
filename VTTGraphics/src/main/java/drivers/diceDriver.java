/**
 * a driver for the dice class
 */
package drivers;

import diceClassFinal.Dice;

/**
 * @author Wolfgang Borchelt
 *
 */
public class diceDriver 
{


	public static void main(String[] args) 
	{
		
		Dice oneD20 = new Dice(1, 20, 5, false);
		Dice twoD8 = new Dice(2, 8, 5, false);
		
		twoD8.addRoll(); //rolls the dice modeled by the class and adds them
		oneD20.roll(2 , 10); // rolls a set of dice unrelated to the class
		
		
		
		
		
		

	}

}
