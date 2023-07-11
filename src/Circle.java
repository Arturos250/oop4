public class Circle implements GeometricShape{
    private double radius;
    private double pi = 3.14d;

    public double getRadius() {
        return radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    @Override
    public void calculateArea() {
        System.out.println(pi * (radius * radius));
    }

    @Override
    public void calculatePerimeter() {
        System.out.println(2 * pi * radius);
    }
}
