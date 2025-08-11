package collier.players;

/**
 * Represents a player in the Yahtzee game.
 * This class will contain player-specific logic and attributes.
 */
public class YahtzeePlayer {
    private String name;

    private YahtzeePlayer() {
    }

    YahtzeePlayer(String name) {
        // Constructor with player name
        this.name = name;
    }
}
