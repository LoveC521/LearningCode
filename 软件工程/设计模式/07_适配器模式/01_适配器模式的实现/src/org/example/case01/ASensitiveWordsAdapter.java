package org.example.case01;

public class ASensitiveWordsAdapter extends ASensitiveWordsFilter implements ISensitiveWordsFilter {
    @Override
    public String filter(String text) {
        return filterObsceneWords(filterPoliticalWords(text));
    }
}
