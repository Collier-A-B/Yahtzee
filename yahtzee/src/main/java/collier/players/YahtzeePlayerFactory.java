package collier.players;

/**
 * Factory class for creating instances of YahtzeePlayer.
 */
public class YahtzeePlayerFactory {
    private YahtzeePlayerFactory() {
        // Private constructor to prevent instantiation
    }
    
    public static YahtzeePlayer CreatePlayer(String name) {

        return new YahtzeePlayer(name);
    }
}
