package qa.practice1.adressbook;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class GroupDeletionTest extends TestBase {
    private WebDriver wd;

    @Test
    public void testGroupDeletion() throws Exception {
        goToGroupPage();
        selectGroup();
        deleteSelectedGroup();
        returnToGroupPage();
    }

}
