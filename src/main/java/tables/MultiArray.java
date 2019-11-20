package tables;
import java.util.*;

public class MultiArray {
    public static void main(String[] args) {

        char [][] t =   {
                            {'_', 'X', '_'},
                            {'_', 'O', '_'},
                            {'_', 'X', 'O'}
                        };
        // pętla iterująca po wierszach
        for (int i = 0; i < t.length ; i++) {
            // pętla iterująca po kolumnach
            for (int j = 0; j < t[i].length; j++) {
                System.out.printf("%3c", t[i][j]);
            }
            System.out.println(); // przeniesienie wiersza do nowej linii
        }

        // tablice wielowymiarowe - nieregularne

        int [][] numbers =  {
                                {1,1,1},
                                {2,2,2,2,2},
                                {3,3,3,3,3,3,3}
                            };
        System.out.println();
        for (int i = 0; i < numbers.length ; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.printf("%-3d", numbers[i][j]);
            }
            System.out.println();
        }

        // 1. i = 0 | 0 < 3 -> true  | i++
        // -> j = 0 | 0 < 3 -> true  | j++   1
        // -> j = 1 | 1 < 3 -> true  | j++   1  1
        // -> j = 2 | 2 < 3 -> true  | j++   1  1  1
        // -> j = 3 | 3 < 3 -> false | j++   1  1  1 \n
        //
        // 2. i = 1 | 1 < 3 -> true  | i++
        // -> j = 0 | 0 < 5 -> true  | j++   1  1  1
        //                                   2 ...

        System.out.println(numbers[2][0]);
//        System.out.println(numbers[2][10]); -> błąd ArrayIndexOutOfBoundsException

        String tab [] = new String[5] ;
        int tabInt [] = new int[5] ;
        System.out.println(tab[1]);     // typy obiektowe są inicjalizowane null
        System.out.println(tabInt[1]);  // typy podstawowe
        // int -> 0
        // double -> 0.0
        // char = ''
        // boolean -> false

        List<String> names = new ArrayList<>(Arrays.asList("Ala","Ola","Ela"));
        System.out.println(names);
        System.out.println(names.size());
        System.out.println(names.get(1));
        names.remove("Ola");
        System.out.println("==============");
        System.out.println(names);
        System.out.println(names.size());
        System.out.println(names.get(1));
        System.out.println("==============");
        names.add("Jan");
        System.out.println(names);
        names.set(1,"Anna");
        System.out.println(names);
//        names.set(15, "Janusz"); -> błąd
//        System.out.println(names);
        String deleted = names.remove(1);
        System.out.println("deleted = " + deleted);
        System.out.println(names);

    }
}
