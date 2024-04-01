import task1.Employee;
import task2.Park;


public class Main {
    public static void main(String[] args) throws IllegalAccessException {

        Employee[] employeesArray = new Employee[5];

        employeesArray[0]= new Employee("Ivanov Ivan Ivanovich","engineer", "ivan@gmail.com","253443478", 1111, 23);
        employeesArray[1] = new Employee("Petrov Ivan Ivanovich","engineer", "petrov@gmail.com","999999999", 2222, 26);
        employeesArray[2] = new Employee("Sidorov Ivan Ivanovich","engineer", "sid@gmail.com","444444444", 3333, 45);
        employeesArray[3] = new Employee("Tregulov Ivan Ivanovich","engineer", "treg@gmail.com","335443465", 4444, 37);
        employeesArray[4] = new Employee("Alishev Ivan Ivanovich","engineer", "alish@gmail.com","293433589", 5555, 34);

        for (Employee employee : employeesArray) {
            employee.showInfo();
        }


        Park park = new Park();
        //v1
        Park.Attraction horses = park.new Attraction("Лошадки", "9.00", "20.00", 5,3, 6,14.50);
        horses.showInfo();
        //v2
        Park.Attraction slide = park.attractionCreation("Горки","9.00", "20.00", 5,6, 14,10.0);
        slide.showInfo();

    }
}