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
        login("admin", "secret");
    }

    private void login(String username, String password) {
        wdc.findElement(By.name("user")).clear();
        wdc.findElement(By.name("user")).sendKeys(username);
        wdc.findElement(By.name("pass")).click();
        wdc.findElement(By.name("pass")).clear();
        wdc.findElement(By.name("pass")).sendKeys(password);
        wdc.findElement(By.xpath("//input[@value='Login']")).click();
    }

    @Test
    public void testAddContact() throws Exception {
        goToAddNew();
        fillAddNewForm(new ContactData("John", "Rambo", "666999111", "john.rambo@gmail.kom"));
        submitAddNewCreation();
    }

    private void submitAddNewCreation() {
        wdc.findElement(By.xpath("(//input[@name='submit'])[2]")).click();
    }

    private void fillAddNewForm(ContactData contactData) {
        wdc.findElement(By.name("firstname")).click();
        wdc.findElement(By.name("firstname")).clear();
        wdc.findElement(By.name("firstname")).sendKeys(contactData.getFirstname());
        wdc.findElement(By.name("lastname")).click();
        wdc.findElement(By.name("lastname")).clear();
        wdc.findElement(By.name("lastname")).sendKeys(contactData.getLastname());
        wdc.findElement(By.name("mobile")).click();
        wdc.findElement(By.name("mobile")).clear();
        wdc.findElement(By.name("mobile")).sendKeys(contactData.getMobile());
        wdc.findElement(By.name("email")).click();
        wdc.findElement(By.name("email")).clear();
        wdc.findElement(By.name("email")).sendKeys(contactData.getEmail());
    }

    private void goToAddNew() {
        wdc.findElement(By.linkText("add new")).click();
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
