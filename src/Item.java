/**
 *
 * <p>Simple class to hold item data.</p>
 * 
 * <p>January 28, 2025</p>
 *
 * @author Abdon Morales, am226923,
 * <a href="mailto:abdonm@cs.utexas.edu">abdonm@cs.utexas.edu</a>
 *
 */
final class Item
{
  // Would these be final?
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
      // the constructor is somehow a final method, but IntelliJ throws an error.
      this.name = name;
      this.health = health;
      this.attack = attack;
      this.speed = speed;
  }

  /**
   * 
   * This method gets the information about the health of the item, and access outside the class.
   * 
   * @return health
   */
  public int getHealth() {return health;}

    /**
     * This method gets the attack damage of the item
     *
     * @return attack
     */
  public int getAttack() {return attack;}

    /**
     * This method gets the information about the speed of the item
     *
     * @return speed
     */
  public int getSpeed() {return speed;}

  /**
   * 
   * The method gets the name of the item.
   * 
   * @return name
   */
  public String getName() {return name;}
}



