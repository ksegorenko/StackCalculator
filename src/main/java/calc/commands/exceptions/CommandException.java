package calc.commands.exceptions;

public class CommandException extends Exception {
    public CommandException() {}
    public CommandException(String errorMessage) {
        super(errorMessage);
    }
}
