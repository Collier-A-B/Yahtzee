package collier.scoring;

import java.util.ArrayList;
import java.util.List;

public class ScoreSheet {

    // ScoreSheet class to hold the scores for a single player, with indexing for
    // each game
    // e.g. Aces[1] is for the players score in the Aces category for game 2
    // Aces[0] is the player's score in the Aces category for game 1

    // Upper section categories
    private final List<Integer> Aces = new ArrayList<>();
    private final List<Integer> Twos = new ArrayList<>();
    private final List<Integer> Threes = new ArrayList<>();
    private final List<Integer> Fours = new ArrayList<>();
    private final List<Integer> Fives = new ArrayList<>();
    private final List<Integer> Sixes = new ArrayList<>();

    // Lower section categories
    private final List<Integer> ThreeOfAKind = new ArrayList<>();
    private final List<Integer> FourOfAKind = new ArrayList<>();
    private final List<Integer> FullHouse = new ArrayList<>();
    private final List<Integer> SmallStraight = new ArrayList<>();
    private final List<Integer> LargeStraight = new ArrayList<>();
    private final List<Integer> Yahtzee = new ArrayList<>();
    private final List<Integer> Chance = new ArrayList<>();

    private List<Integer> totalScore = new ArrayList<>();

    ScoreSheet() {
        // package-private constructor to prevent instantiation from outside factory
    }

    /**
     * Calculates the total score for a specific game index (game number - 1).
     * @param gameIndex index of the game (0-based)
     * @return  the total score for the specified game index
     */
    public int calculateTotalScore(int gameIndex) {
        return -1; // TODO: implement total score calculation
    }

    public boolean chooseAces(int gameIndex, int[] diceValues) {
        // Calculate score for Aces category
        int score = 0;
        for (int value : diceValues) {
            if (value == 1) {
                score += 1;
            }
        }
        Aces.add(gameIndex, score);
        return true; // Indicating success
    }

}
