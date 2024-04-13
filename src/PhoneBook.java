import java.util.*;

public class PhoneBook {
    private Map<String, String> phoneBook;

    public PhoneBook() {
        phoneBook = new HashMap<>();
    }

    public void add(String phoneNumber, String lastName) {
        phoneBook.put(phoneNumber, lastName);
    }

    public void get(String lastName) {
        boolean match = false;
        for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
            if (entry.getValue().equals(lastName)) {
                System.out.println(lastName + ": " + entry.getKey());
                match = true;
            }
        }
        if (!match) {
            System.out.println("Фамилии " + lastName + " в телефоне нет.");
        }
    }
}
