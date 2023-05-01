package calc.commands;

import java.util.ArrayList;
import java.util.EmptyStackException;

import calc.commands.exceptions.*;
import calc.Context;
public class SqrtCommand implements Command{
    @Override
    public void execute(ArrayList<String> Arguments, Context context) throws CommandException{
        try {
            Double value = context.pop();
            if (value < 0) {
                throw new SqrtException();
            }
            Double result = Math.sqrt(value);
            context.push(result);
        }
        catch(EmptyStackException exception) {
            throw new ArgumentsNumException("SQRT");
        }
    }
}
