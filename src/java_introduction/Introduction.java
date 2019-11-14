package java_introduction;

// CTRL + /             -> komentarz jednowierszowy
// CTRL + SHIFT + /     -> komentarz blokowy
// psvm                 -> public static void main(String[] args) {}
// sout                 -> System.out.println();
// CTRL + SHIFT + F10   -> run program
// CTRL + D             -> duplikowanie lini
public class Introduction {
    // metoda uruchomieniowa
    // -> automatycznie wyowływana jako pierwsza w trakcie uruchamiania projektu
    public static void main(String[] args) {
        // polecenie wypisujące wartości podane w argumencie na standardowym wyjściu
        System.out.println("Hello World!");
        // pobranie numeru wersji JRE
        System.out.println(System.getProperty("java.runtime.version"));
        System.out.println(System.getProperty("java.version"));

        // typy danych
        //byte mySmallNumber = 555555555; -> błąd zbyt mała precyzja typu byte
        int myFirstNumber = 50;
        System.out.println("myFirstNumber = " + myFirstNumber);
        System.out.println("Dodawanie liczb: " + (100 + myFirstNumber));

    }
}
