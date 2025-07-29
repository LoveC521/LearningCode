package org.example.case02;

public class ASensitiveWordsAdapter implements ISensitiveWordsFilter {
    private final ASensitiveWordsFilter sensitiveWordsFilter;

    public ASensitiveWordsAdapter(ASensitiveWordsFilter sensitiveWordsFilter) {
        this.sensitiveWordsFilter = sensitiveWordsFilter;
    }

    @Override
    public String filter(String text) {
        return sensitiveWordsFilter.filterObsceneWords(sensitiveWordsFilter.filterPoliticalWords(text));
    }
}
