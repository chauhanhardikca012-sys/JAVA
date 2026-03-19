package package2;

import package1.Person;

public class TestDifferentPackage {
    public static void main(String[] args) {

        Person p = new Person();

        System.out.println("Public: " + p.name);

        // System.out.println("Protected: " + p.city);
        // System.out.println("Default: " + p.country); 
        // System.out.println("Private: " + p.age); 
    }
}
