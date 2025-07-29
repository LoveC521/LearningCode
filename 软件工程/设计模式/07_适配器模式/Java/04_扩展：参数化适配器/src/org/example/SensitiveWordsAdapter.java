package org.example;

import java.util.function.Function;

public class SensitiveWordsAdapter<T> implements ISensitiveWordsFilter{
    private final T t;
    private Function<T, Function<String, String>> filterDelegateGenerator;

    public SensitiveWordsAdapter(T t) {
        this.t = t;
    }

    public void setFilterDelegate(Function<T, Function<String, String>> filterDelegateGenerator) {
        this.filterDelegateGenerator = filterDelegateGenerator;
    }

    @Override
    public String filter(String text) {
        return filterDelegateGenerator.apply(t).apply(text);
    }
}
