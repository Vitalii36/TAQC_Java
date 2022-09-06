package HW6;

import java.util.*;

public class myCollection {

    public static List<Integer> getThanNum(List<Integer> arr, Integer n){
        List<Integer> newCollectin = new ArrayList<>();
        if (arr != null && !arr.isEmpty()) {
            for (Integer obj : arr) {
                if (obj > n) {
                    newCollectin.add(arr.indexOf(obj));
                }
            }
        }
        return newCollectin;
    }

    public static List<Integer> delThanNum(List<Integer> arr, Integer n){
        List<Integer> newCollectin = new ArrayList<>();
        n = n +1;
        if (arr != null && !arr.isEmpty()) {
            for (Integer obj : arr) {
                if (obj < n) {
                    newCollectin.add(obj);
                }
            }
        }
        return newCollectin;
    }

    public static List<Integer> putNumByIndex(List<Integer> arr, Integer position, Integer elem){
        List<Integer> newCollectin = new ArrayList<>();
        if (arr != null && !arr.isEmpty()) {
            for (Integer obj : arr) {
                if (arr.indexOf(obj) == position) {
                    newCollectin.add(elem);
                    newCollectin.add(obj);
                }
                else {
                    newCollectin.add(obj);
                }
            }
        }
        return newCollectin;
    }

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<Integer>();

        Random rand = new Random();

        for (int i = 0; i < 10; i++){
            arr.add(rand.nextInt(30) - 15);
        }
        System.out.println("New array -     " + arr);
        System.out.println("1 array -     " + getThanNum(arr, 5));
        System.out.println("2 array -     " + delThanNum(arr, 20));
        System.out.println("3 array -     " + putNumByIndex(arr, 5, 111));

    }
}
