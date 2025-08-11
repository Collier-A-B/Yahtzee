package collier.players;

import javax.naming.InvalidNameException;

/**
 * Factory class for creating instances of YahtzeePlayer.
 */
public class YahtzeePlayerFactory {
    private YahtzeePlayerFactory() {
        // Private constructor to prevent instantiation
    }

    /**
     * Creates a new YahtzeePlayer with the given name.
     * 
     * Throws InvalidNameException if the name is null or empty.
     * 
     * @param name the name of the player
     * @return a new YahtzeePlayer instance
     * @throws InvalidNameException if the name is null or empty
     */
    public static YahtzeePlayer CreatePlayer(String name) throws InvalidNameException {
        // Validate the name
        // Name must not be null, empty, or longer than 20 characters
        // Name must only contain alphanumeric characters
        if (name == null || name.isEmpty() || name.length() > 20 || !name.matches(".*[a-zA-Z0-9].*")) {
            throw new InvalidNameException();
        }
        return new YahtzeePlayer(name);
    }
}
