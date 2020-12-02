package card;

import diceClassFinal.Dice;

/**
* Card Class
* Class that creates/holds the data for cards
* Still a W.I.P - Need more info about the cards specifics 
* @since   2020-11-15 
*/
public class Card extends Dice
{
	protected String name;
	protected String desc;
	
	
	/**
    constructors
    @param name = The name of the card
    @param desc  = The description of the card
	 */
	public Card()
	{
		super();
		name = "name";
		desc = "description";
	}
	
	
	public Card(String name, String desc) 
	{
		this.name = name;
		this.desc = desc;
	} 
	
	
	// End of constructors
	
	
	/**
    Setters for storing The name and description
    @param a is the value being stored in name.
    @param a is the value being stored in description.
	 */
	public void setname(String a) 
	{
		a = name;
	}
	
	
	public void setdesc(String a) 
	{
		a = desc;
	} 
	
	
	
	// End of Setters
	
	
	
	/**
    Getters for returning the Note's name and description
    @return the value in the name field
    @return the value in the desc field
	 */
	public String getname() 
	{
		return name;
	}
	
	public String getdesc() 
	{
		return desc;
	} 
	
	
	
	//End of Getters
	
	
	
	/**
    toString method
    @return Print method listing The card's details
	 */
	@Override
	public String toString() 
	{
		return ("\nCard: " + "\nname: " + name + "\ndescription: " + desc);
	}
}