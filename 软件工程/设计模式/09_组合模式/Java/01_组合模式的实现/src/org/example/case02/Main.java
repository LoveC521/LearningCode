package org.example.case02;

/**
 * 演示安全组合模式的实现
 */
public class Main {
    public static void main(String[] args) {
        Folder folder1 = new Folder("Sunny 的资料");
        Folder folder2 = new Folder("图像文件");
        Folder folder3 = new Folder("文本文件");
        Folder folder4 = new Folder("视频文件");

        AbstractFile file1 = new ImageFile("小龙女.jpg");
        AbstractFile file2 = new ImageFile("张无忌.gif");
        AbstractFile file3 = new ImageFile("九阴真经.txt");
        AbstractFile file4 = new ImageFile("葵花宝典.doc");
        AbstractFile file5 = new ImageFile("笑傲江湖.rmvb");

        folder2.add(file1);
        folder2.add(file2);
        folder3.add(file3);
        folder3.add(file4);
        folder4.add(file5);
        folder1.add(folder2);
        folder1.add(folder3);
        folder1.add(folder4);

        folder1.killVirus();
    }
}
