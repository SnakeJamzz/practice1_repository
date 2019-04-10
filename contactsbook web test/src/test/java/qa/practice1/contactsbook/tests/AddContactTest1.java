package qa.practice1.contactsbook.tests;

import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import qa.practice1.contactsbook.model.ContactData1;

public class AddContactTest1 {
  private WebDriver wda;

  @BeforeMethod(alwaysRun = true)
  public void setUp() throws Exception {
    wda = new FirefoxDriver();
    wda.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    wda.get("http://localhost/addressbook/group.php");
    login("admin", "secret");
  }

  private void login(String username, String password) {
    wda.findElement(By.name("user")).click();
    wda.findElement(By.name("user")).clear();
    wda.findElement(By.name("user")).sendKeys(username);
    wda.findElement(By.id("LoginForm")).click();
    wda.findElement(By.name("pass")).click();
    wda.findElement(By.name("pass")).clear();
    wda.findElement(By.name("pass")).sendKeys(password);
    wda.findElement(By.xpath("//input[@value='Login']")).click();
  }

  @Test
  public void testAddContactTest1() throws Exception {
    initAddNew();
    fillContactForm(new ContactData1("Eric", "Gales", "EGales@gmail.com", "555666444"));
    submitAddNew();
    clickContent();
  }

  private void clickContent() {
    wda.findElement(By.id("content")).click();
  }

  private void submitAddNew() {
    wda.findElement(By.xpath("(//input[@name='submit'])[2]")).click();
  }

  private void fillContactForm(ContactData1 contactData1) {
    wda.findElement(By.name("firstname")).click();
    wda.findElement(By.name("firstname")).clear();
    wda.findElement(By.name("firstname")).sendKeys(contactData1.getFirstname());
    wda.findElement(By.name("lastname")).click();
    wda.findElement(By.name("lastname")).clear();
    wda.findElement(By.name("lastname")).sendKeys(contactData1.getLastname());
    wda.findElement(By.name("mobile")).click();
    wda.findElement(By.name("mobile")).clear();
    wda.findElement(By.name("mobile")).sendKeys(contactData1.getMobile());
    wda.findElement(By.name("email")).click();
    wda.findElement(By.name("email")).clear();
    wda.findElement(By.name("email")).sendKeys(contactData1.getEmail());
  }

  private void initAddNew() {
    wda.findElement(By.linkText("add new")).click();
  }

  @AfterMethod(alwaysRun = true)
  public void tearDown() throws Exception {
    wda.quit();
  }

  private boolean isElementPresent(By by) {
    try {
      wda.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      wda.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

}
