package homework;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class User {
    private String firstName;
    private String lastName;
    private String posit;
    private String pesel;
    private String birthMonth;
    private String birthDay;
    private String genderName;
    private int birthYear;
    private int ageYear;
    private int ageMonths;
    private int ageDays;
    private int salary;
    private boolean isMan;
    public void askUser() {
        Scanner in = new Scanner(System.in);
        System.out.println("===============================");
        System.out.println("Wpisz imię: ");
        this.firstName = in.nextLine();
        System.out.println("Wpisz nazwisko: ");
        this.lastName = in.nextLine();
        System.out.println("Wpisz zajmowane stanowisko: ");
        this.posit = in.nextLine();
        System.out.println("Wybierz płeć: K/M");
        char gender = in.nextLine().toUpperCase().charAt(0);
        while (!(gender == 'M' || gender == 'K') ) {
            System.out.println("-------  BŁĄD ------");
            System.out.println("Wybierz płeć ponownie: ");
            gender = in.nextLine().toUpperCase().charAt(0);
        }
        if (gender == 'M') {
//            boolean isMan = true;
            genderName = "Mężczyzna";
        } else {
//            boolean isMan = false;
            genderName = "Kobieta";
        }
        //=======================================
        System.out.println("Wprowadź PESEL: ");
        this.pesel = in.nextLine();
        while(pesel.length() != 11 ){
            System.out.println("======WPROWADZONO NIEPOPRAWNY PESEL======");
            System.out.println("Spróbuj ponownie: ");
            this.pesel = in.nextLine();
        }
        System.out.println("Wprowadź pensję brutto: ");
        this.salary = in.nextInt();
        System.out.println("Wprowadź rok urodzenia: ");
        this.birthYear = in.nextInt();
        this.birthMonth = pesel.substring(2,4);
        this.birthDay = pesel.substring(4, 6);
        int birthMonthInt = Integer.parseInt(birthMonth);
        int birthDayInt = Integer.parseInt(birthDay);
        int age = 2019 - this.birthYear;
        if(11 < birthMonthInt){
            age --;
        } else if(11 == birthMonthInt){
            if(20 < birthDayInt){
                age--;
            }
        }
        System.out.println("Ile masz lat: " + age);
//        LocalDate today = LocalDate.now();
//        LocalDate birth = LocalDate.of(this.birthYear, birthMonthInt, birthDayInt);
//        this.ageYear = Period.between(birth, today).getYears();
//        this.ageMonths = Period.between(birth, today).getMonths();
//        this.ageDays = Period.between(birth, today).getDays();
    }
    void showInfo() {
        System.out.println("=====================================");
        System.out.printf("WPROWADZONE DANE\n imię: %s\n nazwisko: %s\n zajmowane stanowisko: %s\n " +
                        "pensja brutto: %dzł\n płeć : %s\n data urodzenia: %d-%s-%s\n numer PESEL: %s\n Masz %d lat %d miesięcy oraz %d dni! \n"
                , firstName, lastName, posit, salary, genderName, birthYear, birthMonth, birthDay, pesel, ageYear, ageMonths, ageDays);
        System.out.println("=====================================");
    }
}