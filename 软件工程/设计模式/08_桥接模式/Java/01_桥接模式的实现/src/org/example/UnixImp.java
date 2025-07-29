package org.example;

public class UnixImp implements ImageImp{
    @Override
    public void doPaint(Matrix m) {
        System.out.print("在 Unix 操作系统中显示图像：");
    }
}
