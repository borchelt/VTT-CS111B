
package characterFinal;
import card.*;
import java.util.*;
/**
 * @author Wolfgang
 *
 */
public class characterDriver 
{


	public static void main(String[] args)
	{
		HashMap<String, Integer> testMap = new HashMap<String, Integer>();
		testMap.put("acrobatics", 3);
		ArrayList<Card> deck = new ArrayList<Card>();
		
		
		Character joe = new Character();
		Character jon = new Character("jon", 3, "fighter", "elf", 10, 14, 18, 10, 10, 10, 30, false, 20, 20, 0, 18, 4, 30, deck);
		
		WeaponCard sword = new WeaponCard(1, 8, joe.getStrMod(), false, "sword", "a nice longSword, built for the arena", 5);
		WeaponCard rapier = new WeaponCard(1, 8, jon.getDexMod(), false, "Rapier", "a fine rapier, built for dueling", 5);
		System.out.println("joe has: " + joe.getHealth() + " health left.");
		System.out.println("jon has: " + jon.getHealth() + " health left.");
		System.out.println(jon.weaponAttack(joe, rapier));
		System.out.println(joe.weaponAttack(jon, sword));
		System.out.println("joe has: " + joe.getHealth() + " health left.");
		System.out.println("jon has: " + jon.getHealth() + " health left.");
	}

}
