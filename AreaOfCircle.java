// Define the Shape interface
//Define an Interface Shape with abstract method area(). Write a java program to calculate an area of Circle and Sphere.(use final keyword)

interface Shape {
    double area();
}

// Create a Circle class that implements the Shape interface
class Circle implements Shape {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

// Create a Sphere class that implements the Shape interface
class Sphere implements Shape {
    private final double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return 4 * Math.PI * radius * radius;
    }
}

public class AreaOfCircle {
    public static void main(String[] args) {
        // Create a Circle and calculate its area
        Circle circle = new Circle(5.0);
        System.out.println("Area of Circle: " + circle.area());

        // Create a Sphere and calculate its surface area
        Sphere sphere = new Sphere(3.0);
        System.out.println("Surface Area of Sphere: " + sphere.area());
    }
}
