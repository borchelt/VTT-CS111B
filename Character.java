/**
 * a class that models a Rpg character in a mechanical sense
 */
package characterFinal;

import card.*;
import event.*;
import diceClassFinal.*;
import skill.*;
import java.util.*;

/**
 * @author Wolfgang Borchelt
 *
 */
public class Character 
{
	protected String name;
	protected int level;
	protected String profession;
	protected String race;
	protected int str;
	protected int dex;
	protected int con;
	protected int intel;
	protected int wis;
	protected int cha;
	protected int strMod;
	protected int dexMod;
	protected int conMod;
	protected int intMod;
	protected int wisMod;
	protected int chaMod;
	protected int prof;
	protected int speed;
	protected boolean inspiration;
	protected int maxHealth;
	protected int health;
	protected int tempHealth;
	protected int AC;
	protected int inti;
	protected int gold;
	protected Skill acrobatics;
	protected Skill animalHandling;
	protected Skill arcana;
	protected Skill athletics;
	protected Skill deception;
	protected Skill history;
	protected Skill insight;
	protected Skill intimidation;
	protected Skill investigation;
	protected Skill medicine;
	protected Skill nature;
	protected Skill perception;
	protected Skill performance;
	protected Skill persuasion;
	protected Skill religion;
	protected Skill sleightOfHand;
	protected Skill stealth;
	protected Skill survival;
	protected Skill strSave;
	protected Skill dexSave;
	protected Skill conSave;
	protected Skill intSave;
	protected Skill wisSave;
	protected Skill chaSave;
	protected ArrayList<Card> deck = new ArrayList<Card>();

	/**
	 * 
	 */
	public Character() 
	{
		name = "joe";
		level = 1;
		profession = "adventurer";
		race = "human";
		str = 10;
		dex = 10;
		con = 10;
		intel = 10;
		wis = 10;
		cha = 10;
		prof = 2;
		speed = 30;
		inspiration = false;
		maxHealth = 10;
		health = 10;
		tempHealth = 0;
		AC = 10;
		inti = 0;
		gold = 10;
		acrobatics = new Skill("Acrobatics", dex, false, false);
		animalHandling = new Skill("Animal Handling", wis, false, false);
		arcana = new Skill("Arcana", intel, false, false);
		athletics = new Skill("Atheletics", str, false, false);
		deception = new Skill("Deception", cha, false, false);
		history = new Skill("History", intel, false, false);
		insight = new Skill("Insight", wis, false, false);
		intimidation = new Skill("Intimidation", cha, false, false);
		investigation = new Skill("Investigation", intel, false, false);
		medicine = new Skill("Medicine", wis, false, false);
		nature = new Skill("Nature", intel, false, false);
		perception = new Skill("Perception", wis, false, false);
		performance = new Skill("Performance", cha, false, false);
		persuasion = new Skill("Persuasion", cha, false, false);
		religion = new Skill("Religion", intel, false, false);
		sleightOfHand = new Skill("Sleight of Hand", dex, false, false);
		stealth = new Skill("Stealth", dex, false, false);
		survival = new Skill("Survival", wis, false, false);
		strSave = new Skill("Strength Save", str, false, false);
		dexSave = new Skill("Dexterity Save", dex, false, false);
		conSave = new Skill("Constitution Save", con, false, false);
		intSave = new Skill("Intellegence Save", intel, false, false);
		wisSave = new Skill("Wisdom Save", wis, false, false);
		chaSave = new Skill("Charisma Save", cha, false, false);
		
		strMod = ((str-10) / 2);
		dexMod = ((dex-10) / 2);
		conMod = ((con-10) / 2);
		intMod = ((intel-10) / 2);
		wisMod = ((wis-10) / 2);
		chaMod = ((cha-10) / 2);
	}
	
	
	
	
	public Character(String name, int level, String profession, String race, int str, int dex, int con, int intel,
			int wis, int cha, int speed, boolean inspiration, int maxHealth, int health, int tempHealth, int aC,
			int inti, int gold, ArrayList<Card> deck) 
	{
		super();
		this.name = name;
		this.level = level;
		this.profession = profession;
		this.race = race;
		this.str = str;
		this.dex = dex;
		this.con = con;
		this.intel = intel;
		this.wis = wis;
		this.cha = cha;
		this.speed = speed;
		this.inspiration = inspiration;
		this.maxHealth = maxHealth;
		this.health = health;
		this.tempHealth = tempHealth;
		AC = aC;
		this.inti = inti;
		this.gold = gold;
		acrobatics = new Skill("Acrobatics", dex, false, false);
		animalHandling = new Skill("Animal Handling", wis, false, false);
		arcana = new Skill("Arcana", intel, false, false);
		athletics = new Skill("Atheletics", str, false, false);
		deception = new Skill("Deception", cha, false, false);
		history = new Skill("History", intel, false, false);
		insight = new Skill("Insight", wis, false, false);
		intimidation = new Skill("Intimidation", cha, false, false);
		investigation = new Skill("Investigation", intel, false, false);
		medicine = new Skill("Medicine", wis, false, false);
		nature = new Skill("Nature", intel, false, false);
		perception = new Skill("Perception", wis, false, false);
		performance = new Skill("Performance", cha, false, false);
		persuasion = new Skill("Persuasion", cha, false, false);
		religion = new Skill("Religion", intel, false, false);
		sleightOfHand = new Skill("Sleight of Hand", dex, false, false);
		stealth = new Skill("Stealth", dex, false, false);
		survival = new Skill("Survival", wis, false, false);
		strSave = new Skill("Strength Save", str, false, false);
		dexSave = new Skill("Dexterity Save", dex, false, false);
		conSave = new Skill("Constitution Save", con, false, false);
		intSave = new Skill("Intellegence Save", intel, false, false);
		wisSave = new Skill("Wisdom Save", wis, false, false);
		chaSave = new Skill("Charisma Save", cha, false, false);
		this.deck = deck;
		
		strMod = ((str-10) / 2);
		dexMod = ((dex-10) / 2);
		conMod = ((con-10) / 2);
		intMod = ((intel-10) / 2);
		wisMod = ((wis-10) / 2);
		chaMod = ((cha-10) / 2);
		
		if(level < 1 || maxHealth < 1 || gold < 0)
			throw new IllegalArgumentException("some variables cant be lower than 1 or 0,\n double check your numbers and make sure they make sense");
	}



