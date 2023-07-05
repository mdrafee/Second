import com.sun.jdi.PathSearchingVirtualMachine;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WrapsDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LCOATORS {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https:www.tdbank.com");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"button-37fbca6eb5\"]")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("psudoUsername")).sendKeys("mdrafee900");
        driver.findElement(By.id("password")).sendKeys("305071889@Mi");
        Thread.sleep(500);
        driver.findElement(By.id("Log in")).click();



    }//m
}//c
