package bigNumbers;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigNumbers {
    public static void main(String[] args) {
//        long number = 5555555555555555555555555;
        BigInteger bigInteger1 = new BigInteger("555");
        BigInteger bigInteger2 = new BigInteger("222");

        // metody klasy big integer
        BigInteger bigIntegerAdd = bigInteger1.add(bigInteger2);
        BigInteger bigIntegerSub = bigInteger1.subtract(bigInteger2);
        BigInteger bigIntegerMulti = bigInteger1.multiply(bigInteger2);
        BigInteger bigIntegerDiv = bigInteger1.divide(bigInteger2);
        System.out.println(bigIntegerAdd);
        System.out.println(bigIntegerSub);
        System.out.println(bigIntegerMulti);
        BigDecimal bigDecimal1 = new BigDecimal(bigInteger1);
        BigDecimal bigDecimal2 = new BigDecimal(bigInteger2);
        System.out.println("===================");
        System.out.println(bigDecimal1);
        System.out.println(bigDecimal2);
        System.out.println(bigDecimal1.divide(bigDecimal2));
        System.out.println("====================");


        BigDecimal bigDecimal = new BigDecimal("22222.22222222222222222222222222");
        System.out.println(bigDecimal.add(new BigDecimal("1111111111111111")));



    }
}
