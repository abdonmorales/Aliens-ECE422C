/**
 *
 * <p>Simple class to hold the room's data</p>
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
   * @param name, the name of the room
   * @param alien, the name of the alien in the room
   * @param item, the name of the item in the room and that the alien is trying to protect.
   */
  public Room(String name, Alien alien, Item item) {
     // FILL IN HERE
    this.name = name;
    this.alien = alien;
    this.item = item;
  }

  //FILL IN ANYTHING ELSE YOU NEED HERE

  public Alien getAlien() {return alien;}

  public Item getItem() {return item;}

  public String toString() {return name;}
}



