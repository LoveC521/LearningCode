package org.example;

public class Main {
    public static void main(String[] args) {
        Searcher searcher = ProxyFactory.getProxy(new RealSearcher());
        System.out.println(searcher.doSearch("杨过", "玉女心经"));
    }
}
