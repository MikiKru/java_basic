package loops;

public class OmittingInstructions {
    public static void main(String[] args) {
        // PROGRAM WYSZUKUJACY OKRESLONY ZNAK W NAPISIE
        // -> JESLI ZNALEZIEONO -> WYPISZ POZYCJE TEGO ZNAKU
        // -> JESLI NIE ZNALEZIONO WYPISZ STOSOWNY KOMUNIKAT
        String sentence = "Ala ma kota a kot ma Alę";
        char search = '.';
        boolean isFound = false;
        for (int i = 0; i < sentence.length(); i++) {
            System.out.println("Iteracja nr. " + i);
            if (sentence.charAt(i) != search) {
                // pominięcie aktualnie wykonywanej iteracji i przejście do kolejnej
                continue;
            } else if (sentence.charAt(i) == search) {
                System.out.printf("Znaleziono znak %c na indeksie %d\n", sentence.charAt(i), i);
                isFound = true;
                // instrukcja przerywająca działanie pętli
                break;
            }
            System.out.println("Nic ważnego");
        }
        if (!isFound) {
            System.out.printf("Nie znaleziono znaku %c w tekście %s\n", search, sentence);
        }
        System.out.println("======================================");
        for (int i = 0; i < 10; i++) {
            if (i == 5)
                continue;
            System.out.println(i);
        }


    }
}
