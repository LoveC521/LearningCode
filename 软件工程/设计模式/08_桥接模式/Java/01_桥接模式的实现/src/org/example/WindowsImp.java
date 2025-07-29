package org.example;

public class WindowsImp implements ImageImp{
    @Override
    public void doPaint(Matrix m) {
        System.out.print("在 Windows 操作系统中显示图像：");
    }
}
