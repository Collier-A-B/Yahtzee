package collier.dice;

/**
 * Singleton for Dice Manager, which holds dice and all related methods
 */
public class DiceManager {
    private static DiceManager instance;

    private final int[] dice = new int[5];
    private final boolean[] holdDice = new boolean[5];

    private DiceManager() {

    }

    public static DiceManager getDiceManager() {
        if (instance == null)
            instance = new DiceManager();
        return instance;
    }

    public void resetDiceHolds() {
        for (int i = 0; i < holdDice.length; i++) {
            holdDice[i] = false;
        }
    }

    public boolean flipDieHoldValue(int diceIndx) {
        if (diceIndx > 5 || diceIndx < 0) {
            // throw exception
            
        }
    }

    public void rollDice() {

    }
}
