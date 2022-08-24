package HW3;

public class Main {
    public static void main(String[] args) {
        Eagle eagle1 = new Eagle("Brown", false);
        Swallow swallow1 = new Swallow("Blue", false);
        Penguin penguin1 = new Penguin("Black & White", true);
        Chicken chicken1 = new Chicken("Brown & Red & Green", true);

        System.out.println(eagle1.toString());
        eagle1.fly();
        System.out.println(swallow1.toString());
        swallow1.fly();
        System.out.println(penguin1.toString());
        penguin1.fly();
        System.out.println(chicken1.toString());
        chicken1.fly();
    }
}
