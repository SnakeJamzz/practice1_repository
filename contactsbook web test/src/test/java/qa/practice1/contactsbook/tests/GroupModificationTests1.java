package qa.practice1.contactsbook.tests;

import org.testng.annotations.Test;
import qa.practice1.contactsbook.model.GroupData;

public class GroupModificationTests1 extends TestBase {

    @Test
    public void testGroupModification(){
        app.getNavigationHelper1().goToGroupPage();
        app.getGroupHelper1().selectGroup();
        app.getGroupHelper1().initGroupModification();
        app.getGroupHelper1().fillGroupForm(new GroupData("test1", "test2", "test3"));
        app.getGroupHelper1().submitGroupModification();
        app.getGroupHelper1().returnToGroupPage();
    }
}
