package calc.commands;

import calc.commands.exceptions.*;
import calc.Context;
import java.util.ArrayList;
import java.util.EmptyStackException;
public class AddCommand implements Command {
    @Override
    public void execute(ArrayList<String> Arguments, Context context) throws CommandException {
        try {
            Double value1 = context.pop();
            Double value2 = context.pop();
            Double result = value1 + value2;
            context.push(result);
        }
        catch(EmptyStackException exception) {
            throw new ArgumentsNumException("+");
        }
    }
}
