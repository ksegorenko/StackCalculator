package calc.commands;

import calc.Context;
import calc.commands.exceptions.ArgumentsNumException;
import calc.commands.exceptions.DefineException;
import calc.commands.exceptions.NotEnoughStackArgsException;
import calc.commands.exceptions.PushException;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DefineCommandTest {
    private Context executingContex = new Context();
    private ArrayList<String> args = new ArrayList<String>();
    private DefineCommand commandRunner = new DefineCommand();

    @Test
    public void DefineTestOne() {
        assertThrows(ArgumentsNumException.class, () -> commandRunner.execute(args, executingContex));
    }

    @Test
    public void DefineTestTwo() {
        args.add("a");
        assertThrows(ArgumentsNumException.class, () -> commandRunner.execute(args, executingContex));
    }

    @Test
    public void DefineTestThree() {
        args.add("a");
        args.add("5.5");
        assertDoesNotThrow(() -> commandRunner.execute(args, executingContex));
        assertEquals(5.5, executingContex.getDefinition("a"));
    }

    @Test
    public void DefineTestFour() {
        args.add("5");
        args.add("4");
        assertThrows(DefineException.class, () -> commandRunner.execute(args, executingContex));
    }

    @Test
    public void DefineTestFive() {
        args.add("a");
        args.add("b");
        assertThrows(DefineException.class, () -> commandRunner.execute(args, executingContex));
    }
}
