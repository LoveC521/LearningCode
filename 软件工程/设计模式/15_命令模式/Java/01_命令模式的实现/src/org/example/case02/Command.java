package org.example.case02;

public interface Command {
    int execute(int value);
    int undo();
}
