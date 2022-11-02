
package com.lbg.game.Characters;
 
 public class Characters {
 
 String name; int attack; int defence;
 
 public Characters(String name, int attack, int defence) {
 
 this.name = name; this.attack = attack; this.defence = defence;
 
 }
 
 public static void main(String[] args) {
 
Characters goblin = new Characters("Goblin", 22, 44);
System.out.println(goblin.toString());

}
}