	//GETTERS/SETTERS
	
	//there's no way im adjusting the comments for all of these, so ill let eclipse do it for now
	
	
	/**
	 * @return the name
	 */
	public String getName() 
	{
		return name;
	}
	
	
	/**
	 * @return the strMod
	 */
	public int getStrMod() {
		return strMod;
	}




	/**
	 * @return the dexMod
	 */
	public int getDexMod() {
		return dexMod;
	}




	/**
	 * @return the conMod
	 */
	public int getConMod() {
		return conMod;
	}




	/**
	 * @return the intMod
	 */
	public int getIntMod() {
		return intMod;
	}




	/**
	 * @return the wisMod
	 */
	public int getWisMod() {
		return wisMod;
	}




	/**
	 * @return the chaMod
	 */
	public int getChaMod() {
		return chaMod;
	}




	/**
	 * @param strMod the strMod to set
	 */
	public void setStrMod(int strMod) {
		this.strMod = strMod;
	}




	/**
	 * @param dexMod the dexMod to set
	 */
	public void setDexMod(int dexMod) {
		this.dexMod = dexMod;
	}




	/**
	 * @param conMod the conMod to set
	 */
	public void setConMod(int conMod) {
		this.conMod = conMod;
	}




	/**
	 * @param intMod the intMod to set
	 */
	public void setIntMod(int intMod) {
		this.intMod = intMod;
	}




	/**
	 * @param wisMod the wisMod to set
	 */
	public void setWisMod(int wisMod) {
		this.wisMod = wisMod;
	}




	/**
	 * @param chaMod the chaMod to set
	 */
	public void setChaMod(int chaMod) {
		this.chaMod = chaMod;
	}




