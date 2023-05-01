package calc.commands;

import calc.commands.exceptions.*;
import calc.Context;
import java.util.ArrayList;

public class DefineCommand implements Command {
    @Override
    public void execute(ArrayList<String> Arguments, Context context) throws CommandException {
        try {
            if (Arguments.size() != 2)
                throw new ArgumentsNumException("DEFINE");
            String definition = parseDefinition(Arguments.get(0));
            Double value = parseDouble(Arguments.get(1));
            context.setDefinition(definition, value);
        }
        catch (IllegalArgumentException exception){
            throw new DefineException(exception.getMessage());
        }
    }

    private String parseDefinition(String str) throws IllegalArgumentException{
        try {
            Double.parseDouble(str);
            throw new IllegalArgumentException("define: " + str);
        }
        catch (NumberFormatException exception){
            return str;
        }
    }

    private Double parseDouble(String str) throws IllegalArgumentException {
        try {
            return Double.parseDouble(str);
        }
        catch (NumberFormatException exception) {
            throw new IllegalArgumentException("value: " + str);
        }
    }
}
