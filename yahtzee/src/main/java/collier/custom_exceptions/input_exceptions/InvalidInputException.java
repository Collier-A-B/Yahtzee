package collier.custom_exceptions.input_exceptions;

import java.io.IOException;

public abstract class InvalidInputException extends IOException {
    protected InvalidInputException(String message) {
        super(message);
    }

}
