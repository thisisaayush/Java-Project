package ContactPhoneNumber;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }
    //findContact() method 1.
    private int findContact(Contact contact) {
        return this.myContacts.indexOf(contact);
    }
    //findContact() method 2.
    private int findContact(String contactName)
    {
        for(int i=0; i<this.myContacts.size(); i++) {
            Contact contact = this.myContacts.get(i);
            if(contact.getName().equals(contactName)) {
                return i;
            }
        }
        return -1;
    }
    public boolean addNewContact(Contact contact)//findContact() method2 is invoked here.
    {
        if(findContact(contact.getName()) >= 0)//getName() method here is for Contact class to get the name of
        //private String name.
        {
            System.out.println("Contact is already on a list.");
            return false;
        }

        myContacts.add(contact);//If contact don't exist, save it in ArrayList<>() myContacts.
        return true;
    }
    public boolean updateContact(Contact oldContact, Contact newContact)//findContact() method1 is invoked here.
    {
        int foundPosition = findContact(oldContact);
        if(foundPosition < 0) {
            System.out.println(oldContact.getName() + " was not found.");
            return false;
        }

        this.myContacts.set(foundPosition, newContact);
        System.out.println(oldContact.getName() + " was replaced with " + newContact.getName() + ".");
        return true;
    }

    public boolean removeContact(Contact contact) {
        int foundPosition = findContact(contact);//findContact() method1 is invoked here.
        if(foundPosition < 0) {
            System.out.println(contact.getName() +" was not found.");
            return false;
        }
        this.myContacts.remove(foundPosition);
        System.out.println(contact.getName() + " was removed.");
        return true;
    }

    public String queryContact(Contact contact)//findContact() method 1 is invoked here.
    {
        if(findContact(contact) >= 0)
        {
            return contact.getName();
        }
        return null;
    }

    public Contact queryContact(String name)//findContact() method 2 is invoked here.
    {
        int position = findContact(name);
        if(position >=0) {
            return this.myContacts.get(position);
        }

        return null;
    }
    //prints the contacts of a list.
    public void printContacts() {
        System.out.println("Contact List:");
        for(int i = 0 ; i < this.myContacts.size() ; i++) {
            System.out.println((i+1) + "." +
                    this.myContacts.get(i).getName() + " -> " +
                    this.myContacts.get(i).getPhoneNumber());//getName() and getPhoneNumber is for Contact class'
            //private fields name and phoneNumber. .
        }
    }
}
