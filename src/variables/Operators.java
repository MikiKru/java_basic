package variables;

// CTRL + ALT + L -> autoformatowanie kodu

import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
        int i = 5;
        int j = 4;
        // post inkrementacja
        System.out.println(i++);
        // po wypisaniu zmienna jest inkrementowana
        System.out.println(i);

        // pre dekrementacja
        System.out.println(--j);
        // po wypisaniu
        System.out.println(j);
        // jaki wynik -> i = 6 j = 3
        System.out.println("Wynik: " + ((j++) * (--i + j--) + (++i)));
        // 3 * (5 + 4) + (6) = 33

        // Sprawdź czy użytkownik jest płenoletni
            // jeżeli wiek zawiera się w przedziale od 0 do 120 to sprawdzam czy jesteś dorosły
                // -> jeżeli jego wiek jest >= 18 lat to wypisz jesteś pełnoletni
                // -> w przeciwnym razie wypisz nie jesteś pełnoletni
            // w przeciwnym razie
                // -> nie jesteś człowiekiem
        int age;
        // Utworzenie obiektu Scanner pozwalającego na wprowadzenie wartości do konsoli -> System.in
        Scanner scanner = new Scanner(System.in);
        // użytkownik wprowadza wartośc do zmiennej age typu int metodą nextInt()
        System.out.println("Wprowadź swój wiek: ");
        age = scanner.nextInt();
        // sprawdzenie czy jesteś człowiekiem
        boolean isHuman = age >= 0 && age <= 120 ? true : false;
        // sprawdzenie czy jesteś pełnoletni
        String isMature = age >= 18 ? "jesteś dorosły" : "nie jesteś dorosły";

        System.out.println(isHuman ? isMature : "ROBOT");




    }
}
