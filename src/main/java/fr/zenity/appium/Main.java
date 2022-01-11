package fr.zenity.appium;

import fr.zenity.appium.config.ApplicationProperties;
import fr.zenity.appium.config.PropertiesLoader;
import fr.zenity.appium.drivers.LocalDriver;
import fr.zenity.appium.server.AppiumServer;

import java.io.File;

public class Main {

    public static void main(String[] args){

        AppiumServer.start();
        try {
            new LocalDriver();
            Thread.sleep(140000000);


        }catch (Exception e){ }
        AppiumServer.Stop();
    }
}
