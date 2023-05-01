package calc;

import java.io.*;
import calc.command_factory.*;
import calc.command_factory.exceptions.CommandFactoryException;
import calc.commands.*;
import calc.commands.exceptions.CommandException;

public class Calculator {
    private final BufferedReader reader;
    private final Context context;

    public Calculator(InputStream in) {
        this.context =  new Context();
        this.reader = new BufferedReader(new InputStreamReader(in));
    }

    public void calculate(){
        try {
            Parser parser = new Parser();
            CommandFactory commandFactory = new CommandFactory();
            String str;
            while ((str = reader.readLine()) != null) {
                parser.Parsing(str);
                String commandName = parser.getCommandName();
                if (commandName.equals("#"))
                    continue;
                try {
                    Command command = commandFactory.create(commandName);
                    command.execute(parser.getArguments(), context);
                }
                catch (CommandException | CommandFactoryException exception){
                    System.out.println(exception.getMessage());
                }
            }
        }
        catch (IOException exception){
            System.out.println(exception.getMessage());
            System.exit(1);
        }
    }
}
