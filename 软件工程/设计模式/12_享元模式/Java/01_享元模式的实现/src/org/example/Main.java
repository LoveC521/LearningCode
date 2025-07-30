package org.example;

public class Main {
    public static void main(String[] args) {
        // 获取 3 颗黑棋
        IgoChessman black1 = IgoChessmanFactory.getIgoChessman("b");
        IgoChessman black2 = IgoChessmanFactory.getIgoChessman("b");
        IgoChessman black3 = IgoChessmanFactory.getIgoChessman("b");
        // 获取 2 颗白棋
        IgoChessman white1 = IgoChessmanFactory.getIgoChessman("w");
        IgoChessman white2 = IgoChessmanFactory.getIgoChessman("w");
        // 显示棋子
        black1.display(new Coordinates(1,2));
        black2.display(new Coordinates(3, 4));
        black3.display(new Coordinates(1,3));
        white1.display(new Coordinates(2, 5));
        white2.display(new Coordinates(2, 4));
    }
}
