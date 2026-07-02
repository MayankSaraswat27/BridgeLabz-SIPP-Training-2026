import java.util.*;

class Contact {
    String name;
    String phone;
    String email;

    Contact(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }
}

public class AddressBook {

    ArrayList<Contact> contacts = new ArrayList<>();
    HashMap<String, Contact> contactMap = new HashMap<>();
    HashSet<String> phoneSet = new HashSet<>();

    // Add Contact
    public void addContact(String name, String phone, String email) {

        if (phoneSet.contains(phone)) {
            System.out.println("Duplicate phone number not allowed.");
            return;
        }

        Contact c = new Contact(name, phone, email);

        contacts.add(c);
        contactMap.put(name, c);
        phoneSet.add(phone);

        System.out.println("Contact Added Successfully.");
    }

    // Search Contact
    public void searchContact(String name) {

        if (contactMap.containsKey(name)) {
            Contact c = contactMap.get(name);

            System.out.println("Name  : " + c.name);
            System.out.println("Phone : " + c.phone);
            System.out.println("Email : " + c.email);
        } else {
            System.out.println("Contact Not Found.");
        }
    }

    // Delete Contact
    public void deleteContact(String name) {

        if (contactMap.containsKey(name)) {

            Contact c = contactMap.get(name);

            contacts.remove(c);
            phoneSet.remove(c.phone);
            contactMap.remove(name);

            System.out.println("Contact Deleted Successfully.");
        } else {
            System.out.println("Contact Not Found.");
        }
    }

    // Display Contacts Sorted by Name
    public void displayContacts() {

        Collections.sort(contacts, (c1, c2) -> c1.name.compareToIgnoreCase(c2.name));

        System.out.println("\n----- Address Book -----");

        for (Contact c : contacts) {
            System.out.println("Name  : " + c.name);
            System.out.println("Phone : " + c.phone);
            System.out.println("Email : " + c.email);
            System.out.println();
        }
    }

    public static void main(String[] args) {

        AddressBook book = new AddressBook();

        book.addContact("Mayank", "9876543210", "mayank@gmail.com");
        book.addContact("Rahul", "9876500000", "rahul@gmail.com");
        book.addContact("Aman", "9999999999", "aman@gmail.com");

        // Duplicate Phone Number
        book.addContact("Rohit", "9876543210", "rohit@gmail.com");

        System.out.println();

        // Search
        book.searchContact("Rahul");

        System.out.println();

        // Delete
        book.deleteContact("Aman");

        System.out.println();

        // Display Sorted
        book.displayContacts();
    }
}