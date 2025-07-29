package org.example.case02;

public class BSensitiveWordsAdapter implements ISensitiveWordsFilter {
    private final BSensitiveWordsFilter sensitiveWordsFilter;

    public BSensitiveWordsAdapter(BSensitiveWordsFilter sensitiveWordsFilter) {
        this.sensitiveWordsFilter = sensitiveWordsFilter;
    }

    @Override
    public String filter(String text) {
        return sensitiveWordsFilter.removeObsceneWords(sensitiveWordsFilter.removePoliticalWords(text));
    }
}
