package HW1;

import java.util.*;

public class CalculationAB {
    public static String getNumber() {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        String a = myObj.nextLine();
        return a;
    }
    public static void main(String ... args) {
        System.out.println("Please write first number");
//        String a = getNumber();
        float a =Float.parseFloat(getNumber());
        System.out.println("Please write second number");
//        String b = getNumber();
        float b =Float.parseFloat(getNumber());
        float c = a + b;
        System.out.println("Result - " + c);
    }
}
