package calc;

import java.util.Arrays;
import java.util.ArrayList;
public class Parser {
    private String commandName;
    private ArrayList<String> Arguments;
    public void Parsing(String str) {
        ArrayList<String> argsList = new ArrayList<>(Arrays.asList(str.split(" ")));
        this.commandName = argsList.get(0);
        argsList.remove(0);
        this.Arguments = argsList;
    }

    public String getCommandName() {
        return this.commandName;
    }

    public ArrayList<String> getArguments() {
        return this.Arguments;
    }

}
