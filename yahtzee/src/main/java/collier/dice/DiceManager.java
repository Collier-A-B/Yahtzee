package collier.dice;

import collier.custom_exceptions.game_state_exceptions.InvalidNumberDiceException;

/**
 * Singleton for Dice Manager, which holds dice and all related methods
 */
public class DiceManager {
    private static DiceManager instance;

    private static final int numDice = 5;
    private final int[] dice = new int[numDice];
    private final boolean[] holdDice = new boolean[numDice];

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
        try {
            if (diceIndx > 5 || diceIndx < 0) {
                // throw exception
                throw new InvalidNumberDiceException();
            }
            holdDice[diceIndx] = !holdDice[diceIndx];
            return true;
        } catch (InvalidNumberDiceException e) {
            System.err.println("Dice indx out of bounds: " + e.getMessage());
            return false;
        } catch (Exception e) {
            System.err.println("Unknown exception occured: " + e.getMessage());
            return false;
        }

    }

    public void rollDice() {
        for (int dieIndx = 0; dieIndx < dice.length; dieIndx++) {
            if (!holdDice[dieIndx]) {
                // assign random number between 1 & 6
                int newVal = 0;
                while (newVal < 1 || newVal > 6) {
                    newVal = (int) (Math.random() * 6) + 1;
                }
                dice[dieIndx] = newVal;
            }
        }
    }
}
