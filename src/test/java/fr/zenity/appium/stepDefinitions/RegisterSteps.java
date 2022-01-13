package fr.zenity.appium.stepDefinitions;

import fr.zenity.appium.PageObjects.HomePage;
import io.cucumber.java8.En;

public class RegisterSteps implements En {

    public RegisterSteps(HomePage homePage){

        Given("I navigate to register view",()->{
            assert homePage.applicationOk();
            homePage.clickOnContinue();
            homePage.clickOnRegistered();
        });
    }
}
