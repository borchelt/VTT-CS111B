/**
 * models a character skill
 */
package skill;
import diceClassFinal.*;
/**
 * @author Wolfgang Borchelt
 *
 */
public class Skill 
{
	String name;
	int statBonus;
	int miscBonus;
	boolean isProf;
	boolean hasExp;

	/**
	 * default constructor
	 */
	public Skill() 
	{
		name = "Stealth";
		statBonus = 0;
		isProf = false;
		hasExp = false;
	}
	
	
	/**
	 * main constructor
	 * @param statBonus the bonus from whatever stat the skill uses
	 * @param isProf whether or not the character is proficient in that skill 
	 * @param hasExp whether or not the character has expertise in that skill 
	 */
	public Skill(String name, int statBonus, boolean isProf, boolean hasExp)
	{
		this.name = name;
		this.statBonus = statBonus;
		this.isProf = isProf;
		this.hasExp = hasExp;
		
	}
	
	
	
	//GETTERS/SETTERS
	
	
	/**
	 * @return the statBonus
	 */
	public int getStatBonus() 
	{
		return statBonus;
	}

	/**
	 * @return the miscBonus
	 */
	public int getMiscBonus()
	{
		return miscBonus;
	}

	/**
	 * @return the isProf
	 */
	public boolean isProf() 
	{
		return isProf;
	}


	/**
	 * @return the hasExp
	 */
	public boolean hasExp() 
	{
		return hasExp;
	}


	/**
	 * @param statBonus the statBonus to set
	 */
	public void setStatBonus(int statBonus) 
	{
		this.statBonus = statBonus;
	}

	
	/**
	 * @param  miscBonus the miscBonus to set
	 */
	public void setMiscBonus(int miscBonus)
	{
		this.miscBonus = miscBonus;
	}


	/**
	 * @param isProf the isProf to set
	 */
	public void setProf(boolean isProf) 
	{
		this.isProf = isProf;
	}


	/**
	 * @param hasExp the hasExp to set
	 */
	public void setHasExp(boolean hasExp) 
	{
		this.hasExp = hasExp;
	}

	
	
	//OTHER METHODS

	
	public int getBonus()
	{
		int skillBonus = statBonus;
		
		if(isProf)
		{
			skillBonus += 2;
			
			if(hasExp)
				skillBonus += 2;
		}
		
		return skillBonus + miscBonus;
		
	}
	
	
	@Override
	public String toString()
	{
		return name + ": " + this.getBonus(); 
		
	}
	
	public int skillCheck(boolean advantage)
	{
		Dice check = new Dice(1, 20, this.getBonus(), advantage);
		return check.roll().get(0);
		
	}

}
