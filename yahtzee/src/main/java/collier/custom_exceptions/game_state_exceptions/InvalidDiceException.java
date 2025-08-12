package collier.custom_exceptions.game_state_exceptions;

public abstract class InvalidDiceException extends InvalidGameStateException {
    protected InvalidDiceException(String msg) {
        super(msg);
    }
}
