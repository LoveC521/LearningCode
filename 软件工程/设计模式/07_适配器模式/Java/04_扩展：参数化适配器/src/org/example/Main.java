package org.example;

/**
 * 参数化适配器实现
 */
public class Main {
    public static void main(String[] args) {
        SensitiveWordsAdapter<ASensitiveWordsFilter> sensitiveWordsAdapter = new SensitiveWordsAdapter<ASensitiveWordsFilter>(
                new ASensitiveWordsFilter()
        );
        sensitiveWordsAdapter.setFilterDelegate(aSensitiveWordsFilter -> {
            return text -> {
                return aSensitiveWordsFilter.filterObsceneWords(aSensitiveWordsFilter.filterPoliticalWords(text));
            };
        });
        System.out.println(sensitiveWordsAdapter.filter(""));
    }
}
