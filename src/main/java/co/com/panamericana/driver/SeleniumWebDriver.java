package co.com.panamericana.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class SeleniumWebDriver {
    public static WebDriver driver;
    public static void chromeDriver(String url){

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--ignore-certificate-errors");
        options.addArguments("--disable-infobars");
        options.addArguments("--incognito");

        driver = new ChromeDriver(options);
        driver.get(url);

}

    public static void fireFoxDriver(String Url){
        FirefoxOptions options = new FirefoxOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--ignore-certificate-errors");
        options.addArguments("--disable-infobars");
        options.addArguments("--incognito");
        driver = new FirefoxDriver(options);
        driver.get(Url);

    }
    //este codigo compartido con el profe Mateo
   /* public static void firefoxDriver (String url){
        driver = new FirefoxDriver();
        driver.get(url);
    }
    */

}
