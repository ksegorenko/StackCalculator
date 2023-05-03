package calc.commands;

import calc.Context;
import calc.commands.exceptions.ArgumentsNumException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class AddCommandTest {
    @Test
    public void AdditionTestOne() {
        AddCommand commandRunner = new AddCommand();
        Context executionContext = new Context();
        executionContext.push(5.0);
        executionContext.push(6.0);
        assertDoesNotThrow(() -> commandRunner.execute(null, executionContext));
        assertEquals(11.0, executionContext.pop());
        assertThrows(ArgumentsNumException.class, () -> commandRunner.execute(null, executionContext));
    }
}

