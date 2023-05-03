package calc.commands;

import calc.Context;
import calc.commands.exceptions.ArgumentsNumException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SubCommandTest {
    @Test
    public void SubTestOne() {
        SubCommand commandRunner = new SubCommand();
        Context executionContext = new Context();
        executionContext.push(9.0);
        executionContext.push(10.0);
        assertDoesNotThrow(() -> commandRunner.execute(null, executionContext));
        assertEquals(1.0, executionContext.pop());
        assertThrows(ArgumentsNumException.class, () -> commandRunner.execute(null, executionContext));
    }
}
