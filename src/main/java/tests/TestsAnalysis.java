package tests;

public class TestsAnalysis {


    public static String name = "Michał";

    public static void hello(){
        System.out.println("Witaj " + name);
    }


    public static void main(String[] args) {
        TestsAnalysis.hello();
        TestsAnalysis.name = "Jan";
        TestsAnalysis.hello();

//        final int a = 1;
//        a =  a * a;
}
}
