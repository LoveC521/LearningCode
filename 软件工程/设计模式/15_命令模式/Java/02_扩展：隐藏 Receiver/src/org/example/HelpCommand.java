package org.example;

public class HelpCommand implements Command {
    private DisplayHelpClass displayHelpClass = new DisplayHelpClass();

    @Override
    public void execute() {
        displayHelpClass.display();
    }
}
