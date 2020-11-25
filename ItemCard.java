/**
 * models an item
 */
package card;
import java.util.HashMap;
import characterFinal.Character;
import skill.*;
/**
 * @author Wolfgang Borchelt
 *
 */
public class ItemCard extends Card {
	// a hash map of stat names and what to add to them
	//for example. to make a card that increases the character's max health by 5 , add ["maxHealth", 5], ["health", 5]
	//then use addBuffs(Character holder) to apply them to the character that is passed to the card
	HashMap<String, Integer> manipulationMap;
	
	public ItemCard() 
	{
		name = "Generic Item";
		desc = "A generic item";
		manipulationMap.put("stealth", 0);
	}

	/**
	 * @param name
	 * @param desc
	 */
	public ItemCard(String name, String desc, HashMap<String, Integer> manipulationMap) 
	{
		super(name, desc);
		this.manipulationMap = manipulationMap;
	}
	
	//SETTERS/GETTERS
	
	/**
	 * @return the manipulationMap
	 */
	public HashMap<String, Integer> getManipulationMap() {
		return manipulationMap;
	}

	/**
	 * @param manipulationMap the manipulationMap to set
	 */
	public void setManipulationMap(HashMap<String, Integer> manipulationMap) {
		this.manipulationMap = manipulationMap;
	}

	/**
	 * applies any buffs from the manipulationMap using for each and switch
	 * @param holder
	 */
	public void addBuffs(Character holder)
	{
		manipulationMap.forEach((k, v) -> {
		Skill tempSkill;	
		switch (k) 
		{
		
			case "level":
				holder.setLevel(holder.getLevel() + v);
				break;
			
			case "str":
				holder.setStr(holder.getStr() + v);
				break;
			
			
			case "dex":
				holder.setDex(holder.getDex() + v);
				break;
			
			
			case "con":
				holder.setCon(holder.getCon() + v);
				break;
			
			
			case "intel":
				holder.setIntel(holder.getIntel() + v);
				break;
			
			
			case "wis":
				holder.setWis(holder.getWis() + v);
				break;
			
			
			case "cha":
				holder.setCha(holder.getCha() + v);
				break;
			
			
			case "prof":
				holder.setProf(holder.getProf() + v);
				break;
			
			
			case "speed":
				holder.setSpeed(holder.getSpeed() + v);
				break;
			
			
			case "maxHealth":
				holder.setMaxHealth(holder.getMaxHealth() + v);
				break;
			
			
			case "health":
				holder.setHealth(holder.getHealth() + v);
				break;
			
			
			case "tempHealth":
				holder.setTempHealth(holder.getTempHealth() + v);
				break;
			
			
			case "AC":
				holder.setAC(holder.getAC() + v);
				break;
			
			
			case "inti":
				holder.setInti(holder.getInti() + v);
				break;
			
			
			case "gold":
				holder.setGold(holder.getGold() + v);
				break;
			
			
			case "acrobatics":
				tempSkill = holder.getAcrobatics();
				tempSkill.setMiscBonus(v);
				holder.setAcrobatics(tempSkill);
				break;
			
			
			case "animalHandling":
				tempSkill = holder.getAnimalHandling();
				tempSkill.setMiscBonus(v);
				holder.setAnimalHandling(tempSkill);
				break;
				
			case "arcana":
				tempSkill = holder.getArcana();
				tempSkill.setMiscBonus(v);
				holder.setArcana(tempSkill);
				break;
			
			case "athletics":
				tempSkill = holder.getAthletics();
				tempSkill.setMiscBonus(v);
				holder.setAthletics(tempSkill);
				break;
			
			case "history":
				tempSkill = holder.getHistory();
				tempSkill.setMiscBonus(v);
				holder.setHistory(tempSkill);
				break;
			
			case "insight":
				tempSkill = holder.getInsight();
				tempSkill.setMiscBonus(v);
				holder.setInsight(tempSkill);
				break;
			
			case "intimidation":
				tempSkill = holder.getIntimidation();
				tempSkill.setMiscBonus(v);
				holder.setIntimidation(tempSkill);
				break;
			
			case "investigation":
				tempSkill = holder.getInvestigation();
				tempSkill.setMiscBonus(v);
				holder.setInvestigation(tempSkill);
				break;
			
			case "medicine":
				tempSkill = holder.getMedicine();
				tempSkill.setMiscBonus(v);
				holder.setMedicine(tempSkill);
				break;
			
			case "nature":
				tempSkill = holder.getNature();
				tempSkill.setMiscBonus(v);
				holder.setNature(tempSkill);
				break;
			
			case "perception":
				tempSkill = holder.getPerception();
				tempSkill.setMiscBonus(v);
				holder.setPerception(tempSkill);
				break;
			
			case "performance":
				tempSkill = holder.getPerformance();
				tempSkill.setMiscBonus(v);
				holder.setPerformance(tempSkill);
				break;
		
			case "persuasion":
				tempSkill = holder.getPersuasion
				();
				tempSkill.setMiscBonus(v);
				holder.setPersuasion(tempSkill);
				break;
				
			case "religion":
				tempSkill = holder.getReligion();
				tempSkill.setMiscBonus(v);
				holder.setReligion(tempSkill);
				break;
			
			case "sleightOfHand":
				tempSkill = holder.getSleightOfHand();
				tempSkill.setMiscBonus(v);
				holder.setSleightOfHand(tempSkill);
				break;

			case "stealth":
				tempSkill = holder.getStealth();
				tempSkill.setMiscBonus(v);
				holder.setStealth(tempSkill);
				break;

			case "Survival":
				tempSkill = holder.getSurvival();
				tempSkill.setMiscBonus(v);
				holder.setSurvival(tempSkill);
				break;

			case "strSave":
				tempSkill = holder.getStrSave();
				tempSkill.setMiscBonus(v);
				holder.setStrSave(tempSkill);
				break;

			case "dexSave":
				tempSkill = holder.getDexSave();
				tempSkill.setMiscBonus(v);
				holder.setDexSave(tempSkill);
				break;

			case "conSave":
				tempSkill = holder.getConSave();
				tempSkill.setMiscBonus(v);
				holder.setConSave(tempSkill);
				break;

			case "intSave":
				tempSkill = holder.getIntSave();
				tempSkill.setMiscBonus(v);
				holder.setIntSave(tempSkill);
				break;

			case "wisSave":
				tempSkill = holder.getWisSave();
				tempSkill.setMiscBonus(v);
				holder.setStrSave(tempSkill);
				break;

			case "chaSave":
				tempSkill = holder.getChaSave();
				tempSkill.setMiscBonus(v);
				holder.setChaSave(tempSkill);
				break;
				
			default: 
				throw new IllegalArgumentException("make sure you have correctly named the variables you want to change");
			} //end of switch
		
		}); //end of forEach
		
		
	}	// end of method

	@Override
	public String toString() 
	{
		return ("\nCard: " + "\nname: " + name + "\ndescription: " + desc + "\nbonuses: " + manipulationMap);
	}
}
