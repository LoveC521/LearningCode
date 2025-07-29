package org.example.case01;

/**
 * 适配器模式实现：类适配器
 */
public class Main {
    public static void main(String[] args) {
        // 可以使用环境变量或配置文件来优化 ISensitiveWordsFilter 实例的获取
        ISensitiveWordsFilter sensitiveWordsFilter = new ASensitiveWordsAdapter();
        System.out.println(sensitiveWordsFilter.filter(""));
    }
}
