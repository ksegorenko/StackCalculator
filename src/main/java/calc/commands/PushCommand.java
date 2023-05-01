package calc.commands;

import java.util.ArrayList;
import calc.commands.exceptions.*;
import calc.Context;

public class PushCommand implements Command{
    @Override
    public void execute(ArrayList<String> Arguments, Context context) throws CommandException {
        if (Arguments.isEmpty())
            throw new ArgumentsNumException("PUSH");
        for (String argument : Arguments) {
            Double value = parseDouble(argument, context);
            if (value == null) throw new PushException();
            context.push(value);
        }
    }

    private Double parseDouble(String str, Context context) {
        try {
            return Double.parseDouble(str);
        }
        catch(NumberFormatException exception) {
            return context.getDefinition(str);
        }
    }
}
