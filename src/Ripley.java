/**
 *
 * <p>Ripley is a character that can fight aliens.</p>
 * <p>January 28, 2025</p>
 *
 * @author Abdon Morales, am226923,
 * <a href="mailto:abdonm@cs.utexas.edu">abdonm@cs.utexas.edu</a>
 *
 */

public class Ripley extends GameCharacter
{

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
    super(name, health, attack, speed);
  }
  
  /**
   * Fight an alien
   *
   * @param alien is the object/class Alien to fight it!
   */
  public void fight(Alien alien) {
    hit(alien);
  }

}
