// DO NOT MODIFY THIS FILE 

/** 
 * An instance that loads the character, alien, room, and item information from  a file 
 */
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class GameLoader {

  /**
   * Method called to parse entire file 
   */
  public Game loadGame(String fileName) throws IOException {
          List<String> gameLines = Files.readAllLines(Path.of(fileName));
    final Ripley ripley = parseRipley(gameLines.remove(0));
          List<Room> rooms = new ArrayList<Room>();
          for (String line : gameLines) 
             rooms.add(parseRoom(line));
          return new Game(ripley, rooms);
  }

  /**
   * Method for parsing a non-alien character 
   */
  private Ripley parseRipley(String line) {
    final String[] ripleyParts = line.split(",");
    final String name = ripleyParts[0].trim();
    final Integer health = Integer.parseInt(ripleyParts[1]);
    final Integer attack = Integer.parseInt(ripleyParts[2]);
    final Integer speed = Integer.parseInt(ripleyParts[3]);
    return new Ripley(name, health, attack, speed);
  }

  /**
   * Method for parsing a room  specification
   */
  private Room parseRoom(String line) {
    final String[] roomParts = line.split(",");
    final String roomName = roomParts[0].trim();
    final Alien alien = parseAlien(roomParts);
    final Item item = parseItem(roomParts);
    return new Room(roomName, alien, item);
  }

  /**
   * Method for parsing an alien specification
   */
  private Alien parseAlien(String[] lines) {
    final String name = lines[1].trim();
    final Integer health = Integer.parseInt(lines[2]);
    final Integer attack = Integer.parseInt(lines[3]);
    final Integer speed = Integer.parseInt(lines[4]);
    final Integer speedDamage = Integer.parseInt(lines[5]);
    return new Alien(name, health, attack, speed, speedDamage);
  }

  /**
   * Method for parsing an item specification
   */
  private Item parseItem(String[] lines) {
    final String  name = lines[6].trim();
    final Integer health = Integer.parseInt(lines[7]);
    final Integer attack = Integer.parseInt(lines[8]);
    final Integer speed = Integer.parseInt(lines[9]);
    return new Item(name, health, attack, speed);
  }
}
