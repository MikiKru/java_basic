package lombok;

import homework.*;
import javaBeans.RGB;


public class Main {
    public static void main(String[] args) {
        AnnotationsLombok annotationsLombok = new AnnotationsLombok("michal","123","MK");
        // jest getter
        System.out.println(annotationsLombok.getLogin());
        // jest setter
        annotationsLombok.setLogin("XXX");
        // jest toString
        System.out.println(annotationsLombok);

        RGB rgb = new RGB(1,2,3);
        System.out.println(rgb);

        User user;
        HW1 hw1;
    }
}
