 /* Author: YOUR NAME
 * Date: TODAY'S DATE
 * EID: YOUR EID
 */

 /**
  * An object of class Alien represents an alien in the game.
  *
  * @author Abdon Morales, am226923,
  * <a href="abdonm@cs.utexas.edu">abdonm@cs.utexas.edu</a>
  *
  * <p>Janurary 28, 2025</p>
  */

// FILL IN HERE - This declaration may change in your implementation 
public class Alien {
  // FILL IN YOUR INSTANCE VARIABLES HERE
  private String name;
  private int health;
  private int attack;
  private int speed;
  private int speedDamage;
  
  /**
   * Constructor: an instance with a name, health, attack, speed, and damage
   *
   * @param name is the parameter for the name of the alien, i.e Face Hugger, Queen, so on.
   * @param health is the parameter for the health of the alien.
   * @param attack is the parameter for the attack damage inflicted by the alien.
   * @param speed is the parameter for the speed of the alien.
   * @param speedDamage is the parameter for how much damage the alien can inflict on speed.
   *
   */
   public Alien(String name, int health, int attack, int speed, int speedDamage) {
    // FILL IN YOUR CONSTRUCTOR HERE
    this.name = name;
    this.health = health;
    this.attack = attack;
    this.speed = speed;
    this.speedDamage = speedDamage;
   }
  
  // FILL IN OTHER METHODS HERE
  /**
   * This method gives the health information of an alien when called.
   *
   * @return health
   */
  public int getHealth() {return health;}

  /**
   * This method gives the information of the damage inflicted by an attack.
   *
   * @return attack
   */
  public int getAttack() {return attack;}

  /**
   * This method gives the information about an alien's speed.
   *
   * @return speed
   */
  public int getSpeed() {return speed;}

  /**
   * This method implements the toString method of the Alien object/class
   *
   * @return name
   */
  public String toString() {return name;}
}
