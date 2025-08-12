package collier.game_management;

import collier.custom_exceptions.input_exceptions.InvalidPlayerNameException;
import collier.dice.DiceManager;
import collier.players.YahtzeePlayer;
import collier.players.YahtzeePlayerFactory;
import collier.scoring.ScoreSheet;
import collier.scoring.ScoreSheetFactory;

/**
 * Singleton Class for managing the game state
 */
public class GameManager {
    private static GameManager instance;            // singleton instance of game manager
    private static final int MAX_PLAYERS = 2;       // maximum number of players that a game can support
    private static final int MIN_PLAYERS = 2;       // minimum number of players that a game can support

    private int currentPlayerIndx = 0;              // indx of player whose turn it is
    private int numberOfRolls = 0;                  // number of rolls current player has used
    private int playerCount = 0;                    // number of players in game (must be >= min and <= max)

    private final YahtzeePlayer[] players = new YahtzeePlayer[MAX_PLAYERS];
    private final ScoreSheet[] playerScoreSheets = new ScoreSheet[MAX_PLAYERS];
    private final DiceManager diceManager = DiceManager.getDiceManager();

    private GameManager() {
        // Initialize game state here
    }

    public static GameManager getInstance() {
        if (instance == null) {
            instance = new GameManager();
        }
        return instance;
    }

    public boolean addPlayerToGame() {
        try {
            players[playerCount] = YahtzeePlayerFactory.CreatePlayer("player " + playerCount);       // TODO: Replace with user input
            playerScoreSheets[playerCount] = ScoreSheetFactory.createScoreSheet();
            playerCount++;
            return true;
        } catch(InvalidPlayerNameException e) {
            System.err.println("Unable to add player to game: " + e.getMessage());
            players[playerCount] = null;
            return false;
        }catch (Exception e) {
            System.err.println("Unknown exception occured: " + e.getMessage());
            players[playerCount] = null;
            return false;
        }
        
    }

}
