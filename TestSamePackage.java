package package1;

public class TestSamePackage {
    public static void main(String[] args) {

        Person p = new Person();

        System.out.println("Public: " + p.name);
        // System.out.println("Private: " + p.age);
        System.out.println("Protected: " + p.city);
        System.out.println("Default: " + p.country);
    }
}
