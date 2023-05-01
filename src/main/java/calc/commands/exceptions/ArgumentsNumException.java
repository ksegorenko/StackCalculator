package calc.commands.exceptions;

public class ArgumentsNumException extends CommandException {
    public ArgumentsNumException(String commandName) {
        super("Wrong number of arguments in command " + commandName);
    }
}
