package org.example;

public class VariableExpression implements Expression{
    private final String name;

    public VariableExpression(String name) {
        this.name = name;
    }

    @Override
    public Integer interpret(Context context) {
        return context.get(name);
    }
}
