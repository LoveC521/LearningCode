package org.example;

public class Main {
    public static void main(String[] args) {
        // JDK 17 及以上版本需要添加 VM 参数 --add-opens java.base/java.lang=ALL-UNNAMED
        Searcher searcher = ProxyFactory.getProxy(new RealSearcher());
        System.out.println(searcher.doSearch("杨过", "玉女心经"));
    }
}
