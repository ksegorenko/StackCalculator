package calc.commands;

import calc.Context;
import calc.commands.exceptions.ArgumentsNumException;
import calc.commands.exceptions.NotEnoughStackArgsException;
import calc.commands.exceptions.PushException;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PushCommandTest {
    private Context executingContext = new Context();
    private ArrayList<String> args = new ArrayList<String>();
    private PushCommand commandRunner = new PushCommand();

    @Test
    public void PushTestOne(){
        assertThrows(ArgumentsNumException.class, () -> commandRunner.execute(args, executingContext));
    }

    @Test
    public void PushTestTwo(){
        args.add("0");
        args.add("");
        assertThrows(PushException.class, () -> commandRunner.execute(args, executingContext));
    }
}
