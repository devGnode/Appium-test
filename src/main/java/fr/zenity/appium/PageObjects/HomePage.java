package fr.zenity.appium.PageObjects;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import static org.openqa.selenium.support.ui.ExpectedConditions.*;

public class HomePage extends View{

    @AndroidFindBy(className="android.widget.Button")
    private MobileElement isOK;

    @AndroidFindBy(xpath = "//android.view.View[4]")
    private MobileElement registerButton;

    public boolean applicationOk(){
        longWait.until(visibilityOf(isOK));
        return true;
    }

    public void clickOnContinue(){
        shortWait.until(elementToBeClickable(isOK)).click();
    }

    public void clickOnRegistered(){
        shortWait.until(elementToBeClickable(registerButton)).click();
    }

}
