package selenium;

public class Automation {
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;

	public class SnapdealLoginVerification {
	    
	    public static void main(String[] args) {
	        // Set the path to the chromedriver executable
	        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

	        // Create a new instance of the Chrome driver
	        WebDriver driver = new ChromeDriver();
	        
	        try {
	            // Maximize the browser window
	            driver.manage().window().maximize();
	            
	            // Navigate to the Snapdeal website
	            driver.get("http://www.snapdeal.com");
	            
	            // Move the cursor to the Sign In button and hold it
	            WebDriverWait wait = new WebDriverWait(driver, 10);
	            WebElement signInButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Sign In']")));
	            Actions actions = new Actions(driver);
	            actions.moveToElement(signInButton).perform();
	            
	            // Click on the Sign In button
	            WebElement loginButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='login']")));
	            loginButton.click();
	            
	            // Switch to the login frame if it exists
	            WebElement loginFrame = wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.id("loginIframe")));
	            
	            // Enter a valid Email Id in the Email Id field
	            WebElement emailField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("userName")));
	            emailField.sendKeys("dummyemail@example.com");
	            
	            // Click on the Continue button
	            WebElement continueButton = driver.findElement(By.id("checkUser"));
	            continueButton.click();
	            
	            // Enter the valid password in the Password field
	            WebElement passwordField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("j_password_login_uc")));
	            passwordField.sendKeys("dummypassword");
	            
	            // Click on the Login button
	            WebElement loginSubmitButton = driver.findElement(By.id("submitLoginUC"));
	            loginSubmitButton.click();
	            
	            // Verify that the user is logged in successfully
	            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Account']")));
	            System.out.println("Login verification: User logged in successfully");
	        } catch (Exception e) {
	            System.out.println("Login verification: Failed - " + e.getMessage());
	        } finally {
	            // Close the browser
	            driver.quit();
	        }
	    }
	}

}
