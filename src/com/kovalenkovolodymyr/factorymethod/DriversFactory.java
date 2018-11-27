package com.kovalenkovolodymyr.factorymethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;


public class DriversFactory {
    public static WebDriver getDriver(DriverOption option) {
        switch (option) {
            case CHROME:
                // here goes capabilities and blalbalba
                return new ChromeDriver();
            case FIREFOX:
                // here goes capabilities and blalbalba
                return new FirefoxDriver();
            case IE:
                System.setProperty("webdriver.ie.driver", "resources\\IEDriverServer.exe");
                DesiredCapabilities caps = DesiredCapabilities.internetExplorer();
                caps.setCapability("ignoreZoomSetting", true);
                return new InternetExplorerDriver(caps);
            default:
                throw new IllegalArgumentException("Wrong option");
        }
    }
}