	/**
	 * @return the level
	 */
	public int getLevel() 
	{
		return level;
	}

	/**
	 * @return the profession
	 */
	public String getProfession() 
	{
		return profession;
	}

	/**
	 * @return the race
	 */
	public String getRace() 
	{
		return race;
	}

	/**
	 * @return the str
	 */
	public int getStr() {
		return str;
	}

	/**
	 * @return the dex
	 */
	public int getDex() 
	{
		return dex;
	}

	/**
	 * @return the con
	 */
	public int getCon() 
	{
		return con;
	}

	/**
	 * @return the intel
	 */
	public int getIntel() 
	{
		return intel;
	}

	/**
	 * @return the wis
	 */
	public int getWis() 
	{
		return wis;
	}

	/**
	 * @return the cha
	 */
	public int getCha() 
	{
		return cha;
	}

	/**
	 * @return the prof
	 */
	public int getProf() 
	{
		return prof;
	}

	/**
	 * @return the speed
	 */
	public int getSpeed() 
	{
		return speed;
	}

	/**
	 * @return the inspiration
	 */
	public boolean isInspiration() 
	{
		return inspiration;
	}

	/**
	 * @return the maxHealth
	 */
	public int getMaxHealth() 
	{
		return maxHealth;
	}

	/**
	 * @return the health
	 */
	public int getHealth() 
	{
		return health;
	}

	/**
	 * @return the tempHealth
	 */
	public int getTempHealth() 
	{
		return tempHealth;
	}

	/**
	 * @return the aC
	 */
	public int getAC() 
	{
		return AC;
	}

	/**
	 * @return the inti
	 */
	public int getInti() 
	{
		return inti;
	}

	/**
	 * @return the gold
	 */
	public int getGold() 
	{
		return gold;
	}

	/**
	 * @return the acrobatics
	 */
	public Skill getAcrobatics() 
	{
		return acrobatics;
	}

	/**
	 * @return the animalHandling
	 */
	public Skill getAnimalHandling() 
	{
		return animalHandling;
	}

	/**
	 * @return the arcana
	 */
	public Skill getArcana() 
	{
		return arcana;
	}

	/**
	 * @return the athletics
	 */
	public Skill getAthletics() 
	{
		return athletics;
	}

	/**
	 * @return the deception
	 */
	public Skill getDeception() 
	{
		return deception;
	}

	/**
	 * @return the history
	 */
	public Skill getHistory() 
	{
		return history;
	}

	/**
	 * @return the insight
	 */
	public Skill getInsight() 
	{
		return insight;
	}

	/**
	 * @return the intimidation
	 */
	public Skill getIntimidation() 
	{
		return intimidation;
	}

	/**
	 * @return the investigation
	 */
	public Skill getInvestigation() 
	{
		return investigation;
	}

	/**
	 * @return the medicine
	 */
	public Skill getMedicine() 
	{
		return medicine;
	}

	/**
	 * @return the nature
	 */
	public Skill getNature() 
	{
		return nature;
	}

	/**
	 * @return the perception
	 */
	public Skill getPerception() 
	{
		return perception;
	}

	/**
	 * @return the performance
	 */
	public Skill getPerformance() 
	{
		return performance;
	}

	/**
	 * @return the persuasion
	 */
	public Skill getPersuasion() 
	{
		return persuasion;
	}

	/**
	 * @return the religion
	 */
	public Skill getReligion() 
	{
		return religion;
	}

	/**
	 * @return the sleightOfHand
	 */
	public Skill getSleightOfHand() 
	{
		return sleightOfHand;
	}

	/**
	 * @return the stealth
	 */
	public Skill getStealth() 
	{
		return stealth;
	}

	/**
	 * @return the survival
	 */
	public Skill getSurvival() 
	{
		return survival;
	}

	/**
	 * @return the strSave
	 */
	public Skill getStrSave() 
	{
		return strSave;
	}

	/**
	 * @return the dexSave
	 */
	public Skill getDexSave() 
	{
		return dexSave;
	}

