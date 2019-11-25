package hw2.ex7_8;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Company c = new Company();
        System.out.println("Info: " + c.addEmployee("Adam","Kowalski","12312312312", LocalDate.of(2000,4,3), 10000));
        System.out.println("Info: " + c.addEmployee("Adam","Kot","52312312312", LocalDate.of(2000,4,3), 10000));
        System.out.println("Info: " + c.addEmployee("Jan","Nowak","12312312312", LocalDate.of(2001,4,3), 10000));
        System.out.println("Info: " + c.addEmployee("Anna","Nowak","1231231231", LocalDate.of(2001,4,3), 10000));

        System.out.println("Znaleziono: " +
                c.getEmployeeByPESEL("12312312312"));
        System.out.println("Znaleziono: " +
                c.getEmployeeByPESEL("12312312311"));

        c.getEmployees();
        System.out.println("Zmiana pensji: " + c.setSalaryByPESEL(5000, "12312312312"));
        System.out.println("Zmiana pensji: " + c.setSalaryByPESEL(5000, "15312312312"));
        c.getEmployees();
    }
}
