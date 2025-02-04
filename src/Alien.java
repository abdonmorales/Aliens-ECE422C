 /**
  * An object of class Alien represents an alien in the game.
  *
  * <p>Janurary 28, 2025</p>
  * @author Abdon Morales, am226923,
  * <a href="abdonm@cs.utexas.edu">abdonm@cs.utexas.edu</a>
  *
  */

// FILL IN HERE - This declaration may change in your implementation 
public class Alien extends GameCharacter {
  // FILL IN YOUR INSTANCE VARIABLES HERE
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
   Alien(String name, int health, int attack, int speed, int speedDamage) {
    // FILL IN YOUR CONSTRUCTOR HERE
    super(name, health, attack, speed);
    this.speedDamage = speedDamage;
   }
  
  // FILL IN OTHER METHODS HERE

  public int getSpeedDamage() {
       return speedDamage;
  }
}
