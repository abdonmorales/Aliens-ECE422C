 /**
  * An object of class Alien represents an alien in the game.
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
   public Alien(String name, int health, int attack, int speed, int speedDamage) {
    super(name, health, attack, speed);
    this.speedDamage = speedDamage;
   }

   public void fight(Ripley ripley) {
       hit(ripley);
       ripley.slowDown(speedDamage);
   }

  public int getSpeedDamage() {
       return speedDamage;
  }
}
