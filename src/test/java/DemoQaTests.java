import com.codeborne.selenide.Configuration;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class DemoQaTests {
    final static WebdriverConfig config = ConfigFactory.create(WebdriverConfig.class, System.getProperties());

    @BeforeAll
    static void beforeAll() {
        Configuration.browser = config.BrowserName();

        if (System.getProperty("webdriver").equals("remote")) {
            Configuration.remote = config.webdriverUrl();
            Configuration.browserVersion = config.browserVersion();

            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("enableVNC", true);
            capabilities.setCapability("enableVideo", true);
            Configuration.browserCapabilities = capabilities;
        }
    }

    @Test
    void submitForm() {
        open("https://demoqa.com/automation-practice-form");

        $("h5").shouldHave(text("Student Registration Form"));
    }

}
