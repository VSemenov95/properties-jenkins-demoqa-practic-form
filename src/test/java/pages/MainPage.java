package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class MainPage {
    private final SelenideElement
        formsElementMenu = $("a[href='/forms']");

    public void openForms() {
        open("");
        formsElementMenu.click();

    }
}