	/**
	 * @return the conSave
	 */
	public Skill getConSave() 
	{
		return conSave;
	}

	/**
	 * @return the intSave
	 */
	public Skill getIntSave() 
	{
		return intSave;
	}

	/**
	 * @return the wisSave
	 */
	public Skill getWisSave() 
	{
		return wisSave;
	}

	/**
	 * @return the chaSave
	 */
	public Skill getChaSave() 
	{
		return chaSave;
	}

	/**
	 * @return the deck
	 */
	public ArrayList<Card> getDeck() 
	{
		return deck;
	}

	/**
	 * @param profession the profession to set
	 */
	public void setName(String name) 
	{
		this.name = name;
	}
	
	/**
	 * @param level the level to set
	 */
	public void setLevel(int level) 
	{
		if(level < 1)
			throw new IllegalArgumentException("level cant be lower than 1");
		this.level = level;
	}

	/**
	 * @param profession the profession to set
	 */
	public void setProfession(String profession) 
	{
		this.profession = profession;
	}

	/**
	 * @param race the race to set
	 */
	public void setRace(String race) 
	{
		this.race = race;
	}

	/**
	 * @param str the str to set
	 */
	public void setStr(int str) 
	{
		this.str = str;
	}

	/**
	 * @param dex the dex to set
	 */
	public void setDex(int dex) 
	{
		this.dex = dex;
	}

	/**
	 * @param con the con to set
	 */
	public void setCon(int con) 
	{
		this.con = con;
	}

	/**
	 * @param intel the intel to set
	 */
	public void setIntel(int intel) 
	{
		this.intel = intel;
	}

	/**
	 * @param wis the wis to set
	 */
	public void setWis(int wis) 
	{
		this.wis = wis;
	}

	/**
	 * @param cha the cha to set
	 */
	public void setCha(int cha) 
	{
		this.cha = cha;
	}

	/**
	 * @param prof the prof to set
	 */
	public void setProf(int prof) 
	{
		if(prof < 2)
			throw new IllegalArgumentException("prof cant be lower than 2");
		this.prof = prof;
	}

	/**
	 * @param speed the speed to set
	 */
	public void setSpeed(int speed) 
	{
		this.speed = speed;
	}

	/**
	 * @param inspiration the inspiration to set
	 */
	public void setInspiration(boolean inspiration) 
	{
		this.inspiration = inspiration;
	}

	/**
	 * @param maxHealth the maxHealth to set
	 */
	public void setMaxHealth(int maxHealth) 
	{
		if(maxHealth < 1)
			throw new IllegalArgumentException("max health cant be lower than 1");
		this.maxHealth = maxHealth;
	}

	/**
	 * @param health the health to set
	 */
	public void setHealth(int health) 
	{
		this.health = health;
	}

	/**
	 * @param tempHealth the tempHealth to set
	 */
	public void setTempHealth(int tempHealth) 
	{
		if(tempHealth < 0)
			throw new IllegalArgumentException("temp health cant be lower than 0");
		this.tempHealth = tempHealth;
	}

	/**
	 * @param aC the aC to set
	 */
	public void setAC(int aC) 
	{
		AC = aC;
	}

	/**
	 * @param inti the inti to set
	 */
	public void setInti(int inti) 
	{
		this.inti = inti;
	}

	/**
	 * @param gold the gold to set
	 */
	public void setGold(int gold) 
	{
		if(gold < 0)
			throw new IllegalArgumentException("gold cant be lower than 0");
		this.gold = gold;
	}

	/**
	 * @param acrobatics the acrobatics to set
	 */
	public void setAcrobatics(Skill acrobatics) 
	{
		this.acrobatics = acrobatics;
	}

	/**
	 * @param animalHandling the animalHandling to set
	 */
	public void setAnimalHandling(Skill animalHandling) 
	{
		this.animalHandling = animalHandling;
	}

	/**
	 * @param arcana the arcana to set
	 */
	public void setArcana(Skill arcana) 
	{
		this.arcana = arcana;
	}

