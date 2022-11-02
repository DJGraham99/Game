package com.lbg.game.Equipment;

import java.util.Objects;

public class Equipment {
	
	private final String name;
	private final int healthBonus;
	private final int attackBonus;

	public Equipment (String name, int healthBonus, int attackBonus) {
		this.name = name;
		this.healthBonus = healthBonus;
		this.attackBonus = attackBonus;
	}

	public String getName() {
		return name;
	}

	public int getHealthBonus() {
		return healthBonus;
	}

	public int getAttackBonus() {
		return attackBonus;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Equipment other = (Equipment) obj;
		return Objects.equals(name, other.name);
	}
	
	
	
	
	
}
