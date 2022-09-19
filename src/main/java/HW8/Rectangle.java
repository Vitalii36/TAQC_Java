package HW8;

import java.util.Scanner;

public class Rectangle {

    public static String getNumber() {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        String a = myObj.nextLine();
        return a;
    }

    public static Integer checkNumber(Integer num) {
        if (num < 0) {
            throw new RuntimeException("You entered a negative value!");
        }
        return num;
    }

    public static Integer squaredRectangle(Integer a, Integer b) {
        return a * b;
    }
}
