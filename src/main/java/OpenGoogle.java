import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenGoogle {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://dribbble.com/tags/register-page");

        // Find the "Sign up" button
        WebElement signUpButton = driver.findElement(By.linkText("Sign up"));

        // Click the "Sign up" button
        signUpButton.click();

        WebElement continueWithEmailButton = driver.findElement(By.xpath("//button[contains(text(), 'Continue with email')]"));
        continueWithEmailButton.click();
    }
}
