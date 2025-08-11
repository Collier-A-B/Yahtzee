package collier.scoring;

public class ScoreSheetFactory {
    private ScoreSheetFactory(){}

    /**
     * Factory method to create a new ScoreSheet instance.
     *
     * @return a new ScoreSheet object
     */
    public static ScoreSheet createScoreSheet() {
        return new ScoreSheet();
    }
}
