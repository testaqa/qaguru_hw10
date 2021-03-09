import com.codeborne.selenide.Configuration;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class DemoQaTests {
    final static TestConfig config = ConfigFactory.create(TestConfig.class, System.getProperties());

    @BeforeAll
    static void beforeAll() {
        Configuration.browser = config.browser();
    }

    @Test
    void SubmitForm() {
        open("https://demoqa.com/automation-practice-form");

        $("h5").shouldHave(text("Student Registration Form"));
    }

}
