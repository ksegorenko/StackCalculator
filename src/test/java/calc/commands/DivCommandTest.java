package calc.commands;

import calc.Context;
import calc.commands.exceptions.*;
import calc.commands.exceptions.ArgumentsNumException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DivCommandTest {
    @Test
    public void DivTestOne() {
        DivCommand commandRunner = new DivCommand();
        Context executionContext = new Context();
        executionContext.push(2.0);
        executionContext.push(14.4);
        assertDoesNotThrow(() -> commandRunner.execute(null, executionContext));
        assertEquals(7.2, executionContext.pop());
        assertThrows(ArgumentsNumException.class, () -> commandRunner.execute(null, executionContext));
    }

    @Test
    public void DivTestTwo() {
        DivCommand commandRunner = new DivCommand();
        Context executionContext = new Context();
        executionContext.push(0.0);
        executionContext.push(14.0);
        assertThrows(DivByZeroException.class, () -> commandRunner.execute(null, executionContext));
    }
}
