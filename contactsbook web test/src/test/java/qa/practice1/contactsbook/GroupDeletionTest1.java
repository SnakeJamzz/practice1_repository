package qa.practice1.contactsbook;

import org.testng.annotations.Test;

public class GroupDeletionTest1 extends TestBase {

  @Test
  public void testGroupDeletion1() throws Exception {
    goToGroupPage();
    selectGroup();
    deleteSelectedGroups();
    returnToGroupPage();
  }

}
