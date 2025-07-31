package org.example;

public class ProxySearcher implements Searcher{
    private final RealSearcher searcher = new RealSearcher();
    private AccessValidator validator;
    private Logger logger;

    @Override
    public String doSearch(String userId, String keyword) {
        if (validate(userId)) {
            String result = searcher.doSearch(userId, keyword);
            log(userId);
            return result;
        }else {
            return null;
        }
    }

    private boolean validate(String userId) {
        validator = new AccessValidator();
        return validator.validate(userId);
    }

    private void log(String userId) {
        logger = new Logger();
        logger.log(userId);
    }
}
