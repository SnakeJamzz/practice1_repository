package qa.practice1.contactsbook.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import qa.practice1.contactsbook.appmanager.ApplicationManager1;

public class  TestBase {

    protected final ApplicationManager1 app = new ApplicationManager1();

    @BeforeMethod(alwaysRun = true)
    public void setUp() throws Exception {
        app.init();
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() throws Exception {
        app.stop();
    }

}
