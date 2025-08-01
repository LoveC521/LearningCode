package org.example;

public class Main {
    public static void main(String[] args) {
        // 设置变量的值
        Context context = new Context();
        context.put("a", 1);
        context.put("bc", 5);
        context.put("c", 8);
        Parser parser = new Parser("a + bc - 5 + c + 55");
        Expression expression = parser.parse();

        // 解释
        System.out.println(expression.interpret(context));
    }

}

class Parser {
    private final String input;
    private int pos = 0;

    public Parser(String input) {
        this.input = input;
    }

    public Expression parse() {
        skipWhitespace();
        Expression result = parseTerm();

        while (pos < input.length()) {
            skipWhitespace();
            char op = input.charAt(pos);
            if (op == '+' || op == '-') {
                pos++; // 消费 '+' 或 '-'
                Expression right = parseTerm();
                result = (op == '+')
                        ? new AdditionExpression(result, right)
                        : new SubtractionExpression(result, right);
            } else {
                break;
            }
        }

        return result;
    }

    private Expression parseTerm() {
        skipWhitespace();
        if (pos >= input.length()) {
            throw new RuntimeException("表达式不完整，缺少操作数");
        }

        char c = input.charAt(pos);
        if (Character.isLetter(c)) {
            // 解析变量名（字母开头，后接字母或数字）
            int start = pos;
            while (pos < input.length() && Character.isLetterOrDigit(input.charAt(pos))) {
                pos++;
            }
            String name = input.substring(start, pos);
            return new VariableExpression(name);
        } else if (Character.isDigit(c)) {
            // 解析数字
            int start = pos;
            while (pos < input.length() && Character.isDigit(input.charAt(pos))) {
                pos++;
            }
            int value = Integer.parseInt(input.substring(start, pos));
            return new NumberExpression(value);
        } else {
            throw new RuntimeException("非法字符: '" + c + "' at position " + pos);
        }
    }

    private void skipWhitespace() {
        while (pos < input.length() && Character.isWhitespace(input.charAt(pos))) {
            pos++;
        }
    }
}