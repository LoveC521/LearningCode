package org.example;

public class AdditionExpression implements Expression{
    private final Expression leftExpression;
    private final Expression rightExpression;

    public AdditionExpression(Expression leftExpression, Expression rightExpression) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
    }

    @Override
    public Integer interpret(Context context) {
        return leftExpression.interpret(context) + rightExpression.interpret(context);
    }
}
