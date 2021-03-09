import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class DemoQaTests {

    @BeforeAll
    static void beforeAll() {
        Configuration.browser = System.getProperty("browser", "chrome");
    }

    @Test
    void SubmitForm() {
        open("https://demoqa.com/automation-practice-form");

        $("h5").shouldHave(text("Student Registration Form"));
    }

}
