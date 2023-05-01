package calc.commands.exceptions;

public class NotEnoughStackArgsException extends CommandException{
    public NotEnoughStackArgsException() {
        super("There are not enough arguments in stack. Please check input data.");
    }
}
