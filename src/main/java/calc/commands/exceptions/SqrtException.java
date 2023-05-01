package calc.commands.exceptions;

public class SqrtException extends CommandException{
    public SqrtException() {
        super("It is impossible to take the sqrt of a negative argument.");
    }
}
