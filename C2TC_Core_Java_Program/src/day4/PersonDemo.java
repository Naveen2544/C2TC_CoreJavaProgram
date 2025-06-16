package day4;

import java.util.Scanner;

public class PersonDemo {

    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);

        String name;
        System.out.println("Enter Person Name: ");
        name = ob.next();

        System.out.println("Enter age: ");
        int age = ob.nextInt();

        System.out.println("Enter gender: ");
        String gender = ob.next();

        System.out.println("Enter taxable income: ");
        int income = ob.nextInt();

        // Person object and initialize values using setter
        Person person = new Person();
        person.setName(name);
        person.setAge(age);
        person.setGender(gender);
        person.setIncome(income);

        // display person details using toString() method
        System.out.println("\nBefore Tax Calculation:");
        System.out.println(person);

        TaxCalculation calc = new TaxCalculation();
        calc.calculateTax(person); // tax calculation

        System.out.println("\nAfter Tax Calculation:");
        System.out.println(person);

        ob.close();
    }
}
