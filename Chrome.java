package webbrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Chrome {
    public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:\\Software\\Driver\\chromedriver-win64\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");

    }
}
