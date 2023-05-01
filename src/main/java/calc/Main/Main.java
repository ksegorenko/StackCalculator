package calc.Main;

import calc.Calculator;
import calc.InputStr;
public class Main {
    public static void main(String[] args) {
            InputStr inputStr = new InputStr(args);
            Calculator calculator = new Calculator(inputStr.getInStream());
            calculator.calculate();
    }
}