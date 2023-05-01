package calc.commands.exceptions;

public class DefineException extends CommandException{
    public DefineException(String errorMessage) {
        super("Incorrect definition" + "(" + errorMessage + ")");
    }
}
