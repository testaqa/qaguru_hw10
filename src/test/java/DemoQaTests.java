import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class DemoQaTests {
    final static TestConfig config = new TestConfig();

    @BeforeAll
    static void beforeAll() {
        Configuration.browser = config.Browser();
    }

    @Test
    void SubmitForm() {
        open("https://demoqa.com/automation-practice-form");

        $("h5").shouldHave(text("Student Registration Form"));
    }

}
