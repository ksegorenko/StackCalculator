package calc;

import calc.Context;
import calc.command_factory.CommandFactory;
import calc.command_factory.exceptions.CommandFactoryException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CommandFactoryTest {
    @Test
    public void FactoryTest() throws CommandFactoryException {
        CommandFactory executingFactory = new CommandFactory();
        assertThrows(CommandFactoryException.class, () -> executingFactory.create("TAKE"));
        assertDoesNotThrow(() -> executingFactory.create("PUSH"));
        assertDoesNotThrow(() -> executingFactory.create("POP"));
        assertDoesNotThrow(() -> executingFactory.create("PRINT"));
        assertDoesNotThrow(() -> executingFactory.create("+"));
        assertDoesNotThrow(() -> executingFactory.create("DEFINE"));
    }


}
