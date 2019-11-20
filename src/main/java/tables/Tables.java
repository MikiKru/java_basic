package tables;

import java.util.Arrays;
import java.util.Scanner;

public class Tables {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // deklaracja
        String[] names = new String[5];
        // przypisanie wartości
        for (int i = 0; i < names.length; i++) {
            System.out.println("Wprowadź imię: ");
            names[i] = scanner.nextLine();
        }
//        for (String name : names) {
//            System.out.println(name);
//        }
        Arrays.stream(names).forEach(System.out::println);

    }
}
