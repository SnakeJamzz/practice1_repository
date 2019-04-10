package qa.practice1.contactsbook.tests;

import org.testng.annotations.Test;

public class GroupDeletionTest1 extends TestBase {

  @Test
  public void testGroupDeletion1() throws Exception {
    app.getNavigationHelper1().goToGroupPage();
    app.getGroupHelper1().selectGroup();
    app.getGroupHelper1().deleteSelectedGroups();
    app.getGroupHelper1().returnToGroupPage();
  }

}
