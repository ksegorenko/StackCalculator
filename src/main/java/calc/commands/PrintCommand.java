package calc.commands;

import calc.commands.exceptions.*;
import calc.Context;
import java.util.ArrayList;
import java.util.EmptyStackException;

public class PrintCommand implements Command{
    @Override
    public void execute(ArrayList<String> Arguments, Context context) throws CommandException {
        try{
            Double value = context.getLastWithoutDeleting();
            System.out.println(value);
        }
        catch(EmptyStackException exception) {
            throw new NotEnoughStackArgsException();
        }
    }
}
