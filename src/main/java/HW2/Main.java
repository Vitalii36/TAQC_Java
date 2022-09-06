package HW2;

public class Main {
    public static void main(String[] args) {
//      First test
        Person p1 = new Person();
        p1.setName("Test Person 1");
        p1.setBirthYear("1998-11-07");
        System.out.println(p1.output());

//      Second test
        Person p2 = new Person();
        System.out.println("Input 'name' press enter and input birth date format 'yyyy-mm-dd' press enter:");
        p2.input();
        System.out.println(p2.output());
        System.out.println("Test change name");
        p2.changeName("Test change name");
        System.out.println("Test get name");
        System.out.println("Get person years - " + p2.getAge());

//      Third test
        Person p3 = new Person("Fox", "1990-01-31");
        System.out.println(p3.output());
    }
}
