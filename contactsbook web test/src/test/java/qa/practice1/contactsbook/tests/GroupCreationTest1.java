package qa.practice1.contactsbook.tests;

import org.testng.annotations.Test;
import qa.practice1.contactsbook.model.GroupData;

public class GroupCreationTest1 extends TestBase {

    @Test
    public void testGroupCreation1() throws Exception {

        app.getNavigationHelper1().goToGroupPage();
        app.getGroupHelper1().initGroupCreation();
        app.getGroupHelper1().fillGroupForm(new GroupData("test1", "test2", "test3"));
        app.getGroupHelper1().submitGrouCreation();
        app.getGroupHelper1().returnToGroupPage();
    }

}
