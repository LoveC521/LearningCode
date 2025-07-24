package org.example.case02;

import org.example.case01.Chart;
import org.example.case01.ChartFactory;

/**
 * 简单工厂模式：完整版
 */
public class Main {
    public static void main(String[] args) {
        // 使用环境变量优化客户端调用
        Chart chart = ChartFactory.createChart(System.getenv("factory"));
        chart.display();
    }
}