	/**
	 * @param athletics the athletics to set
	 */
	public void setAthletics(Skill athletics) 
	{
		this.athletics = athletics;
	}

	/**
	 * @param deception the deception to set
	 */
	public void setDeception(Skill deception) 
	{
		this.deception = deception;
	}

	/**
	 * @param history the history to set
	 */
	public void setHistory(Skill history) 
	{
		this.history = history;
	}

	/**
	 * @param insight the insight to set
	 */
	public void setInsight(Skill insight) 
	{
		this.insight = insight;
	}

	/**
	 * @param intimidation the intimidation to set
	 */
	public void setIntimidation(Skill intimidation) 
	{
		this.intimidation = intimidation;
	}

	/**
	 * @param investigation the investigation to set
	 */
	public void setInvestigation(Skill investigation) 
	{
		this.investigation = investigation;
	}

	/**
	 * @param medicine the medicine to set
	 */
	public void setMedicine(Skill medicine) 
	{
		this.medicine = medicine;
	}

	/**
	 * @param nature the nature to set
	 */
	public void setNature(Skill nature) 
	{
		this.nature = nature;
	}

	/**
	 * @param perception the perception to set
	 */
	public void setPerception(Skill perception) 
	{
		this.perception = perception;
	}

	/**
	 * @param performance the performance to set
	 */
	public void setPerformance(Skill performance) 
	{
		this.performance = performance;
	}

	/**
	 * @param persuasion the persuasion to set
	 */
	public void setPersuasion(Skill persuasion) 
	{
		this.persuasion = persuasion;
	}

	/**
	 * @param religion the religion to set
	 */
	public void setReligion(Skill religion) 
	{
		this.religion = religion;
	}

	/**
	 * @param sleightOfHand the sleightOfHand to set
	 */
	public void setSleightOfHand(Skill sleightOfHand) 
	{
		this.sleightOfHand = sleightOfHand;
	}

	/**
	 * @param stealth the stealth to set
	 */
	public void setStealth(Skill stealth) 
	{
		this.stealth = stealth;
	}

	/**
	 * @param survival the survival to set
	 */
	public void setSurvival(Skill survival) 
	{
		this.survival = survival;
	}

	/**
	 * @param strSave the strSave to set
	 */
	public void setStrSave(Skill strSave) 
	{
		this.strSave = strSave;
	}

	/**
	 * @param dexSave the dexSave to set
	 */
	public void setDexSave(Skill dexSave) 
	{
		this.dexSave = dexSave;
	}

	/**
	 * @param conSave the conSave to set
	 */
	public void setConSave(Skill conSave) 
	{
		this.conSave = conSave;
	}

	/**
	 * @param intSave the intSave to set
	 */
	public void setIntSave(Skill intSave) 
	{
		this.intSave = intSave;
	}

	/**
	 * @param wisSave the wisSave to set
	 */
	public void setWisSave(Skill wisSave) 
	{
		this.wisSave = wisSave;
	}

	/**
	 * @param chaSave the chaSave to set
	 */
	public void setChaSave(Skill chaSave) 
	{
		this.chaSave = chaSave;
	}

	/**
	 * @param deck the deck to set
	 */
	public void setDeck(ArrayList<Card> deck) 
	{
		this.deck = deck;
	}

	
	
	//OTHER METHODS
	
	
	/**
	 * models a weapon attack hitting a character
	 * @param target the character being hit
	 * @param weapon the weapon card being used
	 * @return a string describing the action, this method also does damage to the target
	 */
	public String weaponAttack(Character target, WeaponCard weapon)
	{
		ArrayList<Character> targets = new ArrayList<Character>();
		targets.add(target);
		Event attack = new Event(this, targets, " uses their " + weapon.getname() + " to attack ", weapon.getDamage());
		return attack.resolve();
	}
	
	/**
	 * models a spell hitting a character
	 * @param targets the targets of the spell
	 * @param spell the spell card being used
	 * @return a string describing the action, this method also does damage to the target
	 */
	public String spellAttack(ArrayList<Character> targets, SpellCard spell)
	{
		Event attack = new Event(this, targets, " casts " + spell.getname() + " at ", spell.getDamage());
		return attack.resolve();
	}
	
