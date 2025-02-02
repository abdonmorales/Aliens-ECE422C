 /* Author: YOUR NAME
 * Date: TODAY'S DATE
 * EID: YOUR EID
 */

import java.util.List;
 /**
  *
  * The main game logic.
  *
  * <p>January 28, 2025</p>
  *
  * @author Abdon Morales, am226923,
  * <a href="abdonm@cs.utexas.edu">abdonm@cs.utexas.edu</a>
  *
  */
 public final class Game {
  private final Ripley ripley;
  private final List<Room> rooms;

     /**
      *
      * This is the main Game Logic method for the game Alien Attack! Based on the 1979 grand slam
      * movie Alien! Yet, the classis 1977 Star Wars: A New Hope was even better.
      *
      * @param ripley passes through the Ripley class/object to display Ripley's initial stats as
      *               the game begins.
      * @param rooms passes through the ArrayList of rooms to
      */
  public Game(Ripley ripley, List<Room> rooms) {
    this.ripley = ripley;
    this.rooms = rooms;
  }
  
  /**
   * This method implements the main loop in the game.
   */
  public void play(){
       // FILL IN THE MAIN LOOP FOR GAME PLAY HERE
       boolean isRunning = true;
       while (isRunning) {
	       System.out.println("\t\t\t Welcome to Alien Attack!");
	       System.out.println("\t\t\t ------------------------\n");
	       System.out.println(ripley.toString() + " starts with health: " + ripley.getHealth() 
			       + " speed: " + ripley.getSpeed() + " attack: " + ripley.getAttack());
           isRunning = false;
           for(int numRooms = 0; numRooms < rooms.size(); numRooms++) {
               Alien alien = rooms.get(numRooms).getAlien();
               String room = rooms.get(numRooms).toString();
               System.out.println("\n Room: " + room + ". " + ripley + " encounters a " + alien);
               System.out.println("\t\t" + alien + " - health: " + alien.getHealth() + " speed: "
                       + alien.getSpeed() + " attack: " + alien.getAttack() + " speed damage: "
                       + alien.getSpeedDamage());
           }
       }
       System.out.println("Game not implemented yet!");
  }
}


