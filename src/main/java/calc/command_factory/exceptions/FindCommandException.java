package calc.command_factory.exceptions;

public class FindCommandException extends CommandFactoryException{
    public FindCommandException(String commandName) {
        super("There is no such command.");
    }
}
