/* Author: YOUR NAME
 * Date: TODAY'S DATE
 * EID: YOUR EID
 */

/**
 *
 * <p>January 28, 2025</p>
 *
 * <p>Ripley is a character that can fight aliens.</p>
 *
 * @author Abdon Morales, am226923,
 * <a href="mailto:abdonm@cs.utexas.edu">abdonm@cs.utexas.edu</a>
 *
 */

// FILL IN YOUR IMPLEMENTATION OF THE RIPLEY CLASS HERE 
// This declaration may change in your implementation 
public class Ripley
{
  private int health;
  private int attack;
  private int speed;
  private String name; 

  /**
   * Constructor for Ripley
   *
   * @param name is the name of the player or Ripley (default) as a parameter.
   * @param health is the initial/set health of the player as a parameter.
   * @param attack is the damage inflicted by an attack.
   * @param speed is the speed of the character can move, we must also be clear that Aliens are the
   *              only ones that can inflict speed damage; NOT the player.
   */
  public Ripley(String name, int health, int attack, int speed) {
    //FILL IN YOUR CONSTRUCTOR CODE HERE
    this.name = name;
    this.health = health;
    this.attack = attack;
    this.speed = speed;
  }
  
  /**
   * Fight an alien
   *
   * @param alien is the object/class Alien to fight it!
   */
  public void fight(Alien alien) {
    //FILL IN YOUR FIGHT CODE HERE
  }

  /**
   *
   * Speed of Ripley
   *
   * @param speed is the speed of Ripley and set by the instance variable.
   * @return speed, returns the current speed of Ripley
   */
  public int speed (int speed) {
    // If (speed > opponent speed) {}
    return speed;
  }

  /**
   *
   * Gives information about the health status of Ripley using a getter/setter method.
   *
   * @return health, returns the current health of Ripley
   */
  public int getHealth() {return health;}

  /**
   * Gives information about the player's speed when called using a getter/setter methods.
   *
   * @return speed
   */
  public int getSpeed() {return speed;}

  /**
   * This method gives information about the player's attack damage using a getter/setter method.
   *
   * @return attack
   */
  public int getAttack() {return attack;}

  /**
   * This method returns the string representation of the Ripley class/object when calling the 
   * toString() method or the object itself.
   *
   * @return name
   */
  public String toString() {return name;}
  // FILL IN ANYTHING ELSE YOU NEED HERE

}
