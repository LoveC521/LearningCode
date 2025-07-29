package org.example;

public class LinuxImp implements ImageImp{
    @Override
    public void doPaint(Matrix m) {
        System.out.print("在 Linux 操作系统中显示图像：");
    }
}
