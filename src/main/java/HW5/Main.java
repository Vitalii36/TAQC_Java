package HW5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        int arr[] = {-1, 1, 3, -3, -5, -5, 7, 7, 9, 9, -11, 12, 24, -14};

        System.out.println("The biggest number - " + getBiggest(arr));
        System.out.println("Sum of positive number - " + getSumPositive(arr));
        System.out.println("Amount of negative is " + getAmountNegative(arr));

        List<Employee> Employeees = new ArrayList<>();
        Employeees.add(new Employee("Bilbo",1, 123));
        Employeees.add(new Employee("Gendalph",2,234));
        Employeees.add(new Employee("Sem",1,124));
        Employeees.add(new Employee("Saruman",2,342));
        Employeees.add(new Employee("Sauron",3,432));

        System.out.println("Choose Department Number from '1,2,3'");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Integer departmentNumber = Integer.parseInt(s);

        for (Employee obj : Employeees) {
            if (departmentNumber == obj.getDepartmentNumber()) {
                System.out.println(obj.toString());
            }
        }

    }

    public static Integer getBiggest(int[] arr){
        if (arr != null && arr.length > 0) {
            Arrays.sort(arr);
            return arr[arr.length - 1];
        }
        return null;
    }

    public static int getSumPositive(int[] arr){
        int sum = 0;
        if (arr != null && arr.length > 0) {
            for (int num : arr) {
                if (num > 0) {
                    sum += num;
                }
            }
        }

        return sum;
    }

    public static int getAmountNegative(int[] arr){
        int amount = 0;
        if (arr != null && arr.length > 0) {
            for (int num : arr) {
                if (num < 0) {
                    amount++;
                }
            }
        }
        return amount;
    }

}
