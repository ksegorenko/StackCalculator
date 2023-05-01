package calc.commands.exceptions;

public class DivByZeroException extends CommandException{
    public DivByZeroException() {
        super("I can not divide into zero.");
    }
}
