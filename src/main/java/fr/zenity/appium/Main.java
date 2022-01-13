package fr.zenity.appium;

import fr.zenity.appium.Enum.Device;
import fr.zenity.appium.Enum.Plateform;
import fr.zenity.appium.drivers.MobileDriverManager;
import fr.zenity.appium.server.AppiumServer;

public class Main {

    public static void main(String[] args){

        AppiumServer.start();
        MobileDriverManager.getInstance().setDriver(Device.SAMSUMG, Plateform.ANDROID);
        AppiumServer.Stop();
    }
}
