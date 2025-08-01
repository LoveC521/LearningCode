package org.example.case02;

public class Main {
    public static void main(String[] args) {
        Adder receiver = new Adder();
        Command command = new AddCommand(receiver);
        CalculatorForm invoker = new CalculatorForm(command);
        invoker.compute(10);
        invoker.compute(5);
        invoker.compute(10);
        invoker.undo();
    }
}
