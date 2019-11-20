package loops;

public class ForLoop {
    public static void main(String[] args) {
        String sentence = "Ala ma kota";
        // Ala ma kota  znaki
        // 012345678910 indeksy
        // wypisz w pętli wszyskie znaki napisu pojedynczo
        for (int i = 0; i <= sentence.length() - 1; i++){
            if(sentence.charAt(i) != ' ') {
                System.out.printf("indeks: %d znak: %c\n", i, sentence.charAt(i));
            }
        }
        // tablica - zmienna przechowująca zestaw wartości uporządkowanych po indeksach
        // index 0 -> 2
        // index 1 -> 4
        // index 2 -> 6
        // index 3 -> 8
        int numbers [] = {2,4,6,8};
        // for ( typ pojedynczej wartości nazwa_podręczna : kolekcja wartości)
        int index = 0;
        for (int number : numbers) {
            System.out.printf("indeks: %d wartość: %d\n",index ,number);
            index++;
        }

    }
}
