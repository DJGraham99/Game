package com.lbg.game;

import com.lbg.game.Characters.*;
 
import java.util.*;

import com.lbg.game.Attacks.Spell;
import com.lbg.game.Characters.Abstract_characters;
import com.lbg.game.Characters.Goblin;
import com.lbg.game.Characters.Wizard;
import com.lbg.game.Equipment.Equipment;
public class App {
		 public static Scanner scanner = new Scanner(System.in);
		  
		 /* 
		 * public static int determinePlayers(int numPlayers) {
		 * 
		 * System.out.println("How many players are playing?");
		 * 
		 * if (scanner.hasNextInt()) { numPlayers = scanner.nextInt();
		 * scanner.nextLine(); }
		 * 
		 * else{System.out.println("Invalid input, try again!"); scanner.nextLine(); }
		 * 
		 * return numPlayers;
		 * 
		 * }
		 * 
		 * 
		 * public static boolean chooseNames(ArrayList<String> players, int i) {
		 * System.out.println("Enter player " + i + "'s name: "); String name =
		 * scanner.nextLine();
		 * 
		 * System.out.println(name + " is it? (y/n)"); boolean correct = false; while
		 * (correct == false) { char letter =
		 * scanner.nextLine().toLowerCase().charAt(0); switch (letter) { case 'y':
		 * players.add(name); correct = true; return true; case 'n': correct = true;
		 * return false;
		 * 
		 * default: System.out.println("Invalid input, try again!"); } } return false; }
		 * 
		 * 
		 * public static void main(String[] args) {
		 * 
		 * 
		 * String fName = "Dylan"; String sName = "Graham"; int age = 23;
		 * System.out.println( "Hello " + fName + " " + sName );
		 * System.out.println(fName + " " + sName + "'s age is: " + age);
		 * 
		 * 
		 * ArrayList<String> players = new ArrayList<String>(); int numPlayers = 0;
		 * System.out.println("----------_NEW GAME----------");
		 * 
		 * while (numPlayers == 0) { numPlayers = determinePlayers(0); }
		 * 
		 * for (int i = 1; i < (numPlayers + 1); i++) { while (chooseNames(players,
		 * i)==false);
		 * 
		 * } System.out.println("---------------" + players.size() + " Player Game" +
		 * "------------------"); for (int t = 0; t < players.size(); t++) {
		 * System.out.println("Player " + (t + 1) + " : " + players.get(t)); }
		 * System.out.println("__________________________________________");
		 * System.out.println("--------PRESS ANY BUTTON TO BEGIN---------"); }
		 * 
		 * System.out.println("Enter the amount of lines you want..."); int lines =
		 * scanner.nextInt(); Random rd = new Random(); ArrayList<Integer> numbers = new
		 * ArrayList<Integer>();
		 * 
		 * for (int i = 0; i<lines; i++) {
		 * 
		 * for (int p = 0; p<6; p++ ) { int l = rd.nextInt(50) + 1; System.out.print(l +
		 * " "); } System.out.println(""); }
		 * 
		 * 
		 * } }
		 */

	
public static void main(String[] args) {
		

		
		Wizard a = (Wizard) Abstract_characters.getInstance(Abstract_characters.WIZARDTYPE, "Dylan");
	 	Goblin b = (Goblin) Abstract_characters.getInstance(Abstract_characters.GOBLINTYPE, "Terry");
	 	
		System.out.println(a.toString());

		a.checkEquipped();
		a.getSpells();
		Equipment boots = new Equipment("Basic Boots", 20, 0);
		a.pickUpItem(boots);
	 	a.checkInventory();
		
		
		a.attack(a.getFireBall(), b);
		a.attack(a.getFireBall(), b);
		a.attack(a.getFireBall(), b);
		
		
		
		
		System.out.println(a.toString());
		
		a.getLevel();
		a.addExp(30);
		
		
	}
}

