import org.aeonbits.owner.Config;

public interface TestConfig extends Config {

    @Key("browser")
    @DefaultValue("chrome")
    String BrowserName();
}
