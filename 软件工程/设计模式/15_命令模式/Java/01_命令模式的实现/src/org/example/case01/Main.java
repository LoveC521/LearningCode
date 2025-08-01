package org.example.case01;

public class Main {
    public static void main(String[] args) {
        SystemExitClass receiver = new SystemExitClass();
        ExitCommand command = new ExitCommand(receiver);
        FunctionButton invoker = new FunctionButton(command);
        invoker.click();
    }
}
