package calc;
import java.io.*;

public class InputStr {
    public InputStr(String[] args) {
        try {
            if (args.length != 0) {
                this.inStream = new FileInputStream(args[0]);
            }
            else{
                this.inStream = System.in;
            }
        }
        catch (FileNotFoundException exception) {
            System.out.println("Can not read your file. Will use default input stream stdin.\n");
            this.inStream = System.in;
        }
    }

    public InputStream getInStream() {
        return this.inStream;
    }
    private InputStream inStream;
}
