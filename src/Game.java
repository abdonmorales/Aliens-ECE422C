import java.util.List;

/**
 * The main game logic for Aliens.
 *
 * <p>January 28, 2025</p>
 *
 * @author Abdon Morales, am226923,
 * <a href="abdonm@cs.utexas.edu">abdonm@cs.utexas.edu</a>
 * @version 1.0
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
        System.out.printf("%7sWelcome to Alien Attack!\n", "");
        System.out.printf("%7s------------------------\n", "");
        System.out.println("\n" + ripley.getName() + " starts with health: " + ripley.getHealth()
                + " speed: " + ripley.getSpeed() + " attack: " + ripley.getAttack());

        /*
         * Iterates through the list of rooms, dependent on the text file that provides that
         * information.
         */
        for (int numRooms = 0; numRooms < rooms.size(); numRooms++) {
            Alien alien = rooms.get(numRooms).getAlien();
            String room = rooms.get(numRooms).getName();
            boolean ripleyTurn = (alien.getSpeed() >= ripley.getSpeed()) ? false : true;
            System.out.println("\nRoom: " + room + ". " + ripley.getName() + " encounters a " +
                    alien.getName());
            System.out.printf("%4s" + alien.getName() + " - health: " + alien.getHealth() +
                    " speed: " + alien.getSpeed() + " attack: " + alien.getAttack() +
                    " speed damage: " + alien.getSpeedDamage() + "\n", "");

            /*
             * A forever while loop to keep the game running until there's a generic return to then
             * exit the game as a whole, once the player is defeated.
             */
            while(true) {
                /*
                 * Check if the player is dead, declare that it's "GAME OVER" and exit/return.
                 */
                if (ripley.isDead()) {
                    System.out.println(ripley.getName() + " is dead - GAME OVER!");
                    return;
                }
                /*
                 * Check if the Alien is dead, and that player is alive to declare victory of the
                 * room and for the player to collect the item.
                 */
                if (alien.isDead() && ripley.isAlive()) {
                    System.out.println(alien.getName() + " is defeated!");
                    final Item item = rooms.get(numRooms).getItem();
                    System.out.println(ripley.getName() + " finds " + item.getName());
                    ripley.useItem(item);
                    break;
                }
                /*
                 * Check if it is the player's turn, if true then the player fights first,
                 * if not then Alien fights first.
                 */
                if (ripleyTurn) {
                    ripley.fight(alien);
                } else {
                    alien.fight(ripley);
                }
                ripleyTurn = !ripleyTurn;
            }
            /*
             * Double check if the alien is dead, and make sure that this is the last room,
             * to declare victory
             */
            if (numRooms == rooms.size()-1 && alien.isDead()) {
                System.out.println("\n" + ripley.getName() + " wins!");
            }
        }
    }

    /**
     * This is a test method for the play() method for experimentation and making sure to merge the
     * changes into the play() method after rigorous testing.
     */
//    public void playTester() {
//        System.out.printf("%7sWelcome to Alien Attack!\n", "");
//        System.out.printf("%7s------------------------\n", "");
//        System.out.println(ripley.getName() + " starts with health: " + ripley.getHealth()
//                + " speed: " + ripley.getSpeed() + " attack: " + ripley.getAttack());
//        for (int numRooms = 0; numRooms < rooms.size(); numRooms++) {
//            Room room = rooms.get(numRooms);
//            final Alien alien = room.getAlien();
//            System.out.println("\nRoom: " + room .getName()+ ". " + ripley.getName() +
//                    " encounters a " + alien.getName());
//            System.out.printf("%4s" + alien.getName() + " - health: " + alien.getHealth() +
//                    " speed: " + alien.getSpeed() + " attack: " + alien.getAttack() +
//                    " speed damage: " + alien.getSpeedDamage() + "\n", "");
//
//            boolean ripleyTurn = (alien.getSpeed() >= ripley.getSpeed()) ? false : true;
//            while (true) {
//                if (ripley.isDead()) {
//                    System.out.println("\n" + ripley.getName() + " is dead - GAME OVER");
//                    return;
//                }
//                if (alien.isDead() && ripley.isAlive()) {
//                    System.out.println("\n" + alien.getName() + " is defeated.");
//                    final Item item = rooms.get(numRooms).getItem();
//                    System.out.println(ripley.getName() + " finds " + item.getName());
//                    ripley.useItem(item);
//                    break;
//                }
//                if (ripleyTurn) {
//                    ripley.fight(alien);
//                } else {
//                    alien.fight(ripley);
//                }
//                ripleyTurn = !ripleyTurn;
//            }
//            if (numRooms == rooms.size()-1 && ripley.isAlive()) {
//                System.out.println("\n" + ripley.getName() + " wins!");
//            }
//        }
//    }

}


