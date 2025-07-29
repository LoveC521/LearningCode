package org.example;

public class Main {
    public static void main(String[] args) {
        // 可以使用配置文件来优化 Image、WindowsImp 实例的获取
        Image image = new JPGImage();
        WindowsImp windowsImp = new WindowsImp();
        image.setImp(windowsImp);
        image.parseFile("小龙女");
    }
}
