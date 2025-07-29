package org.example.case02;

/**
 * 适配器模式实现：对象适配器
 */
public class Main {
    public static void main(String[] args) {
        // 可以使用环境变量或配置文件来优化 ISensitiveWordsFilter 实例的获取
        ISensitiveWordsFilter sensitiveWordsFilter = new ASensitiveWordsAdapter(
                new ASensitiveWordsFilter()
        );
        System.out.println(sensitiveWordsFilter.filter(""));
    }
}
