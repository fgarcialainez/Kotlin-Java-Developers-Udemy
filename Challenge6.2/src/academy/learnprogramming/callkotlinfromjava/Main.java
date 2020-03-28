package academy.learnprogramming.callkotlinfromjava;

import academy.learnprogramming.kotlincode.Challenge;
import academy.learnprogramming.kotlincode.Employee;
import academy.learnprogramming.kotlincode.KotlinStuff;

public class Main {

    public static void main(String[] args) {

        KotlinStuff.sayHelloToJava("Student");

        Employee employee = new Employee("John", "Smith", 2010);
        employee.startYear = 2009;

        Challenge.doMath(5, 4);

        employee.takesDefault("arg1");
    }
}