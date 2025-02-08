// DO NOT CHANGE THIS FILE 
import java.io.IOException;

/** This class is the main entry point for the Alien Attack! game. 
 * It reads the game input from a file, loads the game, and starts the game. 
 */
public class Aliens {

	public static void main(String[] args) throws IOException {
    if((args.length == 0)  || (args == null)) {
      System.out.println("Must provide a filename with game input!");
      System.exit(0);
    }
    /** Load the game parameters and start play */
    new GameLoader().loadGame(args[0]).play();
	}
}
