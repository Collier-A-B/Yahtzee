package collier.game_management;

/**
 * Singleton Class for managing the game state
 */
public class GameManager {
    private static GameManager instance;

    private int currentPlayerIndx;


    private GameManager() {
        // Initialize game state here
    }

    public static GameManager getInstance() {
        if (instance == null) {
            instance = new GameManager();
        }
        return instance;
    }

}
