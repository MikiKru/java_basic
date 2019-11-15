package conditional_instructions;

public class SimplyInstructions {
    public static void main(String[] args) {
        int age = 7555;
        if(age >= 0 && age <= 120){
            System.out.println("CZŁOWIEK - sprawdzam dalej");
            if(age > 18){
                System.out.println("CZŁOWIEK DOROSŁY");
            } else if(age == 18){
                System.out.println("CZŁOWIEK 18 LAT");
            } else {
                System.out.println("CZŁOWIEK NIEPEŁNOLETNI");
            }
        } else {
            System.out.println("ROBOT");
        }

        // SPRADŹ CZY LICZBA PODANA PRZEZ UŻYTKOWNIKA JEST PARZYSTA
        // jeśli tak wypis parzysta
        // jeśli nie wypisz nieparzysta
        // jeśli zero wypis zero

    }
}
