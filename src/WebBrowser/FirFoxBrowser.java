package WebBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class FirFoxBrowser {

    public static void main(String[] args) {

        String baseUrl = "https://www.harrow.gov.uk/";

        System.setProperty("webdriver.gecko.driver","drivers/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get(baseUrl);
        System.out.println(driver.getTitle());
        driver.close();
    }
}