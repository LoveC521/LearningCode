package org.example;

public class ExitCommand implements Command{
    private SystemExitClass systemExitClass = new SystemExitClass();


    @Override
    public void execute() {
        systemExitClass.exit();
    }
}
