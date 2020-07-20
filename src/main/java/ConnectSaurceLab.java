import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class ConnectSaurceLab {


    public static final String USERNAME = "madanTamil001";
    public static final String ACCESS_KEY = "cf4e7e39-7d9a-4f37-9376-c5ecd92fe5b8";
    public static final String URL = "https://" + "madanTamil001" + ":" + "cf4e7e39-7d9a-4f37-9376-c5ecd92fe5b8" + "@ondemand.saucelabs.com:443/wd/hub";

    public static void main(String[] args) throws MalformedURLException {
        // TODO Auto-generated method stub

        DesiredCapabilities caps = DesiredCapabilities.chrome();
        caps.setCapability("platform", "Windows 10");
        caps.setCapability("version", "latest");

        WebDriver driver = new RemoteWebDriver(new URL(URL), caps);

        driver.get("https://www.google.com/");
        System.out.println("entered url");
        WebElement srcBox = driver.findElement(By.name("q"));
        srcBox.sendKeys("sauce labs entered successfully");
        System.out.println("entered typekeys");
        srcBox.sendKeys(Keys.ENTER);
        System.out.println("login url successful");
        driver.close();
    }
}
