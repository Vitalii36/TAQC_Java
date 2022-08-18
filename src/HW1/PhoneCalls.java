package HW1;

import java.util.*;

public class PhoneCalls {
    public static String getNumber() {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        String res = myObj.nextLine();
        return res;
    }

    public static Float getSMulti(float a, float b) {
        return a * b;
    }

    public static void main(String... args) {
        System.out.println("Please write price for three different countries are с1, с2 and с3 standard units per minute");
        float c1 = Float.parseFloat(getNumber());
        float c2 = Float.parseFloat(getNumber());
        float c3 = Float.parseFloat(getNumber());
        System.out.println("Please write the time for three different countries c1, c2 and c3 standard units per minute");
        float t1 = Float.parseFloat(getNumber());
        float t2 = Float.parseFloat(getNumber());
        float t3 = Float.parseFloat(getNumber());
//        result
        float res1 = getSMulti(c1, t1);
        float res2 = getSMulti(c2, t2);
        float res3 = getSMulti(c3, t3);
        System.out.println("Result for 1 country - " + res1);
        System.out.println("Result for 2 country - " + res2);
        System.out.println("Result for 3 country - " + res3);
        System.out.println("Result all countries - " + (res1 + res2 + res3));
    }
}
