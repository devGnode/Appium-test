package fr.zenity.appium.PageObjects;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;

import java.awt.*;

import static org.openqa.selenium.support.ui.ExpectedConditions.*;


public class RegisterView extends View{

    @AndroidFindBy(className = "android.view.View")
    private MobileElement registerButton;

   /* @AndroidFindBy(xpath = "//android.widget.ImageView[@text=\"Email\"]")
    private MobileElement emailText;*/

    public void setEmailText(String mailto){
        longWait.until(elementToBeClickable(By.xpath("//android.widget.ImageView[@text=\"Email\"]"))).click();
        driver.findElement(By.xpath("//android.widget.ImageView[@text=\"Email\"]")).sendKeys(mailto);
        driver.findElement(By.xpath("//android.widget.ImageView[@text=\"Email\"]")).getText();
    }
}
