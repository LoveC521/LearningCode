package org.example.case02;

public class MarkdownConverter implements TextConverter{
    @Override
    public void convertCharacter(Object o) {
        System.out.println("字符已转换为 Markdown 格式");
    }

    @Override
    public void convertFontChange(Object o) {
        System.out.println("字体已转换为 Markdown 格式");
    }

    @Override
    public void convertParagraph(Object o) {
        System.out.println("段落已转换为 Markdown 格式");
    }

    public MarkdownText getMarkdownText() {
        return new MarkdownText();
    }
}
