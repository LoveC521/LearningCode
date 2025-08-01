package org.example.case01;

public class HelpCommand implements Command {
    private DisplayHelpClass displayHelpClass;

    public HelpCommand(DisplayHelpClass displayHelpClass) {
        this.displayHelpClass = displayHelpClass;
    }

    @Override
    public void execute() {
        displayHelpClass.display();
    }
}
