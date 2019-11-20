package javaBeans;

public class Main {
    public static void main(String[] args) {
        RGB colour1 = new RGB(0,0,1);
        System.out.println(colour1);
//        colour1.r = 100; -> brak dostępu
        colour1.setR(100);
        colour1.setG(100);
        colour1.setB(100);
        System.out.println(colour1.getR());
        System.out.println(colour1.getG());
        System.out.println(colour1.getB());
        System.out.println(colour1);
        System.out.println(colour1.getClass());

        int dystans = 12345;
        double km =  0;
        km = dystans * 0.001;
        System.out.println(km);

    }
}
