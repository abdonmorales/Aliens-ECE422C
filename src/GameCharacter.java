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

  /**
   * This method get the name of the character.
   *
   * @return name
   */
  public String getName() {return name;}

  /**
   *
   * This method gets the information about the health status of the character.
   *
   * @return health, returns the current health of the character.
   */
  public int getHealth() {return health;}

  /**
   * This method gets the information about the character's speed.
   *
   * @return speed
   */
  public int getSpeed() {return speed;}

  /**
   * This method gets the information about the character's attack damage using a getter/setter
   * method.
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
    target.health = target.getHealth() - attack;
  }

  /**
   * This method checks if the character is dead when his health is greater than 0.
   *
   * @return true or false, as it's dependent on the return of health > 0.
   */
  public boolean isAlive() {return health > 0;}

  /**
   * This method checks if the character is dead
   *
   * @return true or false, based on what health <= 0 returns.
   */
  public boolean isDead() {return health <= 0;}
  /**
   * Reduces the speed of the character by the given amount.
   *
   * @param speedDamage is the damage given from a/this character.
   */
  public void slowDown(int speedDamage) {
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
