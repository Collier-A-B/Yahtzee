package collier.custom_exceptions.game_state_exceptions;

public class InvalidNumberDiceException extends InvalidDiceException{
    public InvalidNumberDiceException() {
        super("There can only be 5 dice in a game of Yahtzee");
    }
}
