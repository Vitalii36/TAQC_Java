package HW1;

import java.util.*;

public class CalculationAB {
    public static String getNumber() {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        String a = myObj.nextLine();
        return a;
    }

    public static Float getSum(float a, float b) {
        return a + b;
    }

    public static Float getDif(float a, float b) {
        return a - b;
    }

    public static Float getSMulti(float a, float b) {
        return a * b;
    }

    public static Float getSDiv(float a, float b) {
        return a / b;
    }

    public static void main(String... args) {
        System.out.println("Please write first number");
        float a = Float.parseFloat(getNumber());
        System.out.println("Please write second number");
        float b = Float.parseFloat(getNumber());
        System.out.println("Sum  - " + getSum(a, b));
        System.out.println("Dif - " + getDif(a, b));
        System.out.println("Multi - " + getSMulti(a, b));
        System.out.println("Div - " + getSDiv(a, b));
    }
}
