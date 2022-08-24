package HW3;

public class Main {
    public static void main(String[] args) {
        Eagle eagle1 = new Eagle("Brown", true);
//        Swallow swallow1 = new Swallow("Blue", false);
//        Penguin penguin1 = new Penguin("Black & White", true);
//        Chicken chicken1 = new Chicken("Brown & Red & Green", true);
//        Object[] javaObjectArray = {eagle1, swallow1, penguin1, chicken1};
        Object[] javaObjectArray = {eagle1};
        for (Object obj : javaObjectArray) {
            System.out.println(obj.toString());
            System.out.println(obj.fly());
        }
    }
}
