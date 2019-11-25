package hw2.ex3;

import java.time.Duration;
import java.time.LocalTime;

public class Ex3 {
    private String text;
    public Ex3(String text) {
        this.text = text;
    }
    public int getSize(){
        return text.length();
    }
    public int getSizeWithoutSpaces(){
        return text.length() - text.replaceAll(" ", "").length();
    }
    public int getSizeWithoutSpacesLoop(){
        int spaceCount = 0;
        for (int i = 0; i < text.length() ; i++) {
            if(text.charAt(i) == ' '){
                spaceCount++;
            }
        }
        return spaceCount;
    }

    public static void main(String[] args) {
        Ex3 ex3 = new Ex3("Ala ma kota a kot ma Alędwdwda dsa dsa d dsadsdawsdsadsa dsd sadsa dsaaddsadddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd d");
        System.out.println("Długość napisu: " + ex3.getSize());
        LocalTime tStart = LocalTime.now();
        System.out.println("Ilość spacji: " + ex3.getSizeWithoutSpacesLoop());
        LocalTime tStop = LocalTime.now();
        Duration dt = Duration.between(tStart,tStop);
        System.out.println(dt.getNano());

        LocalTime tStart1 = LocalTime.now();
        System.out.println("Ilość spacji: " + ex3.getSizeWithoutSpaces());
        LocalTime tStop1 = LocalTime.now();
        Duration dt1 = Duration.between(tStart1,tStop1);
        System.out.println(dt1.getNano());
    }
}
