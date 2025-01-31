 /* Author: YOUR NAME
 * Date: TODAY'S DATE
 * EID: YOUR EID
 */

/**
 * <p>Represents a character in the game.</p>
 *
 * <p>January 29, 2025</p>
 *
 * @author Abdon Morales, am226923, <a href="abdonm@cs.utexas.edu">abdonm@cs.utexas.edu</a>
 */
public class GameCharacter {

  private    String name;
  private int health;
  private int attack;
  private int speed;

  /**
   * Constructor: An instance with a name, initial health, attack points, and speed
   *
   * @param name is the name of the character.
   * @param health is the amount of health of the character.
   * @param attack is the attack/hit damage from and to the character.
   * @param speed is the speed of the character.
   */
  public GameCharacter(String name, int health, int attack, int speed) {
    this.name = name;
    this.health = health;
    this.attack = attack;
    this.speed = speed;
  }

  // FILL IN ANY accessors or mutators that are missing
  
  /**
   * Attacks the given target by reducing its health by the attack value.
   *
   * @param target the target parameter is the character's attempt to hit another player
   */
  public void hit(GameCharacter target) {
      // FILL IN HERE 
  }

  /**
   * Reduces the speed of the character by the given amount.
   *
   * @param speedDamage is the damage given from a/this character.
   */
  public void slowDown(int speedDamage) {
      // FILL IN HERE 
  }

  /** 
   * Increases character's attributes based on those of the item found.
   *
   * @param item is the item the character uses or interacts with.
   */ 
  public void useItem(Item item) {
      //FILL IN HERE 
  }
}
