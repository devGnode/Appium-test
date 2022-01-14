package fr.zenity.appium.stepDefinitions;

import fr.zenity.appium.PageObjects.HomePage;
import fr.zenity.appium.PageObjects.RegisterView;
import io.cucumber.java8.En;

public class RegisterSteps implements En {

    public RegisterSteps(
            HomePage homePage,
            RegisterView registerView
            ){

        Given("I navigate to register view",()->{
            assert homePage.applicationOk();
            homePage.clickOnContinue();
            homePage.clickOnRegistered();
        });

        When("I set mailto",()->{
            registerView.setEmailText("test@yopmail.com");
            try {
                Thread.sleep(5000);
            }catch (Exception e){}
        });
    }
}