	public String equip(ItemCard item)
	{
		item.addBuffs(this);
		return this.getName() + " equips " + item.getname() + ", gaining the following bonuses: " + item.getManipulationMap();
	}
	
	/**
	 * models using a class ability that dosn't do damage, like a barbarians rage or a rangers sense
	 * @param targets
	 * @param abilityCard
	 * @return a string describing the action
	 */
	public String useAbility(ArrayList<Character> targets, AbilityCard abilityCard)
	{
		Event ability = new Event(this, targets, " rolls " + abilityCard.getDiceRolls() + " for an ability used on ", 0);
		return ability.resolve();
	}
	
	/**
	 * rolls a strength check
	 * @param advantage whether or not the roll is with advantage 
	 * @return the roll
	 */
	public int rollStr(boolean advantage)
	{
		Dice d20 = new Dice(1, 20, str, advantage);
		return d20.roll().get(0);
	}
	
	/**
	 * rolls a dexterity check
	 * @param advantage whether or not the roll is with advantage 
	 * @return the roll
	 */
	public int rollDex(boolean advantage)
	{
		Dice d20 = new Dice(1, 20, dex, advantage);
		return d20.roll().get(0);
	}
	
	/**
	 * rolls a constitution check
	 * @param advantage whether or not the roll is with advantage 
	 * @return the roll
	 */
	public int rollCon(boolean advantage)
	{
		Dice d20 = new Dice(1, 20, con, advantage);
		return d20.roll().get(0);
	}
	
	/**
	 * rolls a intelligence check
	 * @param advantage whether or not the roll is with advantage 
	 * @return the roll
	 */
	public int rollInt(boolean advantage)
	{
		Dice d20 = new Dice(1, 20, intel, advantage);
		return d20.roll().get(0);
	}
	
	/**
	 * rolls a wisdom check
	 * @param advantage whether or not the roll is with advantage 
	 * @return the roll
	 */
	public int rollWis(boolean advantage)
	{
		Dice d20 = new Dice(1, 20, wis, advantage);
		return d20.roll().get(0);
	}
	
	/**
	 * rolls a charisma check
	 * @param advantage whether or not the roll is with advantage 
	 * @return the roll
	 */
	public int rollCha(boolean advantage)
	{
		Dice d20 = new Dice(1, 20, cha, advantage);
		return d20.roll().get(0);
	}



	/**
	 * TO BE FORMATTED
	 * the toString method
	 * @return a string containing all the stats of the character
	 */
	@Override
	public String toString() {
		return "Character [name=" + name + ", level=" + level + ", profession=" + profession + ", race=" + race
				+ ", str=" + str + ", dex=" + dex + ", con=" + con + ", intel=" + intel + ", wis=" + wis + ", cha="
				+ cha + ", prof=" + prof + ", speed=" + speed + ", inspiration=" + inspiration + ", maxHealth="
				+ maxHealth + ", health=" + health + ", tempHealth=" + tempHealth + ", AC=" + AC + ", inti=" + inti
				+ ", gold=" + gold + ", acrobatics=" + acrobatics + ", animalHandling=" + animalHandling + ", arcana="
				+ arcana + ", athletics=" + athletics + ", deception=" + deception + ", history=" + history
				+ ", insight=" + insight + ", intimidation=" + intimidation + ", investigation=" + investigation
				+ ", medicine=" + medicine + ", nature=" + nature + ", perception=" + perception + ", performance="
				+ performance + ", persuasion=" + persuasion + ", religion=" + religion + ", sleightOfHand="
				+ sleightOfHand + ", stealth=" + stealth + ", survival=" + survival + ", strSave=" + strSave
				+ ", dexSave=" + dexSave + ", conSave=" + conSave + ", intSave=" + intSave + ", wisSave=" + wisSave
				+ ", chaSave=" + chaSave + ", deck=" + deck + "]";
	}
	
	

}
