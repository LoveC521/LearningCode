package org.example;

public class Main {
    public static void main(String[] args) {
        ExitCommand command = new ExitCommand();
        FunctionButton invoker = new FunctionButton(command);
        invoker.click();
    }
}
