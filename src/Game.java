import java.util.List;

/**
 * The main game logic for Aliens.
 *
 * <p>January 28, 2025</p>
 *
 * @author Abdon Morales, am226923,
 * <a href="abdonm@cs.utexas.edu">abdonm@cs.utexas.edu</a>
 */
public final class Game {
    private final Ripley ripley;
    private final List<Room> rooms;

    /**
     * This is the main Game Logic method for the game Alien Attack! Based on the 1979 grand slam
     * movie Alien! Yet, the classic 1977 Star Wars: A New Hope was even better.
     *
     * @param ripley passes through the Ripley class/object to display Ripley's initial stats as
     *               the game begins.
     * @param rooms  passes through the ArrayList of rooms.
     */
    public Game(Ripley ripley, List<Room> rooms) {
        this.ripley = ripley;
        this.rooms = rooms;
    }

    /**
     * This method implements the main loop in the game.
     */
    public void play() {
        /*
         * Uses a boolean true/false trip, to know when to end the game and exit [flagging].
         */
        // With the introduction of the inner while loop, this brings the question if the outer
        // while loop is useful.
        System.out.printf("%7sWelcome to Alien Attack!\n", "");
        System.out.printf("%7s------------------------\n", "");
        // This println() should be okay based on the discussion during recitation.
        System.out.println(ripley.getName() + " starts with health: " + ripley.getHealth()
                + " speed: " + ripley.getSpeed() + " attack: " + ripley.getAttack());

        /*
         * Iterates through the list of rooms, dependent on the text file that provides that
         * information.
         */
        for (int numRooms = 0; numRooms < rooms.size(); numRooms++) {
            boolean exitGame = true;
            Alien alien = rooms.get(numRooms).getAlien();
            String room = rooms.get(numRooms).getName();
            Item item = rooms.get(numRooms).getItem();
            System.out.println("\nRoom: " + room + ". " + ripley.getName() + " encounters a " +
                    alien.getName());
            System.out.printf("%4s" + alien.getName() + " - health: " + alien.getHealth() +
                    " speed: " + alien.getSpeed() + " attack: " + alien.getAttack() +
                    " speed damage: " + alien.getSpeedDamage() + "\n", "");
            while (!alien.isDead() && !ripley.isDead()) {
                if (!exitGame) {break;}
                /*
                 * Checks if the player is dead, but we still need to load up that
                 */
                if (ripley.isDead()) {
                    System.out.println("\n" + ripley.getName() + "is dead - GAME OVER");
                    exitGame = false;
                    break;
                }
                // TODO: Implement logic here for the fighting mechanics.
                // Also remember that the print statements are in the GameCharacter() class.
                /*
                 * Checks if the alien is dead, then it prints the message that the alien is defeated
                 * and that the player has found the item.
                 */
                if (alien.isDead() && ripley.isAlive()) {
                    System.out.println("\n" + alien.getName() + " is defeated.");
                    System.out.println(ripley.getName() + " finds " + item.getName());
                    ripley.useItem(item);
                    break;
                }
                if (alien.getSpeed() >= ripley.getSpeed()) {
                    alien.hit(ripley);
                    ripley.slowDown(alien.getSpeedDamage());
                }
                ripley.hit(alien);
                // This implementation might seem excessive

//                if (ripley.isAlive()) {
//                    System.out.println("\n" + ripley.getName() + " wins!");
//                }
            }
        }
    }

    /**
     * This is a test method for the play() method for experimentation and making sure to merge the
     * changes into the play() method after rigorous testing.
     */
    public void playTester() {
        System.out.printf("%7sWelcome to Alien Attack!\n", "");
        System.out.printf("%7s------------------------\n", "");
        System.out.println(ripley.getName() + " starts with health: " + ripley.getHealth()
                + " speed: " + ripley.getSpeed() + " attack: " + ripley.getAttack());
        for (int numRooms = 0; numRooms < rooms.size(); numRooms++) {
            Room room = rooms.get(numRooms);
            final Alien alien = room.getAlien();
            System.out.println("\nRoom: " + room .getName()+ ". " + ripley.getName() +
                    " encounters a " + alien.getName());
            System.out.printf("%4s" + alien.getName() + " - health: " + alien.getHealth() +
                    " speed: " + alien.getSpeed() + " attack: " + alien.getAttack() +
                    " speed damage: " + alien.getSpeedDamage() + "\n", "");

            boolean ripleyTurn = (alien.getSpeed() >= ripley.getSpeed()) ? false : true;
            while (true) {
                if (ripley.isDead()) {
                    System.out.println("\n" + ripley.getName() + " is dead - GAME OVER");
                    return;
                }
                if (alien.isDead()) {
                    System.out.println("\n" + alien.getName() + " is defeated.");
                    break;
                }
                if (ripleyTurn) {
                    ripley.fight(alien);
                } else {
                    alien.fight(ripley);
                }
                ripleyTurn = !ripleyTurn;
            }
            // Check if the player has beaten the alien, if true, then collect the item
            if (ripley.isAlive() && alien.isDead()) {
                final Item item = rooms.get(numRooms).getItem();
                System.out.println(ripley.getName() + " finds " + item.getName());
                ripley.useItem(item);
            }
            // Check if Ripley is
            if (numRooms == rooms.size()-1 && ripley.isAlive()) {
                System.out.println("\n" + ripley.getName() + " wins!");
            }
        }
    }

}


