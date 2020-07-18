package ContactPhoneNumber;

public class Contact {
    //name and phoneNumber here is privatized. It can't be accessed outsideof Contact class.
    private String name;
    private String phoneNumber;

    //Constructor for String name.
    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    //Get method for name.
    public String getName() {
        return name;
    }
    //Get method for phone number.
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public static Contact createContact(String name, String phoneNumber)
    {
        return new Contact(name, phoneNumber);
    }
}
