/**
 * Models an attack or other action being done by a character
 */
package event;
import java.util.*;
import characterFinal.Character;
/**
 * @author Wolfgang Borchelt
 *
 */
public class Event 
{
	Character agressor;
	ArrayList<Character> targets = new ArrayList<Character>();
	String actionDesc;
	int damage;
	
	public Event() 
	{
		agressor = new Character();
		agressor.setName("nobody");
		targets.add(agressor);
		actionDesc = "does nothing to";
		damage = 0;
	}

	/**
	 * the main constructor
	 * @param agressor the one doing the action
	 * @param targets the people being affected
	 * @param actionDesc the action being described
	 * @param damage the damage done to each target, can be negative for healing
	 */
	public Event(Character agressor, ArrayList<Character> targets, String actionDesc, int damage) 
	{
		this.agressor = agressor;
		this.targets = targets;
		this.actionDesc = actionDesc;
		this.damage = damage;
	}

	//GETTERS/SETTERS
	
	
	/**
	 * @return the agressor
	 */
	public Character getAgressor() 
	{
		return agressor;
	}

	/**
	 * @return the targets
	 */
	public ArrayList<Character> getTargets() 
	{
		return targets;
	}

	/**
	 * @return the actionDesc
	 */
	public String getActionDesc() 
	{
		return actionDesc;
	}

	/**
	 * @return the damage
	 */
	public int getDamage() 
	{
		return damage;
	}

	/**
	 * @param agressor the agressor to set
	 */
	public void setAgressor(Character agressor) 
	{
		this.agressor = agressor;
	}

	/**
	 * @param targets the targets to set
	 */
	public void setTargets(ArrayList<Character> targets) 
	{
		this.targets = targets;
	}

	/**
	 * @param actionDesc the actionDesc to set
	 */
	public void setActionDesc(String actionDesc) 
	{
		this.actionDesc = actionDesc;
	}

	/**
	 * @param damage the damage to set
	 */
	public void setDamage(int damage) 
	{
		this.damage = damage;
	}
	
	/**
	 * a basic toString
	 * @return the description of the event
	 */
	@Override
	public String toString()
	{
		ArrayList<String> targetList = new ArrayList<String>(); 
		for(Character target : targets)
			targetList.add(target.getName());
		if(damage == 0)
			return(agressor.getName() + actionDesc + targetList );
		else 
			return(agressor.getName() + actionDesc + targetList + ", dealing " + damage + " damage!");
	}
	
	
	/**
	 * deals the damage of the event to each target
	 */
	public void dealDamage()
	{
		for(Character target : targets)
			target.setHealth(target.getHealth() + damage*-1);
	}
	
	/**
	 * combines the last two methods
	 * @return the toString return
	 */
	public String resolve()
	{
		this.dealDamage();
		return this.toString();
	}
	
	
	
	
	
	

}
