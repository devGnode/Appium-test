package fr.zenity.appium.Runner;

import fr.zenity.appium.config.Properties;
import fr.zenity.appium.drivers.MobileDriverManager;
import fr.zenity.appium.drivers.utils.LocalDriver;
import fr.zenity.appium.server.AppiumServer;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseRunner extends AbstractTestNGCucumberTests {

    @BeforeTest
    public void setUp(){
        if(!AppiumServer.isRunning()) AppiumServer.start();
        MobileDriverManager
                .getInstance()
                .setDriver(
                    Properties.configuration.getDevice(),
                    Properties.configuration.getMobileOS()
                );
    }


    @AfterTest
    public void tearDown(){
        if(AppiumServer.isRunning()) AppiumServer.Stop();
    }

}