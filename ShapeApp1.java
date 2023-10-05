package inheritanceInterface;

abstract class Shape {
    abstract double area();
    abstract double volume();
}

class Sphere extends Shape {
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return 4 * Math.PI * radius * radius;
    }

    @Override
    double volume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }
}

class Cylinder extends Shape {
    private double radius;
    private double height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    double area() {
        return 2 * Math.PI * radius * (radius + height);
    }

    @Override
    double volume() {
        return Math.PI * radius * radius * height;
    }
}

public class ShapeApp1 {

	public static void main(String[] args) {
        Sphere sphere = new Sphere(5.0);
        Cylinder cylinder = new Cylinder(3.0, 7.0);

        System.out.println("Sphere Area: " + sphere.area());
        System.out.println("Sphere Volume: " + sphere.volume());

        System.out.println("Cylinder Area: " + cylinder.area());
        System.out.println("Cylinder Volume: " + cylinder.volume());
    }
}