package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class SeleniumLocators {

    public static void main(String[] args) {
        runFirefoxScript();
        runChromeScript();
        runWikipediaScript();
    }

    public static void runFirefoxScript() {
        // Set path to the geckodriver executable
        System.setProperty("webdriver.gecko.driver", "path/to/geckodriver");

        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        try {
            // Maximize the browser window
            driver.manage().window().maximize();

            // Navigate to Google
            driver.get("http://google.com");

            // Print the current URL
            System.out.println("Current URL: " + driver.getCurrentUrl());

            // Reload the page
            driver.navigate().refresh();
        } finally {
            // Close the browser
            driver.quit();
        }
    }

    public static void runChromeScript() {
        // Set path to the chromedriver executable
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Create a new instance of the Chrome driver
        WebDriver driver = new ChromeDriver();

        try {
            // Maximize the browser window
            driver.manage().window().maximize();

            // Navigate to demoblaze
            driver.get("https://www.demoblaze.com/");

            // Verify the title of the page
            String expectedTitle = "STORE";
            String actualTitle = driver.getTitle();

            if (actualTitle.equals(expectedTitle)) {
                System.out.println("Page landed on correct website");
            } else {
                System.out.println("Page not landed on correct website");
            }
        } finally {
            // Close the browser
            driver.quit();
        }
    }

    public static void runWikipediaScript() {
        // Set path to the chromedriver executable
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Create a new instance of the Chrome driver
        WebDriver driver = new ChromeDriver();

        try {
            // Maximize the browser window
            driver.manage().window().maximize();

            // Navigate to Wikipedia
            driver.get("https://www.wikipedia.org/");

            // Search for "Artificial Intelligence"
            WebElement searchInput = driver.findElement(By.name("search"));
            searchInput.sendKeys("Artificial Intelligence");
            searchInput.submit();

            // Wait until the results are loaded and click on the "History" section
            WebDriverWait wait = new WebDriverWait(driver, 10);
            WebElement historyLink = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("History")));
            historyLink.click();

            // Print the title of the section
            System.out.println("Title of the section: " + driver.getTitle());
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}
