import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OpenGoogle {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/Registration");

        // Fill in the registration form
        WebElement firstNameInput = driver.findElement(By.id("firstname"));
        firstNameInput.sendKeys("John");

        WebElement lastNameInput = driver.findElement(By.id("lastname"));
        lastNameInput.sendKeys("Doe");

        WebElement userNameInput = driver.findElement(By.id("userName"));
        userNameInput.sendKeys("johndoe");

        WebElement passwordInput = driver.findElement(By.id("password"));
        passwordInput.sendKeys("password123");

        Select hobbiesSelect = new Select(driver.findElement(By.id("hobbies")));
        hobbiesSelect.selectByVisibleText("Reading");

        WebElement phoneInput = driver.findElement(By.id("phone"));
        phoneInput.sendKeys("1234567890");

        WebElement emailInput = driver.findElement(By.id("email"));
        emailInput.sendKeys("johndoe@example.com");

        // Submit the registration form
        WebElement submitButton = driver.findElement(By.id("submitbtn"));
        submitButton.click();

        // Close the browser
        driver.quit();
    }
}