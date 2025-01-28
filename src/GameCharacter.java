 /* Author: YOUR NAME
 * Date: TODAY'S DATE
 * EID: YOUR EID
 */

/**
 * Represents a character in the game.
 */
public class GameCharacter {

  private    String name;
  private int health;
  private int attack;
  private int speed;

  /** Constructor: An instance with a name, initial health, attack points, and speed */
  public GameCharacter(String name, int health, int attack, int speed) {
    this.name = name;
    this.health = health;
    this.attack = attack;
    this.speed = speed;
  }

  // FILL IN ANY accessors or mutators that are missing
  
  /**
   * Attacks the given target by reducing its health by the attack value.
   */
  public void hit(GameCharacter target) {
      // FILL IN HERE 
  }

  /**
   * Reduces the speed of the character by the given amount.
   */
  public void slowDown(int speedDamage) {
      // FILL IN HERE 
  }

  /** 
   * Increases character's attributes based on those of the item found 
   */ 
  public void useItem(Item item) {
      //FILL IN HERE 
  }
}
