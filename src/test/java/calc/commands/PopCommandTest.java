package calc.commands;

import calc.Context;
import calc.commands.exceptions.ArgumentsNumException;
import calc.commands.exceptions.NotEnoughStackArgsException;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PopCommandTest {
    @Test
    public void PopTestOne() {
        PopCommand commandRunner = new PopCommand();
        Context executionContext = new Context();
        executionContext.push(9.0);
        executionContext.push(0.0);
        executionContext.push(1.0);
        assertEquals(1.0, executionContext.getLastWithoutDeleting());
    }

    @Test
    public void PopTestTwo(){
        PopCommand commandRunner = new PopCommand();
        Context excutionContext = new Context();
        ArrayList<String> executionArguments = new ArrayList<>(Arrays.asList("a"));
        assertThrows(ArgumentsNumException.class, () -> commandRunner.execute(executionArguments, excutionContext));
    }

    @Test
    public void PopTestThree() {
        PopCommand commandRunner = new PopCommand();
        Context executionContext = new Context();
        assertThrows(NotEnoughStackArgsException.class, () -> commandRunner.execute(new ArrayList<>(), executionContext));
    }

    @Test
    public void PopTestFour() {
        PopCommand commandRunner = new PopCommand();
        Context executionContext = new Context();
        executionContext.push(-9.0);
        executionContext.push(100.0);
        executionContext.push(101.0);
        executionContext.pop();
        assertEquals(100.0, executionContext.getLastWithoutDeleting());
    }

    @Test
    public void PopTestFive() {
        PopCommand commandRunner = new PopCommand();
        Context executionContext = new Context();
        executionContext.push(-5.0);
        assertEquals(-5.0, executionContext.getLastWithoutDeleting());
    }
}
