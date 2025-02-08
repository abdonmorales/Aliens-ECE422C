/**
 *
 * <p>Simple class to hold the room's data.</p>
 *
 * <p>January 29, 2025</p>
 *
 * @author Abdon Morales, am226923,
 * <a href="mailto:abdonm@cs.utexas.edu">abdonm@cs.utexas.edu</a>
 *
 */
final class Room 
{ 
  private String name;
  private Alien alien; 
  private Item item;

  /**
   *
   * This is the constructor method for the final class Room(). This also initializes the instance
   * variables of name, alien, and item for them to be accessible to the class and accessors
   * methods.
   *
   * @param name, the name of the room.
   * @param alien, the alien [the alien object] in the room.
   * @param item, the item [item object] in the room that the alien is trying to protect.
   */
  public Room(String name, Alien alien, Item item) {
    this.name = name;
    this.alien = alien;
    this.item = item;
  }

  /**
   * This method gets the information of the alien in the room and accesses to the alien()'s method
   * to another method via a getter call.
   *
   * @return alien, returns the alien [or the alien object].
   */
  public Alien getAlien() {return alien;}

  /**
   * This method gets information of the item in the room and access to the item's methods via a
   * getter/setter call, which in this case is only getter methods.
   *
   * @return item, returns the item [or the item object].
   */
  public Item getItem() {return item;}

  /**
   * This method gets the name of the room.
   *
   * @return name, returns the name of the room.
   */
  public String getName() {return name;}
}



