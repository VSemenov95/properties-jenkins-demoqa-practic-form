package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class FormsPage {
    private final SelenideElement
            practiceFormMenu = $("a[href='/automation-practice-form']");

    public void openPracticeForm() {
        practiceFormMenu.click();

    }
}
