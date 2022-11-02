package com.lbg.game.Characters;

public class Goblin extends Abstract_characters{
	
	
	int luck;
	protected Goblin(String race, String name, int health, int attack, int luck) {
		// TODO Auto-generated constructor stub
		super(name,health,attack);
		this.luck = luck;
		this.race = "Goblin";
	}
	

	
	public String toString() {
		return "\n-----------------Character Stats------------------"
				+"\nRace: \t\t" + race +
				 "\nName: \t\t" + name +
				"\nAttack: \t" + attack+
				"\nHealth: \t" + health +
				"\nLuck: \t\t" + luck + 
				"\n_______________________________________________";
	}
	
}
