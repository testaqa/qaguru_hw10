import org.aeonbits.owner.Config;

@Config.Sources("classpath:webdriver.properties")
public interface TestConfig extends Config {

    @Key("browser")
    @DefaultValue("chrome")
    String BrowserName();
}
