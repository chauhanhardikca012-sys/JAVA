package package1;

public class Person {

    public String name = "Hardik";        // Public
    private int age = 19;                 // Private
    protected String city = "Rajkot";  // Protected
    String country = "India";             // Default

    public void showDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("City: " + city);
        System.out.println("Country: " + country);
    }
}
