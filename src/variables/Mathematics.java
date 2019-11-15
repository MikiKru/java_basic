package variables;

import static java.lang.Math.pow;

public class Mathematics {
    public static void main(String[] args) {
        // stałe z klasy matematycznej
        final double PI = Math.PI;
        // x ^ y
        int x = 5;
        int y = 2;
        // pow(podstawa, wykładnik)
        // konwersja na typ integer (int)
        int result = (int)pow(x,y);
        System.out.println(result);
        // pierwiastek 3 stopnia z 8
        System.out.println(pow(8, (1.0/3)));
    }
}
