package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class FormsPage {
    private final SelenideElement
            practiceFormMenu = $("a[href='/automation-practice-form']");

    public FormsPage openPracticeForm() {
        practiceFormMenu.click();

        return this;
    }
}
