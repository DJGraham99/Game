package com.lbg.game.Attacks;

public class Spell extends Attack{
	
	int manaCost;
	
	public Spell(String name, int damage, int manaCost) {
		super(name, damage);
		this.manaCost = manaCost;
		// TODO Auto-generated constructor stub
		
	}
	
	public int getManaCost() {
		return manaCost;
	}
	
	

	
}
