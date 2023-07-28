
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Configuration.baseUrl;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.logevents.SelenideLogger.step;

@Tag("simple")
public class VacancyTest extends BaseTest {

    @Test
    void logoMustBeOnThePage() {
        step("Open form", () -> {
            open(baseUrl);
        });
        step("Verify results", () -> {
            $(".t339__blocklogo").shouldBe(visible);
        });
    }

    @Test
    void nameOfVacancyMustBeQa() {
        step("Open form", () -> {
            open(baseUrl);
        });
        step("Verify results", () -> {
            $(".t338__title").shouldHave(text("Middle QA engineer"));
        });
    }

    @Test
    void describeVacancyShouldBeOnThePage() {
        step("Open form", () -> {
            open(baseUrl);
        });
        step("Verify results", () -> {
            $(".t030__title").shouldBe(visible);
        });
    }

    @Test
    void describeCompanyShouldBeOnThePage() {
        step("Open form", () -> {
            open(baseUrl);
        });
        step("Verify results", () -> {
            $(".t487__descr").shouldBe(visible);
        });
    }

    @Test
    void mailShouldBeOnThePage() {
        step("Open form", () -> {
            open(baseUrl);
        });
        step("Verify results", () -> {
            $(".t551__contacts").shouldHave(text("joinus@level.travel"));
        });
    }
}
