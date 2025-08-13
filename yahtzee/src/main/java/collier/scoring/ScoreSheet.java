package collier.scoring;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import collier.custom_exceptions.input_exceptions.InvalidScoreCategoryException;

public class ScoreSheet {

    // ScoreSheet class to hold the scores for a single player, with indexing for
    // each round
    // e.g. Aces[1] is for the players score in the Aces category for round 2
    // Aces[0] is the player's score in the Aces category for round 1

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
     * Calculates the total score for a specific round index (round number - 1).
     * 
     * @param roundIndex index of the round (0-based)
     * @return the total score for the specified round index
     */
    public int calculateTotalScore(int roundIndex) {
        return -1; // TODO: implement total score calculation
    }

    //
    // Following methods are for choosing a category and updating the score sheet
    //

    /**
     * Choose Aces category for a specific round and update the score sheet.
     * 
     * @param roundIndex  round index (0-based)
     * @param diceValues array of dice values
     * @return true if the category was successfully chosen, false otherwise
     */
    public boolean chooseAces(int roundIndex, int[] diceValues) {
        try {
            if (Aces.size() > roundIndex) {
                throw new InvalidScoreCategoryException();

            }

            // Calculate score for Aces category
            int score = 0;
            for (int value : diceValues) {
                if (value == 1) {
                    score += 1;
                }
            }
            Aces.add(roundIndex, score);
            return true; // Indicating success
        } catch (InvalidScoreCategoryException e) {
            System.err.println(e.getMessage() + ": Aces");
            return false; // Indicating failure, category already used
        } catch (Exception e) {
            System.err.println("Unknown Exception: " + e.getMessage());
            return false; // Indicating failure
        }
    }

    public boolean chooseTwos(int roundIndex, int[] diceValues) {
        try {
            if (Twos.size() > roundIndex) {
                throw new InvalidScoreCategoryException();
            }

            // Calculate score for Twos category
            int score = 0;
            for (int value : diceValues) {
                if (value == 2) {
                    score += 2;
                }
            }
            Twos.add(roundIndex, score);
            return true; // Indicating success
        } catch (InvalidScoreCategoryException e) {
            System.err.println(e.getMessage() + ": Twos");
            return false; // Indicating failure, category already used
        } catch (Exception e) {
            System.err.println("Unknown Exception: " + e.getMessage());
            return false; // Indicating failure
        }
    }

    public boolean chooseThrees(int roundIndex, int[] diceValues) {
        try {
            if (Threes.size() > roundIndex) {
                throw new InvalidScoreCategoryException();
            }

            // Calculate score for Threes category
            int score = 0;
            for (int value : diceValues) {
                if (value == 3) {
                    score += 3;
                }
            }
            Threes.add(roundIndex, score);
            return true; // Indicating success
        } catch (InvalidScoreCategoryException e) {
            System.err.println(e.getMessage() + ": Threes");
            return false; // Indicating failure, category already used
        } catch (Exception e) {
            System.err.println("Unknown Exception: " + e.getMessage());
            return false; // Indicating failure
        }
    }

    public boolean chooseFours(int roundIndex, int[] diceValues) {
        try {
            if (Fours.size() > roundIndex) {
                throw new InvalidScoreCategoryException();
            }

            // Calculate score for Fours category
            int score = 0;
            for (int value : diceValues) {
                if (value == 4) {
                    score += 4;
                }
            }
            Fours.add(roundIndex, score);
            return true; // Indicating success
        } catch (InvalidScoreCategoryException e) {
            System.err.println(e.getMessage() + ": Fours");
            return false; // Indicating failure, category already used
        } catch (Exception e) {
            System.err.println("Unknown Exception: " + e.getMessage());
            return false; // Indicating failure
        }
    }

