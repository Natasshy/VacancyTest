import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Configuration.baseUrl;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class VacancyTest extends BaseTest {

    @Test
    void logoMustBeOnThePage() {
        open(baseUrl);
        $(".t339__blocklogo").shouldBe(visible);
    }

    @Test
    void nameOfVacancyMustBeQa() {
        open(baseUrl);
        $(".t338__title").shouldHave(text("Middle QA engineer"));
    }
    @Test
    void describeVacancyShouldBeOnThePage() {
        open(baseUrl);
        $(".t004").shouldBe(visible);
    }

    @Test
    void describeCompanyShouldBeOnThePage() {
        open(baseUrl);
        $(".t487__descr").shouldBe(visible);
    }
    @Test
    void mailShouldBeOnThePage() {
        open(baseUrl);
        $(".t551__contacts").shouldHave(text("joinus@level.travel"));
    }
}
