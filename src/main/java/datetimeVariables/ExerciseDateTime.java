package datetimeVariables;

import java.time.LocalDate;

public class ExerciseDateTime {
    public static void main(String[] args) {
        // znajdź dzień tygodnia w którym się urodziałeś/urodziałaś
        LocalDate birthDate = LocalDate.of(1977,4,1);
        int myDayOfWeek = birthDate.getDayOfWeek().getValue();
        System.out.println(myDayOfWeek);
        // znajdź ile razy do dziś Twoje urodziny przypadały
        // w ten sam dzień tygodnia w którym się urodziłeś/urodziłaś
        LocalDate actual = LocalDate.now();
        int counter = 0;
        for (birthDate.getYear(); birthDate.getYear() <= actual.getYear(); birthDate = birthDate.plusYears(1)) {
            if(myDayOfWeek == birthDate.getDayOfWeek().getValue()){
                System.out.println(birthDate);
                counter++;
            }
        }
    }
}
