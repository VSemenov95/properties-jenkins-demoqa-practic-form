package config;

public class BuildConfig {
    private final String browserName = System.getProperty("browser", "chrome");
    private final String browserSize = System.getProperty("browserSize", "1920x1080");
    private final String browserVersion = System.getProperty("browserVersion", "127");
    private final String baseUrl = System.getProperty("baseUrl", "https://demoqa.com");
    private final String remoteUrl = System.getProperty("remoteUrl", "https://user1:1234@selenoid.autotests.cloud/wd/hub");
    private final Long timeout = Long.valueOf(System.getProperty("timeout", "5000"));
    private final String pageLoadStrategy = System.getProperty("pageLoadStrategy", "eager");
    private final String isHeadless = System.getProperty("isHeadless", "false");

    public String getIsHeadless() {
        return isHeadless;
    }


    public String getPageLoadStrategy() {
        return pageLoadStrategy;
    }

    public long getTimeout() {
        return timeout;
    }

    public String getRemoteUrl() {
        return remoteUrl;
    }

    public String getBaseUrl() {
        return baseUrl;
    }

    public String getBrowserVersion() {
        return browserVersion;
    }

    public String getBrowserSize() {
        return browserSize;
    }

    public String getBrowserName() {
        return browserName;
    }
}