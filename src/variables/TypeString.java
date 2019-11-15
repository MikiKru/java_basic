package variables;

public class TypeString {
    public static void main(String[] args) {
        String text = "Dowolny napis 1 1.234";
        System.out.println("text = " + text);
        System.out.println("Pierwszy znak napisu: " + text.charAt(0));
        System.out.println("Trzeci znak napisu: " + text.charAt(2));
        System.out.println("Ostatni znak napisu: " + text.charAt(text.length() - 1));

        System.out.println("y znajduje się na indesksie: " + text.indexOf('y'));
        System.out.println("spacja znajduje się na indesksie: " + text.indexOf(' '));
        System.out.println("napis znajduje się na indesksie: " + text.indexOf("napis"));

        System.out.println("Długość napisu w zmiennej text: " + text.length());

        // Jak wydobyć i zapisać w noeje zmienne słowo napis z zmiennej text
        String napis = text.substring(8,13);
        System.out.println(napis);

        String cite = "Być albo nie być!";
        String updatedCite = cite.replaceAll("ć","c");
        System.out.println(updatedCite);

        String name1 = "Ala";
        String name2 = "ala";

        System.out.println(name1.equals(name2));
        System.out.println(name1.length() >= name2.length());

        String name = "Michał";
        System.out.println("Przed: " + name);
//        name.charAt(name.length() - 1) = 'l'; -> typ string jest niezmienny
        name = name.replace("ł","l");
        System.out.println("Po:" + name);
//        name + "abc";
        name = name + "abc";
        System.out.println("Po złączeniu z abc: " + name);

        // Sprawdzenie czy napis jest palindromem
        String txt = "KAJIAK";
        System.out.println(txt);
        // utworzyliśmy obiekt klasy StringBuffer -> edytowalny String
        StringBuffer editableTxt = new StringBuffer(txt);
        // odwócenie kolejności liter w napisie
        editableTxt.reverse();
        // przypisanie odwóconego napisu do zmiennej String -> nieedytowalnej
        String txtReversed = editableTxt.toString();
        System.out.println(editableTxt);

        System.out.println("Czy napis jest palindromem: " + txt.equals(txtReversed));

        // inny sposób
        for(int index = 0; index <= txt.length() - 1; index = index + 1) {
            if(txt.charAt(index) != txt.charAt(txt.length() - 1 - index)){
                System.out.println("Nie jest palindromem");
                break;
            }
            System.out.println("index: " + index + " jest równy: " + (txt.length() - 1 - index));
        }

    }
}
