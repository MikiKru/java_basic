package regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class RegexStart {
    public static void main(String[] args) {
        while(true) {
            System.out.println("Podaj numer datę YYYY-MM-DD");
            String date = new Scanner(System.in).nextLine();
            // pattern to nasz wzorzec zawierający wyrażenia regularne
            // PESEL
//            String pattern = "^[0-9]{11}$";
            String pattern = "^[1-2]{1}[0-9]{3}-(0[1-9]{1}|1[0-2]{1})-(0[1-9]{1}|[12]{1}[0-9]{1}|3[01]{1})$";
            if (Pattern.matches(pattern, date)) {
                System.out.println("OK");
                break;
            } else {
                System.out.println("N-OK");
            }
        }
    }
}
