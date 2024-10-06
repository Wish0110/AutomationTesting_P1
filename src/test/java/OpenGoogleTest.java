import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.Random;

public class OpenGoogleTest {

    @Test

    public void googleTest(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://dribbble.com/tags/register-page");

        // Find the "Sign up" button
        WebElement signUpButton = driver.findElement(By.linkText("Sign up"));
        signUpButton.click();

        // Find the "Continue with email" button
        WebElement continueWithEmailButton = driver.findElement(By.xpath("//button[contains(text(), 'Continue with email')]"));
        continueWithEmailButton.click();

        // Generate random name
        String randomName = generateRandomName();

        // Find the name field
        WebElement nameField = driver.findElement(By.id("user_name"));
        nameField.sendKeys(randomName);

        // Generate random username
        String randomUsername = generateRandomUsername();

        // Find the username field
        WebElement usernameField = driver.findElement(By.id("user_login"));
        usernameField.sendKeys(randomUsername);

        // Use a real email address
        String email = "wishhiranyaco@gmail.com";

        // Find the email field
        WebElement emailField = driver.findElement(By.id("user_email"));
        emailField.sendKeys(email);

        // Generate random password
        String randomPassword = generateRandomPassword();

        // Find the password field
        WebElement passwordField = driver.findElement(By.id("user_password"));
        passwordField.sendKeys(randomPassword);

        // Find the terms checkbox
        WebElement termsCheckbox = driver.findElement(By.id("user_agree_to_terms"));
        termsCheckbox.click();

        // Find the "Create Account" button
        WebElement createAccountButton = driver.findElement(By.name("commit"));
        createAccountButton.click();
    }

    private static String generateRandomName() {
        String[] names = {"John", "Jane", "Bob", "Alice", "Mike", "Emma"};
        Random random = new Random();
        return names[random.nextInt(names.length)];
    }

    private static String generateRandomUsername() {
        String[] usernames = {"user123", "testuser", "randomuser", "newuser", "guestuser"};
        Random random = new Random();
        return usernames[random.nextInt(usernames.length)];
    }

    private static String generateRandomPassword() {
        String[] passwords = {"password123", "testpassword", "randompassword", "newpassword", "guestpassword"};
        Random random = new Random();
        return passwords[random.nextInt(passwords.length)];
    }
}
