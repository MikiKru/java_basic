package oop;

// Klasa główna - uruchomieniowa
public class Main {
    public static void main(String[] args) {
        // utworzenie obiektu
        User userOne = new User();
        // odwołanie do pola klasowego
        userOne.name = "Michał";
        userOne.lastName = "Kruczkowski";
        userOne.activated = true;
        userOne.salary_net = 10100;
        userOne.gender = 'M';
        // wywołanie metody
        userOne.printUser();
        User userTwo = new User("Adam","Kowalski", 'M', false, 4000);
        userTwo.printUser();
        User userThree = new User("Anna", "Nowak", 'K', true, 8000);
        userThree.printUser();
        userOne.salary_net = 9500.50;
        System.out.println("=================================");
        userOne.printUser();
        userTwo.printUser();
        userThree.printUser();
        System.out.println("=================================");
        double salaryGross = userOne.calculateSalaryGross();
        System.out.println("salaryGross = " + salaryGross);
        System.out.println("Calculated salary gross: " + userTwo.calculateSalaryGross());
        System.out.println("=================================");
        System.out.println(userThree.modifyUserParameters(15000,false));

    }
}
