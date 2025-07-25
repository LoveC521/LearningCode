package org.example.case02;

import java.util.ArrayList;

public class RTFReader {
    public static void parseRTF(TextConverter textConverter) {
        // 模拟获取 RTF 文本元素列表，索引 0 存储元素类型，索引 1 存储元素
        ArrayList<String[]> elementList = new ArrayList<>();
        elementList.add(new String[]{"CHAR", ""});
        elementList.add(new String[]{"FONT", ""});
        elementList.add(new String[]{"PARA", ""});
        for (String[]  element : elementList) {
            switch (element[0]) {
                case "CHAR" -> textConverter.convertCharacter(element[1]);
                case "FONT" -> textConverter.convertFontChange(element[1]);
                case "PARA" -> textConverter.convertParagraph(element[1]);
            }
        }
    }
}
