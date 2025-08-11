package collier.custom_exceptions.input_exceptions;

public class InvalidScoreCategoryException extends InvalidInputException {
    public InvalidScoreCategoryException() {
        super("Scoring category has already been used.");
    }

}
