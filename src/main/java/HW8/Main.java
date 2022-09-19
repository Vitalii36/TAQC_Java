package HW8;

public class Main {

    public static void main(String... args) {

        Rectangle classRectangle = new Rectangle();
        System.out.println("Please write first number");
        Integer a = Integer.parseInt(classRectangle.getNumber());
        System.out.println("Please write second number");
        Integer b = Integer.parseInt(classRectangle.getNumber());
        Integer squared = classRectangle.squaredRectangle(classRectangle.checkNumber(a),classRectangle.checkNumber(a));
        System.out.println("Squared rectangle = " + squared);
    }

}
