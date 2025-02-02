 /* Author: YOUR NAME
 * Date: TODAY'S DATE
 * EID: YOUR EID
 */

/**
 *
 * <p>January 28, 2025</p>
 *
 * <p>Simple class to hold item data.</p>
 *
 * @author Abdon Morales, am226923,
 * <a href="mailto:abdonm@cs.utexas.edu">abdonm@cs.utexas.edu</a>
 *
 */
final class Item
{
  private String name;
  private int health;
  private int attack;
  private int speed;

  /**
   *
   * This method is for the item as well as the creation of unique items that can be useful for the
   * main character/player.
   *
   * @param name is the name of the item
   * @param health if the item is some sort of health supplement
   * @param attack if the item inflicts damage such as a force field and other types of items?
   * @param speed is the parameter if the item provides a type of boost for the player in speed.
   */
  Item(String name, int health, int attack, int speed) {
      // FILL IN HERE
      // Will be here for now until, I figure out the rest of the logic.
      this.name = name;
      this.health = health;
      this.attack = attack;
      this.speed = speed;
  }
  // FILL IN WHATEVER ELSE YOU NEED HERE 
}



