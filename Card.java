package Card;
/**
* Card Class
* Class that creates/holds the data for cards
* Still a W.I.P - Need more info about the cards specifics 
* @since   2020-11-15 
*/
public class Card extends Dice{
	private String Name;
	private String Desc;
	/**
    constructors
    @param Name = The Name of the card
    @param Desc  = The Description of the card
*/
	public Card() {
		Name = "Name";
		Desc = "Description";
	}
	public Card(String Name, String Desc) {
		this.Name = Name;
		this.Desc = Desc;
	} // End of constructors
	
	/**
    Setters for storing The Name and Description
    @param a is the value being stored in Name.
    @param a is the value being stored in Description.
 */
	public void setName(String a) {
		a = Name;
	}
	
	public void setDesc(String a) {
		a = Desc;
	} // End of Setters
	
	/**
    Getters for returning the Note's Name and Description
    @return the value in the Name field
    @return the value in the Desc field
 */
	public String getName() {
		return Name;
	}
	
	public String getDesc() {
		return Desc;
	} //End of Getters
	
	/**
    toString method
    @return Print method listing The card's details
 */
	public String toString() {
		return ("Card: " + "\nName: " + Name + "\nDescription: " + Desc);
	}
}
