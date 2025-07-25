package org.example;

/**
 * 抽象工厂模式实现
 */
public class Main  {
    public static void main(String[] args) {
        // 可以使用环境变量来优化客户端调用
        SkinFactory skinFactory = new SpringSkinFactory();
        Button button = skinFactory.createButton();
        TextField textField = skinFactory.createTextField();
        ComboBox comboBox = skinFactory.createComboBox();
        button.display();
        textField.display();
        comboBox.display();

    }
}
