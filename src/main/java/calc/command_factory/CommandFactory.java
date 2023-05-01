package calc.command_factory;

import calc.command_factory.exceptions.*;
import calc.commands.Command;

import java.util.Properties;
import java.io.IOException;
import java.io.InputStream;
public class CommandFactory {
    private final Properties properties;
    public CommandFactory() throws CommandFactoryException {
        try {
            InputStream inStr = CommandFactory.class.getClassLoader().getResourceAsStream("commands.properties");
            this.properties = new Properties();
            this.properties.load(inStr);
        }
        catch (IOException exception) {
            throw new LoadFactoryException();
        }
    }

    public Command create(String commandName) throws CommandFactoryException {
        try {
            Class<?> newClass = Class.forName(properties.getProperty(commandName));
            return (Command)newClass.newInstance();
        }
        catch(NullPointerException | ClassNotFoundException | InstantiationException | IllegalAccessException exception) {
            throw new FindCommandException(commandName);
        }
    }
}
