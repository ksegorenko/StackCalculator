package calc.commands;

import calc.Context;
import calc.commands.exceptions.ArgumentsNumException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MultCommandTest {
    @Test
    public void MultTestOne() {
        MultCommand commandRunner = new MultCommand();
        Context executionContext = new Context();
        executionContext.push(0.0);
        executionContext.push(999.0);
        assertDoesNotThrow(() -> commandRunner.execute(null, executionContext));
        assertEquals(0.0, executionContext.pop());
        assertThrows(ArgumentsNumException.class, () -> commandRunner.execute(null, executionContext));
    }
}
