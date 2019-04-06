package qa.practice1.adressbook;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AddContactTest {
    private WebDriver wdc;

    @BeforeMethod(alwaysRun = true)
    public void setUp() throws Exception {
        wdc = new FirefoxDriver();
        wdc.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        wdc.get("http://localhost/addressbook/");
        wdc.findElement(By.name("user")).clear();
        wdc.findElement(By.name("user")).sendKeys("admin");
        wdc.findElement(By.name("pass")).click();
        wdc.findElement(By.name("pass")).clear();
        wdc.findElement(By.name("pass")).sendKeys("secret");
        wdc.findElement(By.xpath("//input[@value='Login']")).click();
    }

    @Test
    public void testAddContact() throws Exception {
        wdc.findElement(By.id("content")).click();
        wdc.findElement(By.linkText("add new")).click();
        wdc.findElement(By.name("firstname")).click();
        wdc.findElement(By.name("firstname")).clear();
        wdc.findElement(By.name("firstname")).sendKeys("John");
        wdc.findElement(By.name("lastname")).click();
        wdc.findElement(By.name("lastname")).clear();
        wdc.findElement(By.name("lastname")).sendKeys("Rambo");
        wdc.findElement(By.name("mobile")).click();
        wdc.findElement(By.name("mobile")).clear();
        wdc.findElement(By.name("mobile")).sendKeys("666999111");
        wdc.findElement(By.name("email")).click();
        wdc.findElement(By.name("email")).clear();
        wdc.findElement(By.name("email")).sendKeys("john.rambo@gmail.kom");
        wdc.findElement(By.xpath("(//input[@name='submit'])[2]")).click();
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() throws Exception {
        wdc.quit();
    }

    private boolean isElementPresent(By by) {
        try {
            wdc.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    private boolean isAlertPresent() {
        try {
            wdc.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }
}
