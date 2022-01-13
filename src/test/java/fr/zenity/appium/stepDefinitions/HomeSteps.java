package fr.zenity.appium.stepDefinitions;

import fr.zenity.appium.PageObjects.HomePage;
import io.cucumber.java8.En;
import io.cucumber.java8.Th;

public class HomeSteps implements En {

    public HomeSteps(HomePage homePage){

        Given("^I go to login view$", () -> {
           assert homePage.applicationOk();
           homePage.clickOnContinue();
            homePage.clickOnRegistered();
        });

        Given("^I click on registered button$", () -> {
            homePage.clickOnRegistered();
            try {
                Thread.sleep(15000);
            }catch (Exception e){}
        });
    }
}