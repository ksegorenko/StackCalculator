package calc.commands;

import java.util.ArrayList;
import calc.commands.exceptions.*;
import calc.Context;

public interface Command {
    void execute(ArrayList<String> Arguments, Context context) throws CommandException;
}
