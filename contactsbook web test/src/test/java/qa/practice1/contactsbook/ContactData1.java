package qa.practice1.contactsbook;

public class ContactData1 {
    private final String firstname;
    private final String lastname;
    private final String email;
    private final String mobile;

    public ContactData1(String firstname, String lastname, String email, String mobile) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.mobile = mobile;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getEmail() {
        return email;
    }

    public String getMobile() {
        return mobile;
    }
}
