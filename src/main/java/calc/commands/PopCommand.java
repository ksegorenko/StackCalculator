package calc.commands;

import calc.commands.exceptions.*;
import calc.Context;
import java.util.ArrayList;
import java.util.EmptyStackException;
public class PopCommand implements Command{
    @Override
    public void execute(ArrayList<String> Arguments, Context context) throws CommandException{
        try {
            if (!Arguments.isEmpty())
                throw new ArgumentsNumException("POP");
            context.pop();
        }
        catch (EmptyStackException exception) {
            throw new NotEnoughStackArgsException();
        }
    }
}
