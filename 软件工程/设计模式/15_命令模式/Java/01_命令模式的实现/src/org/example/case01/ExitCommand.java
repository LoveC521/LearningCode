package org.example.case01;

public class ExitCommand implements Command{
    private SystemExitClass systemExitClass;

    public ExitCommand(SystemExitClass systemExitClass) {
        this.systemExitClass = systemExitClass;
    }

    @Override
    public void execute() {
        systemExitClass.exit();
    }
}
