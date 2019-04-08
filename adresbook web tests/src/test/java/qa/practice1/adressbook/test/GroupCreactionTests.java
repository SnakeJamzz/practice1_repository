package qa.practice1.adressbook.test;

import org.testng.annotations.*;
import qa.practice1.adressbook.model.GroupData;

public class GroupCreactionTests extends TestBase {

    @Test
    public void testGroupCreaction() throws Exception {

        app.goToGroupPage();
        app.getGroupHelper().initGroupCreation();
        app.getGroupHelper().fillGroupForm(new GroupData("test1", "test2", "test3"));
        app.getGroupHelper().submitGroupCreation();
        app.getGroupHelper().returnToGroupPage();
    }

}
