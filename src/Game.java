import java.util.List;
 /**
  *
  * The main game logic for Aliens.
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
      * movie Alien! Yet, the classic 1977 Star Wars: A New Hope was even better.
      *
      * @param ripley passes through the Ripley class/object to display Ripley's initial stats as
      *               the game begins.
      * @param rooms passes through the ArrayList of rooms.
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

       /*
        * Uses a boolean true/false trip, to know when to end the game and exit [flagging].
        */
      // With the introduction of the inner while loop, this brings the question if the outer
      // while loop is useful.
       while (isRunning) {
           System.out.printf("%7sWelcome to Alien Attack!\n","");
	       System.out.printf("%7s------------------------\n","");
           // This println() should be okay based on the discussion during recitation.
	       System.out.println(ripley.getName() + " starts with health: " + ripley.getHealth() 
			       + " speed: " + ripley.getSpeed() + " attack: " + ripley.getAttack());

           /*
            * Iterates through the list of rooms, dependent on the text file that provides that
            * information.
            */
           for(int numRooms = 0; numRooms < rooms.size(); numRooms++) {
               Alien alien = rooms.get(numRooms).getAlien();
               String room = rooms.get(numRooms).getName();
               Item item = rooms.get(numRooms).getItem();
               // Ask if the alien will be null or if it would be 0 as initialized in the inputX.txt
               //if (alien.getName() == null) {System.out.println(ripley + " finds " + item);}
               System.out.println("\nRoom: " + room + ". " + ripley.getName() + " encounters a " +
                       alien.getName());
               System.out.printf("%4s" + alien.getName() + " - health: " + alien.getHealth() +
                       " speed: " + alien.getSpeed() + " attack: " + alien.getAttack() +
                       " speed damage: " + alien.getSpeedDamage(), "");
               // Would I need to implement another while loop?
//               while (ripley.getHealth() != 0 || alien.getHealth() != 0){
//                   // TODO: Implement main game logic here.
//                   if (alien.getSpeed() > ripley.getSpeed()) {
//                       // Here the begin the attack
//                       System.out.println(alien + " attacks " + ripley + ", causing " + );
//                       alien.hit(ripley);
//                   } else {
//                       System.out.println(ripley + " attacks " + alien);
//                       ripley.hit(alien);
//                   }
//               }

               /*
                * Checks if the hero/user character is dead, the print this message and break
                */
               if (ripley.isDead()) {
                   System.out.println("\n" + ripley.getName() + "is dead - GAME OVER");
                   break;
               } else {
                   System.out.println("\n" + ripley.getName() + " finds " + item.getName());
               }

           }
           // This implementation might seem excessive
           isRunning = false;
       }

       if (ripley.isAlive()) {System.out.println("\n" + ripley.getName() + " wins!");}
  }

  // Create a tester method for debugging and rigorous testing
}


