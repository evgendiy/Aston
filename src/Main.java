import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] words = {"dog", "cat", "racoon", "horse", "dog", "dog", "hamster", "snake", "snake", "cat"};

        Task1 task1 = new Task1();
        task1.showUniqueWords(words);
        task1.uniqueWordCounter(words);

        System.out.println("**************");

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("+375253334421", "Иванов");
        phoneBook.add("+375335554422", "Петров");
        phoneBook.add("+375444564423", "Сидоров");
        phoneBook.add("+375291874424", "Иванов");
        phoneBook.add("+375293334425", "Петров");

        phoneBook.get("Сидоров");
    }
}