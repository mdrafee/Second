package ReusuablePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Reusuable_Actions {
    //create a reusable method for WebDriver and chromeoptions
    public static WebDriver setDriver(){
        //setup chrome driver
        //     WebDriverManager wdm= WebDriverManager.chromedriver().setup();
        // WebDriver.chromedriver().setup();
        //declare and define the chrome options
        ChromeOptions options = new ChromeOptions();
        //declare all the arguments you need
        //to maximize my driver
        options.addArguments("start-maximized");
        //options.addArguments("fullscreen"); //for mac users
        //set as incognito mode
        options.addArguments("incognito");
        //set as headless(running the driver on background)
        //options.addArguments("headless");
        //define the web driver you are using
        WebDriver driver = new ChromeDriver(options);
        return  driver;
    }//end of webdriver method


}
