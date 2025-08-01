package org.example;

public class NumberExpression implements Expression{
    private final Integer value;

    public NumberExpression(Integer value) {
        this.value = value;
    }

    @Override
    public Integer interpret(Context context) {
        return this.value;
    }
}
