package collier.custom_exceptions.game_state_exceptions;

public abstract class InvalidGameStateException extends Exception {
    protected InvalidGameStateException(String message) {
        super(message);
    }
}
