package org.example.case02;

/**
 * 建造者模式：实现方式二
 */
public class Main {
    public static void main(String[] args) {
        AsciiConverter converter = new AsciiConverter();
        RTFReader.parseRTF(converter);
        System.out.println(converter.getAsciiText());
    }
}
