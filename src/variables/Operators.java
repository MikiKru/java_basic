package variables;

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
        System.out.println("Wynik: " + ((j++)*(--i + j--) + (++i)));
        // 3 * (5 + 4) + (6) = 33
    }
}
