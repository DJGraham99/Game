package com.lbg.game.Characters;

import java.util.*;

import com.lbg.game.Equipment.Equipment;

public abstract class Abstract_characters implements Playable_characters_interface {

	private static HashSet<Equipment> equippedItems = new HashSet<Equipment>();
	private static HashMap<Equipment, Integer> carriedItems = new HashMap<Equipment, Integer>();

	public static final String GOBLINTYPE = "Goblin";
	public static final String WIZARDTYPE = "Wizard";

	
	protected int exp = 10;
	protected int level = (int)Math.floor(exp/10);
	protected String race = "Unknown race";
	protected String name;
	protected int attack;
	protected int health;

	public Abstract_characters(String name, int health, int attack) {
		this.name = name;
		this.health = (int) Math.floor(health * (level * 0.2));
		this.attack = (int) Math.floor(attack * (level * 0.2));
	}
	
	public void getLevel() {
		System.out.println(name + "'s current level is: " + level);
	}
	
	public void addExp(int amount) {
		exp = exp + amount;
		System.out.println("Congratulations, " + name + " has gained " + amount + " exp!");
		attack = (int) Math.floor(attack * (level * 0.2));
		health = (int) Math.floor(health * (level * 0.2));
		int levelBefore = level;
		level = (int)Math.floor(exp/10);
		if (levelBefore < level) {
			System.out.println(name + " has leveled up to level " + level + "!");
		}
	}

	public void equipItem(Equipment item) {
		if (equippedItems.contains(item)) {
			System.out.println("Item already equipped!");
		} else {
			equippedItems.add(item);
		}
	}
	
	public void pickUpItem(Equipment item) {
		if (carriedItems.containsKey(item)) {
			carriedItems.put(item,(carriedItems.get(item) + 1));
		}
		else{
			carriedItems.put(item, 1);
		}
	}
	
	
	public void checkInventory() {
		System.out.println("\n-----------------Inventory------------------");
		System.out.println("Name \t    Quantity \tAttack \tHealth");
		for (Map.Entry<Equipment, Integer> entry : carriedItems.entrySet()) {
			System.out.println(entry.getKey().getName() + "\t" + entry.getValue()  +"\t" + entry.getKey().getAttackBonus() + "\t" + entry.getKey().getHealthBonus());
		}
		System.out.println("____________________________________________");

	}

	public void checkEquipped() {
		System.out.println("\n-----------------Equipment------------------");
		System.out.println("Name \tAttack \tHealth");
		for (Equipment item : equippedItems) {
			System.out.println(item.getName() + "\t" + item.getAttackBonus() + "\t" + item.getHealthBonus());
		}
		System.out.println("____________________________________________");

	}

	public static Playable_characters_interface getInstance(String characterType, String name) {
		if (characterType == "Wizard") {
			Wizard newWizard = new Wizard(characterType, name, 60, 70, 45);
			return newWizard;
		}

		else if (characterType == "Goblin") {
			Goblin newGoblin = new Goblin(characterType, name, 400, 80, 22);
			return newGoblin;
		}
		return null;

	}

	public String getRace() {
		return race;
	}

	public String getCharacterName() {
		return name;
		// TODO Auto-generated method stub
	}

	public int getCharacterHealth() {
		return health;
		// TODO Auto-generated method stub
	}

	public void die() {
		System.out.println(this.name + " has died....RIP");
	}

	public void takeDamage(int damage) {
		if (damage > 0) {
			System.out.println(
					this.name + " took " + damage + " damage" + "\n____________________________________________");
			setHealth(this.health - damage);
		}
	}

	public void setHealth(int newHealth) {
		if (newHealth <= 0) {
			this.health = 0;
			die();
		} else {
			this.health = newHealth;
		}
	}

	public String toString() {
		return "------Character Stats------" + "\nRace: " + race + "\nName: " + this.name + "\nAttack: " + attack
				+ "\nHealth: " + health;

	}

}
