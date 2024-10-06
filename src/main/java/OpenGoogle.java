import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Random;

public class OpenGoogle {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://dribbble.com/tags/register-page");

        // Find the "Sign up" button
        WebElement signUpButton = driver.findElement(By.linkText("Sign up"));
        signUpButton.click();

        // Find the "Continue with email" button
        WebElement continueWithEmailButton = driver.findElement(By.xpath("//button[contains(text(), 'Continue with email')]"));
        continueWithEmailButton.click();

        // Find the name field
        WebElement nameField = driver.findElement(By.id("user_name"));
        nameField.sendKeys("Wish Hiranya");

        // Find the username field
        WebElement usernameField = driver.findElement(By.id("user_login"));
        usernameField.sendKeys("wishhh");

        // Find the email field
        WebElement emailField = driver.findElement(By.id("user_email"));
        emailField.sendKeys("hiranyawishmi@gmail.com");

        // Find the password field
        WebElement passwordField = driver.findElement(By.id("user_password"));
        passwordField.sendKeys("Wishmi_99");

        // Find the terms checkbox
        WebElement termsCheckbox = driver.findElement(By.id("user_agree_to_terms"));
        termsCheckbox.click();

        // Find the "Create Account" button
        WebElement createAccountButton = driver.findElement(By.name("commit"));
        createAccountButton.click();

        driver.quit();
    }
}