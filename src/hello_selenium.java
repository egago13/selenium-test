import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class hello_selenium {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\egaku\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.twitter.com");
        driver.manage().window().maximize();
        driver.findElement(By.id("email_container")).sendKeys("egacorelone@gmail.com");

    }
}
