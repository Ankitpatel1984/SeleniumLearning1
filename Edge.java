package webbrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Edge {
    public static void main(String[] args) {
       System.setProperty("webdriver.edge.driver","C:\\Software\\Driver\\Edge\\msedgedriver.exe");
      WebDriver driver = new EdgeDriver();
        driver.get("https://demo.nopcommerce.com/");


    }
}
