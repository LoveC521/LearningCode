package org.example.case02;

public class AsciiConverter implements TextConverter{
    @Override
    public void convertCharacter(Object o) {
        System.out.println("字符已转换为 ASCII 格式");
    }

    public AsciiText getAsciiText() {
        return new AsciiText();
    }
}
