package HW5;

import java.time.LocalDate;
import java.util.Scanner;

public class Employee {

    private String name;
    private Integer departmentNumber;
    private Integer salary;

    Employee() {
    }

    Employee(String name, Integer departmentNumber, Integer salary) {
        setName(name);
        setDepartmentNumber(departmentNumber);
        setSalary(salary);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartmentNumber(Integer departmentNumber) {
        this.departmentNumber = departmentNumber;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public Integer getDepartmentNumber() {
        return departmentNumber;
    }

    public Integer getSalary() {
        return salary;
    }

    public String toString() {
        return " Person name - " + "'" + name + "'" +
                " Department - " + "'" + departmentNumber + "'" +
                " Salary - " + "'" + salary + "'";
    }

    String output() {
        return this.toString();
    }


}
