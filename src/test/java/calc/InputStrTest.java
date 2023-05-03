package calc;

import org.junit.jupiter.api.Test;
import calc.InputStr;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStrTest {
    @Test
    public void InputStrTestOne() {
        String[] executingArgs = {};
        InputStr executingStream = new InputStr(executingArgs);
        assertEquals(System.in, executingStream.getInStream());
    }

    @Test
    public void InputStrTestTwo() {
        String[] executingArguments = {"src/main/resources/input.txt"};
        InputStr executingStream = new InputStr(executingArguments);
        BufferedReader executingReader = new BufferedReader(new InputStreamReader(executingStream.getInStream()));
        try {
            assertEquals("# Start calculator", executingReader.readLine());
        }
        catch (IOException exception) {
            System.err.println(exception.getMessage());
        }
    }

    @Test
    public void InputStrTestThree() {
        String[] executingArguments = {"no_such_file.txt"};
        InputStr executingStream = new InputStr(executingArguments);
        assertEquals(System.in, executingStream.getInStream());
    }
}
