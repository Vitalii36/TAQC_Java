package HW2;


import java.time.LocalDate;
import java.util.Scanner;

public class Person {
    private String name;
    private LocalDate birthYear;

    Person(){

    }

    Person(String name, String birthYear){
        setName(name);
        setBirthYear(birthYear);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthYear(String birthYear) {
        this.birthYear = LocalDate.parse(birthYear);
    }

    public LocalDate getBirthYear() {
        return birthYear;
    }

    public int getAge(){
        int years = (LocalDate.now().getYear() - getBirthYear().getYear());
        if (years < 0) {
            System.out.println("We can't get age. Inputted date more than an actual date!");
        }
        return years;
    }

    public String toString(){
        return "Person name - " +  "'" + this.name + "'" +  " Birth date - " + "'" + this.birthYear + "'";
    }

    void input(){
        Scanner lineScanner = new Scanner(System.in);
        name = lineScanner.nextLine();
        birthYear = LocalDate.parse(lineScanner.nextLine());
    }

    String output(){
        return this.toString();
    }

    public void changeName(String name){
        setName(name);
    }


}