package calc.commands;

import calc.Context;
import calc.commands.exceptions.*;
import calc.commands.exceptions.ArgumentsNumException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SqrtCommandTest {
    @Test
    public void SqrtTestOne() {
        SqrtCommand commandRunner = new SqrtCommand();
        Context executionContext = new Context();
        executionContext.push(36.0);
        assertDoesNotThrow(() -> commandRunner.execute(null, executionContext));
        assertEquals(6.0, executionContext.pop());
        assertThrows(ArgumentsNumException.class, () -> commandRunner.execute(null, executionContext));
    }

    @Test
    public void SqrtTestTwo() {
        SqrtCommand commandRunner = new SqrtCommand();
        Context executionContext = new Context();
        executionContext.push(-9.0);
        assertThrows(SqrtException.class, () -> commandRunner.execute(null, executionContext));
    }
}