    public boolean chooseFives(int roundIndex, int[] diceValues) {
        try {
            if (Fives.size() > roundIndex) {
                throw new InvalidScoreCategoryException();
            }

            // Calculate score for Fives category
            int score = 0;
            for (int value : diceValues) {
                if (value == 5) {
                    score += 5;
                }
            }
            Fives.add(roundIndex, score);
            return true; // Indicating success
        } catch (InvalidScoreCategoryException e) {
            System.err.println(e.getMessage() + ": Fives");
            return false; // Indicating failure, category already used
        } catch (Exception e) {
            System.err.println("Unknown Exception: " + e.getMessage());
            return false; // Indicating failure
        }
    }

    public boolean chooseSixes(int roundIndex, int[] diceValues) {
        try {
            if (Sixes.size() > roundIndex) {
                throw new InvalidScoreCategoryException();
            }

            // Calculate score for Sixes category
            int score = 0;
            for (int value : diceValues) {
                if (value == 6) {
                    score += 6;
                }
            }
            Sixes.add(roundIndex, score);
            return true; // Indicating success
        } catch (InvalidScoreCategoryException e) {
            System.err.println(e.getMessage() + ": Sixes");
            return false; // Indicating failure, category already used
        } catch (Exception e) {
            System.err.println("Unknown Exception: " + e.getMessage());
            return false; // Indicating failure
        }
    }

    private int checkNumberOfAKind(int[] diceValues) {
        int[] diceValueOcurrences = new int[6]; // array tracking number of occurences of each dice value (arr[0] = dice
                                                // value 1)

        int maxNumOccurences = 0;
        for (int value : diceValues) {
            diceValueOcurrences[value - 1] += 1;
            if (diceValueOcurrences[value - 1] > maxNumOccurences)
                maxNumOccurences = diceValueOcurrences[value - 1];
        }

        return maxNumOccurences;
    }

    public boolean chooseThreeOfAKind(int roundIndex, int[] diceValues) {
        try {
            if (ThreeOfAKind.size() > roundIndex) {
                throw new InvalidScoreCategoryException();
            }

            // Calculate score for Three of a Kind category
            int score = 0;

            boolean validThreeOfKind = checkNumberOfAKind(diceValues) >= 3;

            if (validThreeOfKind) {
                for (int value : diceValues)
                    score += value;
            }

            ThreeOfAKind.add(roundIndex, score);

            return true; // Indicating success
        } catch (InvalidScoreCategoryException e) {
            System.err.println(e.getMessage() + ": Three of a Kind");
            return false; // Indicating failure, category already used
        } catch (Exception e) {
            System.err.println("Unknown Exception: " + e.getMessage());
            return false; // Indicating failure
        }
    }

    public boolean chooseFourOfAKind(int roundIndex, int[] diceValues) {
        try {
            if (FourOfAKind.size() > roundIndex) {
                throw new InvalidScoreCategoryException();
            }

            // Calculate score for Three of a Kind category
            int score = 0;

            boolean validFourOfKind = checkNumberOfAKind(diceValues) >= 4;

            if (validFourOfKind) {
                for (int value : diceValues)
                    score += value;
            }

            FourOfAKind.add(roundIndex, score);

            return true; // Indicating success
        } catch (InvalidScoreCategoryException e) {
            System.err.println(e.getMessage() + ": four of a Kind");
            return false; // Indicating failure, category already used
        } catch (Exception e) {
            System.err.println("Unknown Exception: " + e.getMessage());
            return false; // Indicating failure
        }
    }

