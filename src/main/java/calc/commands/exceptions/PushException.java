package calc.commands.exceptions;

public class PushException extends CommandException{
    public PushException() {
        super("You try to push incorrect parameter.");
    }
}
