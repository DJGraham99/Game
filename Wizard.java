package com.lbg.game.Characters;
import java.util.HashSet;

import com.lbg.game.Attacks.Spell;
import com.lbg.game.Equipment.Equipment;

public class Wizard extends Abstract_characters {
	
	
	public static HashSet<Spell> spellHashSet = new HashSet<Spell>();
	
	
	Spell fireBall = new Spell("Fireball", 33, 20);
	Spell wazoo = new Spell("Kadabra", 33, 30);
	Spell troop = new Spell("Alakazam", 33, 30);
	
	private int mana;
	protected Wizard(String race, String name, int health, int attack, int mana) {
		super(name,health,attack);
		this.mana = mana;
		this.race = "Wizard";
		
		addSpellBasic(getFireBall());
		addSpellBasic(wazoo);
		addSpellBasic(troop);
		
		
		Equipment staff = new Equipment("Staff", 0, 20);
		equipItem(staff);
		
		Equipment boots = new Equipment("Basic Boots", 20, 0);
		pickUpItem(boots);
	}
	
	
	
	
	//Apply formatting rules
	protected boolean addSpell(Spell spellName) {
		addSpellBasic(spellName);
		System.out.println(spellName.getName() + " was successfully added to " + name + "'s Spell List!");
		return true;
		
	}
	
	//Method to ignore formatting
	protected void addSpellBasic(Spell spellName) {
		spellHashSet.add(spellName);
	}
	
	protected int getSpellNo() {
		return spellHashSet.size();
	}
	
	public void getSpells() {
		System.out.println("\n-----------------Spells----------------");
		System.out.println("Name \t\tDamage   Mana Cost");
		for (Spell entry: spellHashSet) {
			System.out.println("" + entry.getName() + ": \t" + entry.getDamage() + ":  \t " + entry.getManaCost());
		}
		System.out.println("________________________________________\n");
	}
	

	protected int getMana() {
		return mana;
	}
	
	
	
	public boolean attack(Spell spell, Abstract_characters enemy) {
		if (enemy.health <=0) {
			System.out.println("They are already dead, cannot be attacked!!!");
			return false;
		}
		
		if (!(spellHashSet.contains(spell))) {
			System.out.println("Invalid Spell");
			return false;
		}
		
		
		System.out.println(name + " attacks " + enemy.name + " with " + spell.getName() +"\n");
		
		if (useMana(spell) == true){
			enemy.takeDamage(spell.getDamage());
			return true;
		}
		
		return false;
	
	}
	
	
	
	public boolean useMana(Spell spell) {
		int manaCost = spell.getManaCost();
		int newMana = mana - manaCost;
		if (newMana < 0) {
			System.out.println("No mana left..... cannot cast spell!  ");
			return false;
		}
		
		else {
			mana = newMana;
			return true;
		}
	}
	
	
	
	
	

	public String toString() {
		return "\n----------------Character Stats------------------"
				+"\nRace: \t\t" + race +
				 "\nName: \t\t" + name +
				"\nAttack: \t" + attack+
				"\nHealth: \t" + health +
				"\nMana: \t\t" + mana +
				"\n________________________________________________";
	}




	public Spell getFireBall() {
		return fireBall;
	}




	public void setFireBall(Spell fireBall) {
		this.fireBall = fireBall;
	}
	
	
}
