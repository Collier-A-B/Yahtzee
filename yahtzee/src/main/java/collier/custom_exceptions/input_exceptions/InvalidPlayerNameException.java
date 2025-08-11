package collier.custom_exceptions.input_exceptions;

public class InvalidPlayerNameException extends InvalidInputException {
    public InvalidPlayerNameException() {
        super("Invalid player name provided. Player names must be between 1 and 20 characters long and cannot contain special characters.");
    }

}
