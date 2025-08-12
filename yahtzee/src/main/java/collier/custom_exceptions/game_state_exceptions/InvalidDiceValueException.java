package collier.custom_exceptions.game_state_exceptions;

public class InvalidDiceValueException extends InvalidDiceException{
    public InvalidDiceValueException() {
        super("Dice values must be integers in the range of [1,6]");
    }
}
