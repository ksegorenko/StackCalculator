package calc;

import calc.Context;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class ContextTest {
    private Context executingContext;
    @BeforeEach
    void prepareContext(){
        executingContext = new Context();
        executingContext.setDefinition("a", 1.0);
        executingContext.setDefinition("b", 1.5);
        executingContext.setDefinition("c", 2.0);
        executingContext.push(1.0);
        executingContext.push(1.5);
        executingContext.push(2.0);
    }

    @Test
    public void ContextTestOne() {
        assertEquals(2.0, executingContext.pop());
        assertNotEquals(2.0, executingContext.pop());
    }

    @Test
    public void ContextTestTwo() {
        assertEquals(2.0, executingContext.getLastWithoutDeleting());
        assertEquals(2.0, executingContext.getLastWithoutDeleting());
    }

    @Test
    public void ContextTestThree() {
        assertEquals(1.0, executingContext.getDefinition("a"));
        assertNotEquals(1.5, executingContext.getDefinition("a"));
        assertEquals(1.5, executingContext.getDefinition("b"));
        assertNotEquals(1.5, executingContext.getDefinition("c"));
        assertEquals(2.0, executingContext.getDefinition("c"));
    }
}

