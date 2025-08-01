package org.example.case01;

public class FunctionButton {
    private Command command;

    public FunctionButton(Command command) {
        this.command = command;
    }

    public void click() {
        System.out.print("单击功能键：");
        command.execute();
    }
}
