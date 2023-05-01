package calc.command_factory.exceptions;

public class LoadFactoryException extends CommandFactoryException{
    public LoadFactoryException() {
        super("Unable to load commands factory");
    }
}
