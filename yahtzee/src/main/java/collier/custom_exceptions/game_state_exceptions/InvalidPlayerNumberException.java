package collier.custom_exceptions.game_state_exceptions;

public class InvalidPlayerNumberException extends InvalidGameStateException {
    public InvalidPlayerNumberException() {
        super("Invalid number of players. The game requires 2 players.");
    }

}
