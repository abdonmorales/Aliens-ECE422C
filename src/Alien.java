/**
 * An object of class Alien represents an alien in the game.
 * {@inheritDoc}
 *
 * <p>Janurary 28, 2025</p>
 * @author Abdon Morales, am226923,
 * <a href="abdonm@cs.utexas.edu">abdonm@cs.utexas.edu</a>
 *
 */

public class Alien extends GameCharacter {
  private final int speedDamage;
  
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
    super(name, health, attack, speed);
    this.speedDamage = speedDamage;
   }

   /**
    *
    * This method is for the alien to fight the opponent, in which this case is Ripley or the
    * playable character.
    *
    * @param ripley, is the Ripley object, for the alien to have access and fight Ripley/player.
    */
   public void fight(Ripley ripley) {
       hit(ripley);
       ripley.slowDown(speedDamage);
   }

   /**
    *
    * This method gets the speed damage that the alien can do or cause.
    *
    * @return speedDamage, returns the amount of speed damage that the alien can cause against
    *                      the player
    */
   public int getSpeedDamage() {
       return speedDamage;
  }
}
