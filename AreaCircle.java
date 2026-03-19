class Shape {
    void area() {
        System.out.println("Area of shape");
    }
}

class Circle extends Shape {
    double radius;

    Circle(double r) {
        radius = r;
    }
	
    void area() {
        double result = 3.14 * radius * radius;
        System.out.println("Area of Circle = " + result);
    }
}

class Rectangle extends Shape {
    double length, width;

    Rectangle(double l, double w) {
        length = l;
        width = w;
    }
	
    void area() {
        double result = length * width;
        System.out.println("Area of Rectangle = " + result);
    }
}

public class AreaCircle {
    public static void main(String[] args) {
        
        Circle c1 = new Circle(5);
        Rectangle r1 = new Rectangle(4, 6);

        c1.area();   
        r1.area();   
    }
}
