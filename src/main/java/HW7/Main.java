package HW7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {


    public static void main(String[] args) {

        List<String> arr = new ArrayList<String>();
        Scanner lineScanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++){
            System.out.println("1) Enter word number - " + (i +1));
            String name = lineScanner.nextLine();
            arr.add(name);
        }
        System.out.println("Array - " + arr);

        HomeWork7 homeWorkClass = new HomeWork7();
        String result = homeWorkClass.getMaxLengthName(arr);
        System.out.println("Max String word - " + result + " its length = " + result.length());

        String secondWord = homeWorkClass.getSecondReversWord(arr);
        System.out.println("Second word in revers array word - " + secondWord);

        System.out.println("2) Enter sentence please!");
        String sentence = lineScanner.nextLine();
        System.out.println("Result - " + homeWorkClass.delDoubleSpace(sentence));

        System.out.println("3) Enter something with currency please! (Example $12.12)");
        String sentenceCurrency = lineScanner.nextLine();
        System.out.println("Result - " + homeWorkClass.getAllCurrency(sentenceCurrency));

    }
}
