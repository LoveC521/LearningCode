package org.example;

public class Main {
    public static void main(String[] args) {
        // 可以使用环境变量优化 Searcher 实例的获取
        Searcher searcher = new ProxySearcher();
        System.out.println(searcher.doSearch("杨过", "玉女心经"));
    }
}
