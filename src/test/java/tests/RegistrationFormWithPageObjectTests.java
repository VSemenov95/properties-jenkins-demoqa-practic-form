package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.RegistrationPage;

class RegistrationFormWithPageObjectTests extends TestBase{
       RegistrationPage registrationPage = new RegistrationPage();
       TestData testData = new TestData();

    @Test
    @DisplayName("Проверка регистрации с заполнением всех полей")
    void successfulRegistrationTest() {

        registrationPage
            .openPage()
            .removeBanner()
            .setFirstName(testData.firstName)
            .setLastName(testData.lastName)
            .setEmail(testData.email)
            .setGender(testData.gender)
            .setUserNumber(testData.phoneNumber)
            .setDateOfBirth(testData.day,testData.month,testData.year)
            .setSubject(testData.subjects)
            .setHobbies(testData.hobbies)
            .uploadPicture(testData.picture)
            .setCurrentAddress(testData.fullAddress)
            .setStateAndCity(testData.state, testData.city)
            .clickSubmitButton();

        registrationPage
             .checkResult("Student Name", testData.fullName)
             .checkResult("Student Email", testData.email)
             .checkResult("Gender", testData.gender)
             .checkResult("Mobile", testData.phoneNumber)
             .checkResult("Date of Birth", testData.dateBirth)
             .checkResult("Subjects", testData.subjects)
             .checkResult("Hobbies", testData.hobbies)
             .checkResult("Picture", testData.picture)
             .checkResult("Address", testData.fullAddress)
             .checkResult("State and City", testData.state + " " + testData.city);
    }

    @Test
    @DisplayName("Проверка регистрации с заполнением только обязательных полей")
    void successfulFillingRequiredFieldsForm() {
        registrationPage
                .openPage()
                .removeBanner()
                .setFirstName(testData.firstName)
                .setLastName(testData.lastName)
                .setGender(testData.gender)
                .setUserNumber(testData.phoneNumber)
                .clickSubmitButton();

        registrationPage
                .checkResult("Student Name", testData.fullName)
                .checkResult("Gender", testData.gender)
                .checkResult("Mobile", testData.phoneNumber);
    }

    @Test
    @DisplayName("Проверка с незаполненным полем First Name")

    void checkRegistrationWithoutFirstName() {
        registrationPage
                .openPage()
                .removeBanner()
                .setFirstName("")
                .setLastName(testData.lastName)
                .setGender(testData.gender)
                .setUserNumber(testData.phoneNumber)
                .clickSubmitButton()
                .checkTitleForm();
    }
}

