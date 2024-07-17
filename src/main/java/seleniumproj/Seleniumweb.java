package seleniumproj;

public class Seleniumweb {
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;

	public class SeleniumAutomationTasks {

	    public static void main(String[] args) {
	        // Set the path to the WebDriver executable
	        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

	        // Create a new instance of the Chrome driver
	        WebDriver driver = new ChromeDriver();

	        try {
	            // Task 1: Automate Date Picker on jQueryUI
	            automateDatePicker(driver);

	            // Task 2: Automate Signup and Login process on GUVI
	            automateGuviSignUpAndLogin(driver);

	        } finally {
	            // Close the browser
	            driver.quit();
	        }
	    }

	    public static void automateDatePicker(WebDriver driver) {
	        try {
	            // Navigate to the jQueryUI datepicker page
	            driver.get("https://jqueryui.com/datepicker/");

	            // Maximize the browser window
	            driver.manage().window().maximize();

	            // Switch to the iframe that contains the datepicker
	            driver.switchTo().frame(driver.findElement(By.className("demo-frame")));

	            // Open the datepicker
	            WebElement datePicker = driver.findElement(By.id("datepicker"));
	            datePicker.click();

	            // Click on the next month button
	            WebElement nextMonthButton = driver.findElement(By.xpath("//a[@data-handler='next']"));
	            nextMonthButton.click();

	            // Select the date "22" from the datepicker
	            WebElement date = driver.findElement(By.xpath("//a[text()='22']"));
	            date.click();

	            // Print the selected date on console
	            String selectedDate = datePicker.getAttribute("value");
	            System.out.println("Selected date: " + selectedDate);

	            // Close the browser window
	            driver.close();

	        } catch (Exception e) {
	            System.out.println("An error occurred during Date Picker automation: " + e.getMessage());
	        }
	    }

	    public static void automateGuviSignUpAndLogin(WebDriver driver) {
	        try {
	            // Reopen the browser and navigate to the GUVI website
	            driver = new ChromeDriver();
	            driver.get("https://www.guvi.in/");
	            driver.manage().window().maximize();

	            // Locate the Signup button and click on it
	            WebElement signupButton = driver.findElement(By.xpath("//a[text()='Sign Up']"));
	            signupButton.click();

	            // Fill in the signup form with required details
	            WebDriverWait wait = new WebDriverWait(driver, 10);
	            WebElement nameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("name")));
	            nameField.sendKeys("Test User");

	            WebElement emailField = driver.findElement(By.id("email"));
	            emailField.sendKeys("testuser@example.com");

	            WebElement passwordField = driver.findElement(By.id("password"));
	            passwordField.sendKeys("StrongPassword123!");

	            WebElement confirmPasswordField = driver.findElement(By.id("confirmPassword"));
	            confirmPasswordField.sendKeys("StrongPassword123!");

	            WebElement signupSubmitButton = driver.findElement(By.xpath("//button[text()='Sign Up']"));
	            signupSubmitButton.click();

	            // Wait for the page to load and verify registration success
	            wait.until(ExpectedConditions.titleContains("Dashboard"));
	            System.out.println("User registered successfully.");

	            // Locate the Login button and click on it
	            WebElement loginButton = driver.findElement(By.xpath("//a[text()='Login']"));
	            loginButton.click();

	            // Fill in the login form with email and password used during registration
	            WebElement loginEmailField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
	            loginEmailField.sendKeys("testuser@example.com");

	            WebElement loginPasswordField = driver.findElement(By.id("password"));
	            loginPasswordField.sendKeys("StrongPassword123!");

	            WebElement loginSubmitButton = driver.findElement(By.xpath("//button[text()='Login']"));
	            loginSubmitButton.click();

	            // Wait for the page to load and verify login success
	            wait.until(ExpectedConditions.titleContains("Dashboard"));
	            System.out.println("User logged in successfully.");

	        } catch (Exception e) {
	            System.out.println("An error occurred during GUVI Signup and Login automation: " + e.getMessage());
	        }
	    }
	}

}
