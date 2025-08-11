package collier.players;

import collier.scoring.ScoreSheet;
import collier.scoring.ScoreSheetFactory;

/**
 * Represents a player in the Yahtzee game.
 * This class will contain player-specific logic and attributes.
 */
public class YahtzeePlayer {
    private String name;
    private final ScoreSheet scoreSheet = ScoreSheetFactory.createScoreSheet();

    private YahtzeePlayer() {
    }

    YahtzeePlayer(String name) {
        // Constructor with player name
        this.name = name;
    }
}
