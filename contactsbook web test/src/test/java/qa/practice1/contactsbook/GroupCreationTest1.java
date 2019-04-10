package qa.practice1.contactsbook;

import org.testng.annotations.Test;

public class GroupCreationTest1 extends TestBase {

    @Test
    public void testGroupCreation1() throws Exception {

        goToGroupPage();
        initGroupCreation();
        fillGroupForm(new GroupData("test1", "test2", "test3"));
        submitGrouCreation();
        returnToGroupPage();
    }

}
