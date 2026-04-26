import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/login");

        // Enter username
        driver.findElement(By.id("username")).sendKeys("tomsmith");

        // Enter password
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");

        // Click login
        driver.findElement(By.cssSelector("button[type='submit']")).click();

        System.out.println("Login executed successfully 🔥");

        driver.quit();
    }
}