package org.example.case02;

public class AddCommand implements Command {
    private Adder adder;
    private int value;

    public AddCommand(Adder adder) {
        this.adder = adder;
    }

    @Override
    public int execute(int value) {
        this.value = value;
        return adder.add(value);
    }

    @Override
    public int undo() {
        return adder.add(-value);
    }
}
