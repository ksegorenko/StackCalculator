package calc;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;

public class ParserTest {
    private Parser executingParser = new Parser();

    @Test
    public void ParserTestOne(){
        String testStr = "DEFINE a 5";
        executingParser.Parsing(testStr);
        assertEquals("DEFINE", executingParser.getCommandName());
        ArrayList<String> exp_args = new ArrayList<>();
        exp_args.add("a");
        exp_args.add("5");
        assertEquals(exp_args.size(), executingParser.getArguments().size());
        for (int i = 0; i < exp_args.size(); ++i) {
            assertEquals(0, exp_args.get(i).compareTo(executingParser.getArguments().get(i)));
        }
    }

    @Test
    public void ParserTestTwo(){
        String testStr = "PUSH 5";
        executingParser.Parsing(testStr);
        assertEquals("PUSH", executingParser.getCommandName());
        ArrayList<String> exp_args = new ArrayList<>();
        exp_args.add("5");
        assertEquals(exp_args.size(), executingParser.getArguments().size());
        for (int i = 0; i < exp_args.size(); ++i) {
            assertEquals(0, exp_args.get(i).compareTo(executingParser.getArguments().get(i)));
        }
    }

    @Test
    public void ParserTestThree(){
        String testStr = "AHQJDHDB 99 0 3 4 4";
        executingParser.Parsing(testStr);
        assertEquals("AHQJDHDB", executingParser.getCommandName());
        ArrayList<String> exp_args = new ArrayList<>();
        exp_args.add("99");
        exp_args.add("0");
        exp_args.add("3");
        exp_args.add("4");
        exp_args.add("4");
        assertEquals(exp_args.size(), executingParser.getArguments().size());
        for (int i = 0; i < exp_args.size(); ++i) {
            assertEquals(0, exp_args.get(i).compareTo(executingParser.getArguments().get(i)));
        }
    }
}
