 /* Author: YOUR NAME
 * Date: TODAY'S DATE
 * EID: YOUR EID
 */

import java.util.List;
 /**
  *
  * <p>January 28, 2025</p>
  *
  * The main game logic.
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
      * movie Alien!
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
       protected boolean isRunning = true;
       while (isRunning) {
	       System.out.println("\t\t\t Welcome to Alien Attack!");
	       Sytem.out.println("\t\t\t ------------------------\n");
	       System.out.println(ripley.toString() + " starts with health: " + ripley.getHealth() 
			       + " speed: " + ripley.getSpeed() + " attack: " + ripley.getAttack());
       }
       System.out.println("Game not implemented yet!");
  }
}