    public boolean chooseFullHouse(int roundIndex, int[] diceValues) {
        try {
            if (FullHouse.size() > roundIndex) {
                throw new InvalidScoreCategoryException();
            }

            int firstNum = diceValues[0];
            int firstNumCount = 0;
            int secondNum = 0;
            int secondNumCount = 0;

            // iterate through and count number of occurences
            // break if dice value does not match first or second num

            for (int i = 1; i < diceValues.length; i++) {
                if (diceValues[i] == firstNum) {
                    firstNumCount++;
                } else if (secondNum == 0) {
                    secondNum = diceValues[i];
                    secondNumCount++;
                } else if (diceValues[i] == secondNum) {
                    secondNum++;
                } else {
                    FullHouse.add(roundIndex, 0);
                    return true;
                }
            }

            if ((firstNumCount == 3 && secondNumCount == 2) || (firstNumCount == 2 && secondNumCount == 3)) {
                FullHouse.add(roundIndex, 25);
            } else {
                FullHouse.add(roundIndex, 0);
            }
            return true;
        } catch (InvalidScoreCategoryException e) {
            System.err.println(e.getMessage() + ": Full House");
            return false; // Indicating failure, category already used
        } catch (Exception e) {
            System.err.println("Unknown Exception: " + e.getMessage());
            return false; // Indicating failure
        }

    }

    public boolean chooseSmallStraight(int roundIndex, int[] diceValues) {
        try {
            if (SmallStraight.size() > roundIndex) {
                throw new InvalidScoreCategoryException();
            }
            Set<Integer> diceSet = new HashSet<>(
                    Arrays.asList(Arrays.stream(diceValues).boxed().toArray(Integer[]::new)));

            if (diceSet.size() >= 4) {
                SmallStraight.add(roundIndex, 30);
            } else {
                SmallStraight.add(roundIndex, 0);
            }
            return true;
        } catch (InvalidScoreCategoryException e) {
            System.err.println(e.getMessage() + ": Small Straight");
            return false; // Indicating failure, category already used
        } catch (Exception e) {
            System.err.println("Unknown Exception: " + e.getMessage());
            return false; // Indicating failure
        }

    }

    public boolean chooseLargeStraight(int roundIndex, int[] diceValues) {
        try {
            if (LargeStraight.size() > roundIndex) {
                throw new InvalidScoreCategoryException();
            }
            Set<Integer> diceSet = new HashSet<>(
                    Arrays.asList(Arrays.stream(diceValues).boxed().toArray(Integer[]::new)));

            if (diceSet.size() >= 5) {
                LargeStraight.add(roundIndex, 30);
            } else {
                LargeStraight.add(roundIndex, 0);
            }
            return true;
        } catch (InvalidScoreCategoryException e) {
            System.err.println(e.getMessage() + ": Large Straight");
            return false; // Indicating failure, category already used
        } catch (Exception e) {
            System.err.println("Unknown Exception: " + e.getMessage());
            return false; // Indicating failure
        }
    }

    public boolean chooseYahtzee(int roundIndex, int[] diceValues) {
        try {
            if (Yahtzee.size() > roundIndex) {
                throw new InvalidScoreCategoryException();
            }

            boolean validYahtzee = checkNumberOfAKind(diceValues) >= 5;

            if (validYahtzee) {
                Yahtzee.add(roundIndex, 50);
            } else {
                Yahtzee.add(roundIndex, 0);
            }
            return true; // Indicating success
        } catch (InvalidScoreCategoryException e) {
            System.err.println(e.getMessage() + ": Yahtzee");
            return false; // Indicating failure, category already used
        } catch (Exception e) {
            System.err.println("Unknown Exception: " + e.getMessage());
            return false; // Indicating failure
        }
    }

    public boolean chooseChance(int roundIndex, int[] diceValues) {
        try {
            if (Chance.size() > roundIndex) {
                throw new InvalidScoreCategoryException();
            }

            int score = 0;
            for(int value : diceValues) {
                score+= value;
            }

            Chance.add(roundIndex, score);
            return true; // Indicating success
        } catch (InvalidScoreCategoryException e) {
            System.err.println(e.getMessage() + ": Yahtzee");
            return false; // Indicating failure, category already used
        } catch (Exception e) {
            System.err.println("Unknown Exception: " + e.getMessage());
            return false; // Indicating failure
        }
    }

    // TODO: Check for a bonus yahtzee at each choice
}
