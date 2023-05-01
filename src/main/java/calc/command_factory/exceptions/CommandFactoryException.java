package calc.command_factory.exceptions;

import java.io.IOException;

public class CommandFactoryException extends IOException{
        public CommandFactoryException (String errorMessage) {
            super(errorMessage);
        }
}
