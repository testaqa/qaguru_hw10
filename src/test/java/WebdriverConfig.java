import org.aeonbits.owner.Config;

@Config.Sources("classpath:${webdriver}.properties")
@Config.LoadPolicy(Config.LoadType.MERGE)
public interface WebdriverConfig extends Config {

    @Key("browser.name")
    @DefaultValue("chrome")
    String BrowserName();

    @Key("webdriver.url")
    String webdriverUrl();
}
