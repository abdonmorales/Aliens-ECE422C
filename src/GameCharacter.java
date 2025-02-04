/**
 * <p>Represents a character in the game.</p>
 *
 * <p>January 29, 2025</p>
 *
 * @author Abdon Morales, am226923, <a href="abdonm@cs.utexas.edu">abdonm@cs.utexas.edu</a>
 */
public class GameCharacter {

  private String name;
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
   * This method returns the string representation of the character's class or object when calling
   * the toString() method or the object itself.
   *
   * @return name
   */
  public String toString() {return name;}

  /**
   *
   * This method gives information about the health status of the character.
   *
   * @return health, returns the current health of the character.
   */
  public int getHealth() {return health;}

  /**
   * This method gives information about the character's speed.
   *
   * @return speed
   */
  public int getSpeed() {return speed;}

  /**
   * This method gives information about the character's attack damage using a getter/setter method.
   *
   * @return attack
   */
  public int getAttack() {return attack;}

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
    speed =- speedDamage;
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
