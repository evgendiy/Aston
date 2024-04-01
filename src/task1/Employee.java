package task1;

/**
 * 1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
 * Конструктор класса должен заполнять эти поля при создании объекта.
 * Внутрикласса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
 * 2. Создать массив из 5 сотрудников.
 * Пример:
 * вначале объявляем массив объектов
 * Person[] persArray = new Person[5];
 * потом для каждой ячейки массива задаем объект persArray[0] = new Person("Ivanov Ivan", "Engineer",
 * "ivivan@mailbox.com", "892312312", 30000, 30);
 * persArray[1] = new Person(...);
 * ...persArray[4] = new Person(...);
 */
public class Employee {
    private String fullName;
    private String position;
    private String email;
    private String phoneNumber;
    private int salary;
    private int age;

    public Employee(String fullName, String position, String email, String phoneNumber, int salary, int age) throws IllegalAccessException {
        if (age < 18 || age > 65) {  //для примера
            throw new IllegalAccessException("Возраст сотрудника должен быть не менее 18 и не более 65");
        }
        if ((!phoneNumber.matches("^\\d+$")) || (phoneNumber.length() != 9)) {
            throw new IllegalAccessException("Номер телефона должен состоять из девяти цифр");
        }
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phoneNumber = "+375" + phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public void showInfo() {
        System.out.println("ФИО: " + fullName + "\n" +
                "Должность: " + position + "\n" +
                "Email: " + email + "\n" +
                "Номер телефона: " + phoneNumber + "\n" +
                "Зарплата: " + salary + "\n" +
                "Возраст: " + age);
    }
}
