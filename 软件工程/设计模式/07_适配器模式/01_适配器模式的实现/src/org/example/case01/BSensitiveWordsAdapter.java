package org.example.case01;

public class BSensitiveWordsAdapter extends BSensitiveWordsFilter implements ISensitiveWordsFilter {
    @Override
    public String filter(String text) {
        return removeObsceneWords(removePoliticalWords(text));
    }
}
